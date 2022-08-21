package com.example.listofaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetAllAccounts userAccounts = new GetAllAccounts();
        ArrayList<String> result = userAccounts.getAccountsOfDevice(this);
        String update_result = String.join(",", result);
        TextView textView = (TextView) findViewById(R.id.textViewOfAccounts);
        textView.setText(update_result);

        
    }
}