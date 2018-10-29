package com.example.muska.tp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        final PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("file7.pdf").load();
    }
}
