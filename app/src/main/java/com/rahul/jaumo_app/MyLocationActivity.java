package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MyLocationActivity extends AppCompatActivity {
    Button btn_save;
    ImageView btn_cross;
    EditText et_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_location);
        initUI();
    }

    private void initUI() {
        btn_cross = findViewById(R.id.btn_cross);
        et_location = findViewById(R.id.et_location);
        btn_save = findViewById(R.id.btn_save);
        btn_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValidLocation()) {
                    gotoCompleteProfiePage();
                }
            }
        });
    }

    private boolean isValidLocation() {
        boolean isValid = true;
        if (et_location.getText().toString().isEmpty()) {
            et_location.setError("Please enter location");
            isValid = false;
        }
        return isValid;
    }


    private void gotoCompleteProfiePage() {
        Intent intent = new Intent(MyLocationActivity.this, CompleteProfileActivity.class);
        intent.putExtra("location", et_location.getText().toString());
        startActivity(intent);
    }
}