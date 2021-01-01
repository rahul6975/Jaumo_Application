package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvCompleteProfile;
    private TextView tvSentLike;
    LinearLayout btn_ll_completeprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvCompleteProfile = findViewById(R.id.tv_complete_profile);
        tvSentLike = findViewById(R.id.tvSentLikes);
        btn_ll_completeprofile=findViewById(R.id.btn_ll_completeprofile);

        btn_ll_completeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this,CompleteProfileActivity.class);
                startActivity(intent);
            }
        });

        tvCompleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,CompleteProfileActivity.class);
                startActivity(intent);
            }
        });

        tvSentLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,Sent_Activity.class);
                startActivity(intent);
            }
        });

    }
}