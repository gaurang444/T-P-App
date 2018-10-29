package com.example.muska.tp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ShowJobs extends AppCompatActivity {




    ListView listViewJobs;
    List<CompanyInformation> companyList;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jobs);

        listViewJobs = (ListView)findViewById(R.id.listViewJobs);
        companyList = new ArrayList<>();

        databaseReference = FirebaseDatabase.getInstance().getReference("jobs").child("jobs");
    }


    @Override
    protected void onStart() {
        super.onStart();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                companyList.clear();

                for(DataSnapshot jobSnapshot : dataSnapshot.getChildren()){
                    CompanyInformation company = jobSnapshot.getValue(CompanyInformation.class);
                    companyList.add(company);
                }

                JobsList adapter = new JobsList(ShowJobs.this, companyList);
                listViewJobs.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
