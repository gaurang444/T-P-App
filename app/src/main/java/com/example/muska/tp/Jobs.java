package com.example.muska.tp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;

import java.util.ArrayList;
import java.util.List;

public class Jobs extends AppCompatActivity implements View.OnClickListener {

    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;
    private EditText editTextCompanyName, editTextJobName, editTextStipend, editTextJobType, editTextCGPA;
    private Button buttonSave,buttonShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);


        databaseReference = FirebaseDatabase.getInstance().getReference("jobs");
        editTextCompanyName = (EditText)findViewById(R.id.companyName);
        editTextStipend = (EditText)findViewById(R.id.editTextStipend);
        editTextJobType = (EditText)findViewById(R.id.editTextjobType);
        editTextCGPA = (EditText)findViewById(R.id.editTextCGPA);
        editTextJobName = (EditText)findViewById(R.id.jobName);
        buttonSave = (Button)findViewById(R.id.databaseButton);
        buttonShow = (Button)findViewById(R.id.showJobsButton);
        buttonSave.setOnClickListener(this);
        buttonShow.setOnClickListener(this);

    }



    private void saveCompanyInformation(){
        String companyName = editTextCompanyName.getText().toString().trim();
        String jobName = editTextJobName.getText().toString().trim();
        String stipend = editTextStipend.getText().toString().trim();
        String jobType = editTextJobType.getText().toString().trim();
        String CGPA = editTextCGPA.getText().toString().trim();

        CompanyInformation companyInformation = new CompanyInformation(companyName,jobName,stipend,jobType,CGPA);

        databaseReference.child("jobs").push().setValue(companyInformation);
        Toast.makeText(this,"Information saved...",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v){
        if(v == buttonSave){
            saveCompanyInformation();
        }
        if(v == buttonShow){
            startActivity(new Intent(Jobs.this, ShowJobs.class));
        }
    }

}
