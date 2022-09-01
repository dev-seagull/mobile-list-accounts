package com.example.listofaccounts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class WhatsappActivity extends AppCompatActivity {
    private String type = "com.whatsapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        getSupportActionBar().setTitle("Whatsapp accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GetAllAccounts whatsappAccounts = new GetAllAccounts();
        ArrayList<String> listOfWhatsappAccounts = whatsappAccounts.getAccountsOfDevice( type, this);
        String result = String.join(",", listOfWhatsappAccounts);

        TextView textView = (TextView) findViewById(R.id.textView_whatsapp_accounts);
        textView.setText(result);
        textView.setBackgroundColor(Color.parseColor("#12C4DC"));

        TextView textView_title = (TextView) findViewById(R.id.textView_whatsapp);
        textView_title.setBackgroundColor(Color.parseColor("#37DC12"));
    }
}