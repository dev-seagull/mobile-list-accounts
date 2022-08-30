package com.example.listofaccounts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        getSupportActionBar().setTitle("Google accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GetAllAccounts userAccounts = new GetAllAccounts();
        ArrayList<String> result = userAccounts.getAccountsOfDevice("com.google", this);
        String update_result = String.join(",", result);

        TextView textView = (TextView) findViewById(R.id.textView_google_accounts);
        textView.setText(update_result);
        textView.setBackgroundColor(Color.parseColor("#12C4DC"));

        TextView textView_title = (TextView) findViewById(R.id.textView_google);
        textView_title.setBackgroundColor(Color.parseColor("#37DC12"));
    }
}