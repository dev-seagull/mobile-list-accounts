package com.example.listofaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OutlookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outlook);
        getSupportActionBar().setTitle("Outlook accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}