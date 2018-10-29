package com.example.muska.tp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ShowExperience extends AppCompatActivity {
    ListView explist;
    List<experience> experList;
   private DatabaseReference databasereference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_experience);

        explist = (ListView) findViewById(R.id.explist);
        experList = new ArrayList<>();
        databasereference = FirebaseDatabase.getInstance().getReference("experience").child("experience");

    }

    @Override
    protected void onStart(){
        super.onStart();
        databasereference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                experList.clear();
                for(DataSnapshot expSnap: dataSnapshot.getChildren()){
                    experience exp1 = expSnap.getValue(experience.class);
                    experList.add(exp1);
                }

                ExperienceList adapter = new ExperienceList(ShowExperience.this, experList);
                explist.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
