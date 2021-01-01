package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SelectGenderActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ImageView btn_cross;
    private Button btnSave;
    RadioButton rb_male,rb_female,rb_female_male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gender);
        initUI();
    }

    private void initUI() {
        btnSave = findViewById(R.id.btn_save);
        btn_cross=findViewById(R.id.btn_cross);
        rb_female_male=findViewById(R.id.rb_female_male);
        rb_female=findViewById(R.id.rb_female);
        rb_male=findViewById(R.id.rb_male);

        rb_male.setOnCheckedChangeListener(this);
        rb_female.setOnCheckedChangeListener(this);
        rb_female_male.setOnCheckedChangeListener(this);
        btn_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            if (buttonView.getId() == R.id.rb_male) {
                rb_female.setChecked(false);
                rb_female_male.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_female) {
                rb_male.setChecked(false);
                rb_female_male.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_female_male) {
                rb_female.setChecked(false);
                rb_male.setChecked(false);

            }
        }
    }
}