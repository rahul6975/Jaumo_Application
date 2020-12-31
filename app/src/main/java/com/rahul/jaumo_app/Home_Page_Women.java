package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_Page_Women extends AppCompatActivity {


    private ImageView ivFilter;
    private ImageView ivIgnore;
    private ImageView ivMessage;
    private ImageView ibTick;
    private ImageView ibRefresh;
    private ImageView ibLocation;
    private ImageView ibHeart;
    private ImageView ibChat;
    private ImageView ibUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page__women);

        initialize();

        ivFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home_Page_Women.this,FilterActivity.class);
                startActivity(intent);
            }
        });

        ibLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this , Location_Filter_Women.class);
                startActivity(intent);
            }
        });


        ibUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this , ProfileActivity.class);
                startActivity(intent);
            }
        });


        ivIgnore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page_Women.this,"You disliked this profile",Toast.LENGTH_LONG).show();
            }
        });

        ibTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page_Women.this,"You liked this profile",Toast.LENGTH_LONG).show();
            }
        });

        ibHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Page_Women.this,"Nobody liked your profile yet",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initialize()
    {
        ivFilter = findViewById(R.id.ivFilter_women);
        ivIgnore = findViewById(R.id.ivIgnore);
        ivMessage = findViewById(R.id.ivMessage);
        ibTick = findViewById(R.id.ibTick);
        ibRefresh = findViewById(R.id.ibRefresh);
        ibLocation = findViewById(R.id.ibLocation);
        ibHeart = findViewById(R.id.ibHeart);
        ibChat = findViewById(R.id.ibChat);
        ibUser = findViewById(R.id.ibUser);
    }
}