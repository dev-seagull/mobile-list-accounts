package com.example.listofaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);
        getSupportActionBar().setTitle("Spotify accounts");
    }
}