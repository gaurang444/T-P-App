package com.example.muska.tp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CorporateLinkages extends AppCompatActivity {

    ListView list;
    String[] web = {
            "  Amazon",
            "  Buy Hatke",
            "  Byju's",
            "  Adobe",
            "  Capital First",
            "  Car Dekho",
            "  Cause Code",
            "  Delhivery",
            "  Directi",
            "  doSelect",
            "  EPAM",
            "  EVIVE",
            "  Exotel",
            "  Formsept",
            "  Gapoon",
            "  Global Logic"
    } ;
    Integer[] imageId = {
            R.drawable.amazon,
            R.drawable.buyhatke,
            R.drawable.byju,
            R.drawable.adobe,
            R.drawable.capitalfirst,
            R.drawable.cardekho,
            R.drawable.cc,
            R.drawable.delhivery,
            R.drawable.directi,
            R.drawable.doselect,
            R.drawable.epam,
            R.drawable.evive,
            R.drawable.exotel,
            R.drawable.formcept,
            R.drawable.gapoon,
            R.drawable.globallogic
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_linkages);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Custom_List adapter = new
                Custom_List(CorporateLinkages.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(CorporateLinkages.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }

}