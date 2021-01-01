package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompleteProfileActivity extends AppCompatActivity {
    LinearLayout ll_hometown;
    TextView hometown;
    private ImageView ivSetIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);

        ivSetIcon = findViewById(R.id.profile_img);
        initUI();
        fillData();
        if (getIntent() != null && getIntent().getExtras() != null) {
            String gender = getIntent().getStringExtra("Gender");
            if (gender != null && (!gender.isEmpty())) {
                if (gender.contains("Female")) {
                    ivSetIcon.setImageResource(R.drawable.ic_girl);
                } else if (gender.contains("Male")) {
                    ivSetIcon.setImageResource(R.drawable.ic_boy);
                }
            }
        }
    }

    private void fillData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            hometown.setText(getIntent().getStringExtra("location"));
        }
    }

    private void initUI() {
        hometown = findViewById(R.id.hometown);
        ll_hometown = findViewById(R.id.ll_hometown);
        ll_hometown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMylocation();
            }
        });
    }

    private void gotoMylocation() {
        Intent intent = new Intent(CompleteProfileActivity.this, MyLocationActivity.class);
        startActivity(intent);
    }
}