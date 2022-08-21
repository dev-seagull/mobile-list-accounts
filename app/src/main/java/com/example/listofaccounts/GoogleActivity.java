package com.example.listofaccounts;

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
        ArrayList<String> result = userAccounts.getAccountsOfDevice(this);
        String update_result = String.join(",", result);
        //setContentView(R.layout.activity_google);

        TextView textView = (TextView) findViewById(R.id.textView_google_accounts);
        textView.setText(update_result);
    }
}