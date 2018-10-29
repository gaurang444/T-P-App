package com.example.muska.tp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        final PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("file8.pdf").load();
    }
}
