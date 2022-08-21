package com.example.listofaccounts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button google_button;
    private Button outlook_button;
    private Button spotify_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        google_button = (Button) findViewById(R.id.button_google);
        google_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleActivity();
            }
        });

        outlook_button = (Button) findViewById(R.id.button_outlook);
        outlook_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOutlookActivity();
            }
        });

        spotify_button = (Button) findViewById(R.id.button_spotify);
        spotify_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpotifyActivity();
            }
        });

        GetAllAccounts userAccounts = new GetAllAccounts();
        ArrayList<String> result = userAccounts.getAccountsOfDevice(this);
        String update_result = String.join(",", result);
        //setContentView(R.layout.activity_google);

        TextView textView = (TextView) findViewById(R.id.textViewOfAccounts);
        textView.setText(update_result);
        ImageView LogoImageView = (ImageView) findViewById(R.id.imageView_logo);
        LogoImageView.setImageResource(R.drawable.seagull_logo_2);


    }

    public void openGoogleActivity() {
        Intent intent = new Intent(this, GoogleActivity.class);
        startActivity(intent);
    }

    public void openOutlookActivity() {
        Intent intent = new Intent(this, OutlookActivity.class);
        startActivity(intent);
    }

    public void openSpotifyActivity() {
        Intent intent = new Intent(this, SpotifyActivity.class);
        startActivity(intent);
    }








}