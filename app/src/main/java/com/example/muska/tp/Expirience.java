package com.example.muska.tp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Expirience extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueId = 423156;

    EditText exp;
    EditText nameofstu;
    EditText company;
    EditText batch;
    Button submit;
    Button show;
    DatabaseReference exps;

    String tit = "A new Job is added !!";
    String body = "visit app for more details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expirience);

        exps = FirebaseDatabase.getInstance().getReference("experience");

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        exp = (EditText) findViewById(R.id.addexp);
        nameofstu = (EditText) findViewById(R.id.name);
        company = (EditText) findViewById(R.id.company);
        batch = (EditText) findViewById(R.id.batch);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addExp();
                appNotification();
                nameofstu.setText("");
                exp.setText("");
                company.setText("");
                batch.setText("");
            }
        });

    }

    private void addExp(){
        String exper = exp.getText().toString();
        String nameofstudent = nameofstu.getText().toString();
        String companyn = company.getText().toString();
        String year = batch.getText().toString();

        if(!TextUtils.isEmpty(exper)){

            experience exps1 = new experience(exper,nameofstudent,companyn,year);
            exps.child("experience").push().setValue(exps1);
            Toast.makeText(this, "Experience added", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Enter exp", Toast.LENGTH_LONG).show();
        }

    }

    private void appNotification(){

        notification.setSmallIcon(R.drawable.ic_launcher);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(tit);
        notification.setContentText(body);

        Intent its = new Intent(this, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this,0, its, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pi);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueId, notification.build());
    }
}
