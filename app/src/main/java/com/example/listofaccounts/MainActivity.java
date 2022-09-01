package com.example.listofaccounts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button google_button;
    private Button telegram_button;
    private Button whatsapp_button;
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

        telegram_button = (Button) findViewById(R.id.button_telegram);
        telegram_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openTelegramActivity(); }
        });

        whatsapp_button = (Button) findViewById(R.id.button_whatsapp);
        whatsapp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openWhatsappActivity();}
        });

        ImageView LogoImageView = (ImageView) findViewById(R.id.imageView_logo);
        LogoImageView.setImageResource(R.drawable.seagull_logo_2);


    }

    public void openGoogleActivity() {
        Intent intent = new Intent(this, GoogleActivity.class);
        startActivity(intent);
    }

    public void openTelegramActivity() {
        Intent intent = new Intent(this, TelegramActivity.class);
        startActivity(intent);
    }

    public void openWhatsappActivity() {
        Intent intent = new Intent(this, WhatsappActivity.class);
        startActivity(intent);
    }

}