package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SelectLookingFor extends AppCompatActivity {
    ImageView btn_cross;
    EditText et_iwant, et_gender, et_age;
    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_looking_for);
        initUI();
    }

    private void initUI() {
        btn_cross = findViewById(R.id.btn_cross);
        et_age = findViewById(R.id.et_age);
        et_gender = findViewById(R.id.et_gender);
        et_iwant = findViewById(R.id.et_iwant);
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
                if (isValidData()) {
                    gotoCompleteProfiePage();
                }
            }
        });

    }

    private boolean isValidData() {
        boolean isvalid = true;
        if (et_iwant.getText().toString().isEmpty()) {
            et_iwant.setError("Please enter your preference");
            isvalid = false;
        }
        if (et_gender.getText().toString().isEmpty()) {
            et_gender.setError("Please enter gender");
            isvalid = false;
        }
        if (et_age.getText().toString().isEmpty()) {
            et_iwant.setError("Please enter  age");
            isvalid = false;
        }
        return isvalid;
    }

    private void gotoCompleteProfiePage() {
        Intent intent = new Intent(SelectLookingFor.this, CompleteProfileActivity.class);
        String data = et_age.getText().toString() + " - " + et_gender.getText().toString() + " - " + et_iwant.getText().toString();
        intent.putExtra("data", data);
        startActivity(intent);
    }
}