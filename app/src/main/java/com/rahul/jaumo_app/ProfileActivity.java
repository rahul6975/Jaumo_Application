package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvCompleteProfile;
    private TextView tvSentLike;
    private ImageView ivHome;
    private ImageView ivLocation;
    private ImageView ivHeart;
    private  ImageView ivChat;
    private  ImageView ivSetIcon;
    private  TextView tvSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvCompleteProfile = findViewById(R.id.tv_complete_profile);
        tvSentLike = findViewById(R.id.tvSentLikes);
        ivHome = findViewById(R.id.ibRefresh);
        ivLocation = findViewById(R.id.ibLocation);
        ivHeart = findViewById(R.id.ibHeart);
        ivChat = findViewById(R.id.ibChat);
        tvSettings = findViewById(R.id.tvSettings);
        ivSetIcon = findViewById(R.id.ivSetIcon);

        String genderFromSignUp = getIntent().getStringExtra("Gender");
        if(genderFromSignUp.contains("Male"))
        {
            ivSetIcon.setImageResource(R.drawable.ic_man);
        }
        else if(genderFromSignUp.contains("Female"))
        {
            ivSetIcon.setImageResource(R.drawable.ic_woman);
        }


        ivChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,messages.class);
                startActivity(intent);
            }
        });

        tvCompleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(genderFromSignUp.contains("Male")) {
                    Intent intent = new Intent(ProfileActivity.this, CompleteProfileActivity.class);
                    intent.putExtra("Gender","Male");
                    startActivity(intent);
                }
                else if(genderFromSignUp.contains("Female")) {
                    Intent intent = new Intent(ProfileActivity.this, CompleteProfileActivity.class);
                    intent.putExtra("Gender","Female");
                    startActivity(intent);
                }
            }
        });
        tvSentLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,Sent_Activity.class);
                startActivity(intent);
            }
        });
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,"Nobody liked your profile yet",Toast.LENGTH_LONG).show();
            }
        });

        tvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, homePage_Setting.class);
                startActivity(intent);
            }
        });

    }
}