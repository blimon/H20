package com.belen.android.h20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap(View view) {
        Intent i = new Intent(this, GoogleMapsActivity.class);
        startActivity(i);
    }

    public void openInfo(View view) {
        Intent i = new Intent(this, InformationActivity.class);
        startActivity(i);
    }
}