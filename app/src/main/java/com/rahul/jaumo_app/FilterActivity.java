package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FilterActivity extends AppCompatActivity {
    ImageView crossview;
    LinearLayout ll_gender, ll_age, ll_distance, ll_country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        initUI();
    }

    private void initUI() {
        crossview = findViewById(R.id.crossview);
        ll_gender = findViewById(R.id.ll_gender);
        ll_age = findViewById(R.id.ll_age);
        ll_distance = findViewById(R.id.ll_distance);
        ll_country = findViewById(R.id.ll_country);
        crossview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ll_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSelectGender();
            }
        });
        ll_distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSelectDistance();
            }
        });
        ll_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSelectCountry();
            }
        });
    }

    private void gotoSelectDistance() {
        Intent intent = new Intent(FilterActivity.this, SelectDistanceActivity.class);
        startActivity(intent);
    }

    private void gotoSelectCountry() {
        Intent intent = new Intent(FilterActivity.this, SelectCountryActivity.class);
        startActivity(intent);
    }

    private void gotoSelectGender() {
        Intent intent = new Intent(FilterActivity.this, SelectGenderActivity.class);
        startActivity(intent);
    }
}