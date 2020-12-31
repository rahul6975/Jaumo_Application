package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gender extends AppCompatActivity {

    private Button btnMale;
    private Button btnFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        // there are two buttons male and female and onClick on each button month page will be called

        btnMale = findViewById(R.id.btn2_Gender_men);
        btnFemale = findViewById(R.id.btn1_Gender_women);

        btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gender.this, Age_Activity.class);
                startActivity(intent);
            }
        });

        btnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gender.this, Age_Activity.class);
                startActivity(intent);
            }
        });

    }
}