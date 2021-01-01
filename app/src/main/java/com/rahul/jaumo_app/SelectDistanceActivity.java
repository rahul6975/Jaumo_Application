package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SelectDistanceActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ImageView btn_cross;
    RadioButton rb_10,rb_25,rb_50,rb_100,rb_250,rb_500,rb_1000,rb_distance_matter;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_distance);
        initUI();
    }

    private void initUI() {
        btnSave = findViewById(R.id.btn_save);
        btn_cross = findViewById(R.id.btn_cross);
        rb_10=findViewById(R.id.rb_10);
        rb_25=findViewById(R.id.rb_25);
        rb_50=findViewById(R.id.rb_50);
        rb_100=findViewById(R.id.rb_100);
        rb_250=findViewById(R.id.rb_250);
        rb_500=findViewById(R.id.rb_500);
        rb_1000=findViewById(R.id.rb_1000);
        rb_distance_matter=findViewById(R.id.rb_distance_matter);

        rb_10.setOnCheckedChangeListener(this);
        rb_25.setOnCheckedChangeListener(this);
        rb_50.setOnCheckedChangeListener(this);
        rb_100.setOnCheckedChangeListener(this);
        rb_250.setOnCheckedChangeListener(this);
        rb_500.setOnCheckedChangeListener(this);
        rb_1000.setOnCheckedChangeListener(this);
        rb_distance_matter.setOnCheckedChangeListener(this);


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
            if (buttonView.getId() == R.id.rb_10) {
                rb_25.setChecked(false);
                rb_50.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_25) {
                rb_10.setChecked(false);
                rb_50.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_50) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_100) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_50.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_250) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_100.setChecked(false);
                rb_50.setChecked(false);
                rb_500.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_500) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_50.setChecked(false);
                rb_1000.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_1000) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_50.setChecked(false);
                rb_distance_matter.setChecked(false);

            }
            if (buttonView.getId() == R.id.rb_distance_matter) {
                rb_10.setChecked(false);
                rb_25.setChecked(false);
                rb_100.setChecked(false);
                rb_250.setChecked(false);
                rb_500.setChecked(false);
                rb_50.setChecked(false);
                rb_1000.setChecked(false);

            }

        }

    }
}