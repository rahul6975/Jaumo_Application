package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Profession extends AppCompatActivity {
    Button btn_save;
    EditText et_profession;
    ImageView btn_cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profession);
        initUI();
    }

    private void initUI() {
        btn_cross = findViewById(R.id.btn_cross);
        et_profession = findViewById(R.id.et_profession);
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
                if (isValidProfession()) {
                    gotoCompleteProfile();
                }
            }
        });

    }

    private boolean isValidProfession() {
        boolean isValid = true;
        if (et_profession.getText().toString().isEmpty()) {
            et_profession.setError("Please enter profession");
            isValid = false;
        }
        return isValid;
    }

    private void gotoCompleteProfile() {
        Intent i = new Intent(Profession.this, CompleteProfileActivity.class);
        i.putExtra("profession", et_profession.getText().toString());
        startActivity(i);
    }
}