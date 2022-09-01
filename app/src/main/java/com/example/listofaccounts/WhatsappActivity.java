package com.example.listofaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WhatsappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        getSupportActionBar().setTitle("Whatsapp accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}