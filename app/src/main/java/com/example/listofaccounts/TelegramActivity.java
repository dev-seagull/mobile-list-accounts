package com.example.listofaccounts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class TelegramActivity extends AppCompatActivity {
    private String type = "org.telegram.messanger";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram);
        getSupportActionBar().setTitle("Telegram accounts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GetAllAccounts telegramAccounts = new GetAllAccounts();
        ArrayList<String> listOfTelegramAccounts = telegramAccounts.getAccountsOfDevice( type, this);
        String result = String.join(",", listOfTelegramAccounts);

        TextView textView = (TextView) findViewById(R.id.textView_telegram_accounts);
        textView.setText(result);
        textView.setBackgroundColor(Color.parseColor("#12C4DC"));

        TextView textView_title = (TextView) findViewById(R.id.textView_telegram);
        textView_title.setBackgroundColor(Color.parseColor("#37DC12"));
    }
}