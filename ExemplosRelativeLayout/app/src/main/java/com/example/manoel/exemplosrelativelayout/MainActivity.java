package com.example.manoel.exemplosrelativelayout;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.coderefer.androidsplashscreenexample.R;

public class MainActivity extends AppCompatActivity {

    ImageButton Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Btn1 = (ImageButton) findViewById(R.id.img44);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mona = new Intent(MainActivity.this, ArteActivity.class);
                startActivity(mona);
            }
        });


    }
}