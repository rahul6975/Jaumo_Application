package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class CompleteProfileActivity extends AppCompatActivity {

    private ImageView ivSetIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);

        ivSetIcon = findViewById(R.id.profile_img);
        if(getIntent()!=null && getIntent().getExtras()!=null) {
            String gender = getIntent().getStringExtra("Gender");

            if (gender.contains("Male")) {
                ivSetIcon.setImageResource(R.drawable.ic_boy);
            } else if (gender.contains("Female")) {
                ivSetIcon.setImageResource(R.drawable.ic_girl);
            }
        }
    }
}