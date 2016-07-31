package com.example.manoel.exemplosrelativelayout;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.coderefer.androidsplashscreenexample.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    ImageButton Btn1;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Btn1 = (ImageButton) findViewById(R.id.img44);
        ImageButton Btn2 = (ImageButton) findViewById(R.id.img10);
        ImageButton Btn3 = (ImageButton) findViewById(R.id.img12);
        ImageButton Btn4 = (ImageButton) findViewById(R.id.img18);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mona = new Intent(MainActivity.this, ArteActivity.class);
                startActivity(mona);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gelo = new Intent(MainActivity.this, ArteMordernaActivity.class);
                startActivity(gelo);
            }

        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geek = new Intent(MainActivity.this, GeekActivity.class);
                startActivity(geek);
            }
        });

    Btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent escrita = new Intent(MainActivity.this, ArteEscritaActivity.class);
            startActivity(escrita);
        }
    });




    }
}