package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class homePage_Setting extends AppCompatActivity {

    private TextView tvAccountSettings;
    private  TextView tvHelpSettings;
    private TextView tvTermsSettings;
    private ImageView ivCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page__setting);
        tvAccountSettings = findViewById(R.id.textViewAccount_settings);
        tvHelpSettings = findViewById(R.id.textViewHelp_settings);
        tvTermsSettings = findViewById(R.id.tVsettings_Info);
        ivCancel = findViewById(R.id.SettingsCrossview);

        tvAccountSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePage_Setting.this,Account.class);
                startActivity(intent);
            }
        });

        ivCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvHelpSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePage_Setting.this,Support.class);
                startActivity(intent);
            }
        });

        tvTermsSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePage_Setting.this,Info_terms.class);
                startActivity(intent);
            }
        });


    }
}