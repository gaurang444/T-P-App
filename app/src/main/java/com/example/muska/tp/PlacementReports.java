package com.example.muska.tp;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import org.w3c.dom.Text;

public class PlacementReports extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_reports);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Placement Drive Reports");

        Button Amazon = (Button) findViewById(R.id.button);
        Amazon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity2.class));
            }
        });

        Button OYO = (Button) findViewById(R.id.button2);
        OYO.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity3.class));
            }
        });

        Button Whatfix = (Button) findViewById(R.id.button3);
        Whatfix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity4.class));
            }
        });

        Button GoJek = (Button) findViewById(R.id.button4);
        GoJek.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity5.class));
            }
        });

        Button Adobe = (Button) findViewById(R.id.button5);
        Adobe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity6.class));
            }
        });

        Button Postman = (Button) findViewById(R.id.button6);
        Postman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity7.class));
            }
        });

        Button Delhivery = (Button) findViewById(R.id.button7);
        Delhivery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity8.class));
            }
        });

        Button ION = (Button) findViewById(R.id.button8);
        ION.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity9.class));
            }
        });

        Button PharmEasy = (Button) findViewById(R.id.button9);
        PharmEasy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity10.class));
            }
        });

        Button IBM = (Button) findViewById(R.id.button10);
        IBM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlacementReports.this, MainActivity11.class));
            }
        });
    }
}
