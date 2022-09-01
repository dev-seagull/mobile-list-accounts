package com.example.listofaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelegramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram);
        getSupportActionBar().setTitle("Telegram accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}