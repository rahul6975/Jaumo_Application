package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SelectCountryActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Button btnSave;
    ImageView btn_cross;
    RadioButton rb_all, rb__my_country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_country);

        btnSave = findViewById(R.id.btn_save);
        btn_cross = findViewById(R.id.btn_cross);
        rb__my_country = findViewById(R.id.rb__my_country);
        rb_all = findViewById(R.id.rb_all);
        rb_all.setOnCheckedChangeListener(this);
        rb__my_country.setOnCheckedChangeListener(this);


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
            if (buttonView.getId() == R.id.rb_all) {
                rb__my_country.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb__my_country) {
                rb_all.setChecked(false);

            }
        }
    }
}