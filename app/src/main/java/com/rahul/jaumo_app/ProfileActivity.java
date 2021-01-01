package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvCompleteProfile;
    private TextView tvSentLike;
    LinearLayout btn_ll_completeprofile;
    private ImageView ivHome;
    private ImageView ivLocation;
    private ImageView ivHeart;
    private ImageView ivChat;
    private ImageView ivSetIcon;
    private TextView tvSettings;
    private Button btnVip;
    private TextView tvCoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvCompleteProfile = findViewById(R.id.tv_complete_profile);
        tvCoins = findViewById(R.id.tv_coins);
        tvSentLike = findViewById(R.id.tvSentLikes);
        btnVip = findViewById(R.id.btn_vip);
        btn_ll_completeprofile = findViewById(R.id.btn_ll_completeprofile);

        btn_ll_completeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, CompleteProfileActivity.class);
                startActivity(intent);
            }
        });
        ivHome = findViewById(R.id.ibRefresh);
        ivLocation = findViewById(R.id.ibLocation);
        ivHeart = findViewById(R.id.ibHeart);
        ivChat = findViewById(R.id.ibChat);
        tvSettings = findViewById(R.id.tvSettings);
        ivSetIcon = findViewById(R.id.ivSetIcon);

        String genderFromSignUp = getIntent().getStringExtra("Gender");
        if (genderFromSignUp.contains("Male")) {
            ivSetIcon.setImageResource(R.drawable.ic_man);
        } else if (genderFromSignUp.contains("Female")) {
            ivSetIcon.setImageResource(R.drawable.ic_woman);
        }


        ivChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, messages.class);
                startActivity(intent);
            }
        });

        btn_ll_completeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (genderFromSignUp.contains("Male")) {
                    Intent intent = new Intent(ProfileActivity.this, CompleteProfileActivity.class);
                    intent.putExtra("Gender", "Male");
                    startActivity(intent);
                } else if (genderFromSignUp.contains("Female")) {
                    Intent intent = new Intent(ProfileActivity.this, CompleteProfileActivity.class);
                    intent.putExtra("Gender", "Female");
                    startActivity(intent);
                }
            }
        });
        tvSentLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, Sent_Activity.class);
                startActivity(intent);
            }
        });
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Nobody liked your profile yet", Toast.LENGTH_LONG).show();
            }
        });

        tvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, homePage_Setting.class);
                startActivity(intent);
            }
        });

        btnVip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, Premium_page.class);
                startActivity(intent);
            }
        });

        tvCoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, Premium_page.class);
                startActivity(intent);
            }
        });

    }
}