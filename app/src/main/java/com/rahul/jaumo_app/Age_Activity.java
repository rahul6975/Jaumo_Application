package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Age_Activity extends AppCompatActivity {

    private Button btnAge;
    private EditText etMonth;
    private EditText etDay;
    private EditText etYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_);

        etDay = findViewById(R.id.etDate_day);
        etMonth = findViewById(R.id.etDate_month);
        etYear = findViewById(R.id.etDate_year);

        btnAge = findViewById(R.id.btn_ageActivity);

        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateAge()) {
                    Intent intent = new Intent(Age_Activity.this, Location.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean validateAge() {
        boolean age = true;
        int day = Integer.parseInt(etDay.getText().toString());
        int month = Integer.parseInt(etMonth.getText().toString());
        int year = Integer.parseInt(etYear.getText().toString());

        if (day <= 0 || day > 31) {
            etDay.setError("Enter a valid day");
            age = false;
        }
        if (month < 1 || month > 12) {
            etMonth.setError("Enter a valid month");
            age = false;
        }
        if (year < 1900 || year > 2020) {
            etYear.setError("Enter a valid year");
            age = false;
        }
        return age;


    }
}