package com.example.muska.tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Form extends AppCompatActivity {

    EditText JName, CName, Stipend, JType, CGPA, Skill1, Skill2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        JName = (EditText) findViewById(R.id.editText2);
        CName = (EditText) findViewById(R.id.editText3);
        Stipend = (EditText) findViewById(R.id.editText4);
        JType = (EditText) findViewById(R.id.editText5);
        CGPA = (EditText) findViewById(R.id.editText6);
        Skill1 = (EditText) findViewById(R.id.editText7);
        Skill2 = (EditText) findViewById(R.id.editText8);
    }

    public void AddJob()
    {

    }
}
