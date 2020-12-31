package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interest extends AppCompatActivity {

    private Button btnMan;
    private Button btnWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        btnMan = findViewById(R.id.btn1_Interest_men);
        btnWomen = findViewById(R.id.btn2_Interest_women);

        btnMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Interest.this, Home_Page.class);
                startActivity(intent);
            }
        });

        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Interest.this, Home_Page_Women.class);
                startActivity(intent);
            }
        });


    }
}