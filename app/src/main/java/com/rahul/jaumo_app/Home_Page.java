package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Home_Page extends AppCompatActivity {

    private ImageView ivFilter;
    private ImageView ivIgnore;
    private ImageView ivMessage;
    private ImageView ibTick;
    private ImageView ibRefresh;
    private ImageView ibLocation;
    private ImageView ibHeart;
    private ImageView ibChat;
    private ImageView ibUser;
    private TextView tvName1;
    private TextView tvName2;
    private TextView tvName3;
    private TextView tvName4;
    private TextView tvName6;
    private TextView tvName5;
    private TextView tvName7;
    private TextView tvName8;
    private TextView tvName9;
    private TextView tvName10;
    private TextView tvName11;
    private TextView tvName12;
    private TextView tvName13;
    private TextView tvName14;
    private TextView tvName15;
    private TextView tvName16;
    private TextView tvName17;
    private TextView tvName18;
    private TextView tvName19;
    private TextView tvName20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        initialize();

        ivFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home_Page.this,FilterActivity.class);
                startActivity(intent);
            }
        });

        ibLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this , Location_Filter_Men.class);
                startActivity(intent);
            }
        });


        ibUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this , ProfileActivity.class);
                intent.putExtra("Gender","Male");
                startActivity(intent);
            }
        });

        ivIgnore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page.this,"You disliked this profile",Toast.LENGTH_LONG).show();
            }
        });

        ibTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page.this,"You liked this profile",Toast.LENGTH_LONG).show();
            }
        });

        ibHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page.this,"Nobody liked your profile yet",Toast.LENGTH_LONG).show();
            }
        });

        ibChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,messages.class);
                startActivity(intent);
            }
        });

        tvName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Abhay_Sharma.class);
                startActivity(intent);
            }
        });
        tvName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Suraj_Gupta.class);
                startActivity(intent);
            }
        });

        tvName3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Binod_Jaiswal.class);
                startActivity(intent);
            }
        });

        tvName4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Tanmay_Punit.class);
                startActivity(intent);
            }
        });

        tvName5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Nipun_Jain.class);
                startActivity(intent);
            }
        });

        tvName6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Bunty_Gosh.class);
                startActivity(intent);
            }
        });

        tvName7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Kailash_Patel.class);
                startActivity(intent);
            }
        });

        tvName8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Dhruv_Shorey.class);
                startActivity(intent);
            }
        });


        tvName9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Rahul_Singh.class);
                startActivity(intent);
            }
        });

        tvName10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Hiren_Mistry.class);
                startActivity(intent);
            }
        });

        tvName11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Pravin_Francis.class);
                startActivity(intent);
            }
        });
        tvName12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Gaurav_Singh.class);
                startActivity(intent);
            }
        });

        tvName13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Aditya_Sharma.class);
                startActivity(intent);
            }
        });



        tvName14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Mousin_Sayyed.class);
                startActivity(intent);
            }
        });

        tvName15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Amir_Gupta.class);
                startActivity(intent);
            }
        });

        tvName16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Arsalan_Shaikh.class);
                startActivity(intent);
            }
        });

        tvName17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Vinit_Yadav.class);
                startActivity(intent);
            }
        });
        tvName18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Bipin_Pal.class);
                startActivity(intent);
            }
        });

        tvName19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Sachin_Goel.class);
                startActivity(intent);
            }
        });

        tvName20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this,Abhinav_Bhati.class);
                startActivity(intent);
            }
        });

    }

    private void initialize()
    {
         ivFilter = findViewById(R.id.ivFilter_men);
        ivIgnore = findViewById(R.id.ivIgnore);
        ivMessage = findViewById(R.id.ivMessage);
        ibTick = findViewById(R.id.ibTick);
        ibRefresh = findViewById(R.id.ibRefresh);
        ibLocation = findViewById(R.id.ibLocation);
        ibHeart = findViewById(R.id.ibHeart);
        ibChat = findViewById(R.id.ibChat);
        ibUser = findViewById(R.id.ibUser);
        tvName1 = findViewById(R.id.tvName1);
        tvName2 = findViewById(R.id.tvName2);
        tvName3 = findViewById(R.id.tvName3);
        tvName4 = findViewById(R.id.tvName4);
        tvName5 = findViewById(R.id.tvName5);
        tvName6 = findViewById(R.id.tvName6);
        tvName7 = findViewById(R.id.tvName7);
        tvName8 = findViewById(R.id.tvName8);
        tvName9 = findViewById(R.id.tvName9);
        tvName10 = findViewById(R.id.tvName10);
        tvName11 = findViewById(R.id.tvName11);
        tvName12 = findViewById(R.id.tvName12);
        tvName13 = findViewById(R.id.tvName13);
        tvName16 = findViewById(R.id.tvName16);
        tvName14 = findViewById(R.id.tvName14);
        tvName15 = findViewById(R.id.tvName15);
        tvName17 = findViewById(R.id.tvName17);
        tvName18 = findViewById(R.id.tvName18);
        tvName19 = findViewById(R.id.tvName19);
        tvName20 = findViewById(R.id.tvName20);
    }
}