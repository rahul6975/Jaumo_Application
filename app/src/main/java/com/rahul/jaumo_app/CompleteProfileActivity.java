package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompleteProfileActivity extends AppCompatActivity {
    LinearLayout ll_hometown, ll_profession, ll_looking_for;
    TextView hometown, profession, looking_for;
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

            profession.setText(getIntent().getStringExtra("profession"));

            looking_for.setText(getIntent().getStringExtra("data"));
        }
    }

    private void initUI() {
        hometown = findViewById(R.id.hometown);
        ll_hometown = findViewById(R.id.ll_hometown);
        looking_for = findViewById(R.id.looking_for);
        ll_looking_for = findViewById(R.id.ll_looking_for);
        ll_profession = findViewById(R.id.ll_profession);
        profession = findViewById(R.id.profession);

        ll_hometown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMylocation();
            }
        });

        ll_profession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMyProfession();
            }
        });
        ll_looking_for.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLookingFor();
            }

        });
    }

    private void gotoMyProfession() {
        Intent intent = new Intent(CompleteProfileActivity.this, Profession.class);
        startActivity(intent);
    }


    private void gotoMylocation() {
        Intent intent = new Intent(CompleteProfileActivity.this, MyLocationActivity.class);
        startActivity(intent);
    }

    private void gotoLookingFor() {
        Intent intent = new Intent(CompleteProfileActivity.this, SelectLookingFor.class);
        startActivity(intent);
    }
}