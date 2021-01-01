package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

    private TextView tvWName1;
    private TextView tvWName2;
    private TextView tvWName3;
    private TextView tvWName4;
    private TextView tvWName5;
    private TextView tvWName6;
    private TextView tvWName7;
    private TextView tvWName8;
    private TextView tvWName9;
    private TextView tvWName10;
    private TextView tvWName11;
    private TextView tvWName12;
    private TextView tvWName13;
    private TextView tvWName14;
    private TextView tvWName15;
    private TextView tvWName16;
    private TextView tvWName17;
    private TextView tvWName18;
    private TextView tvWName19;
    private TextView tvWName20;


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
                intent.putExtra("Gender","Female");
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
        /*ibRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Page_Women.this , Home_Page_Women.class);
                startActivity(intent);
            }
        });*/

        ibChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,messages.class);
                startActivity(intent);
            }
        });

        tvWName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Anita_Dev.class);
                startActivity(intent);
            }
        });
        tvWName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Suman_Jaiswal.class);
                startActivity(intent);
            }
        });


        tvWName3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Neha_Sharma.class);
                startActivity(intent);
            }
        });

        tvWName4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Jaiswi_Jain.class);
                startActivity(intent);
            }
        });

        tvWName5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Priya_Rai.class);
                startActivity(intent);
            }
        });

        tvWName6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Suman_Shiddique.class);
                startActivity(intent);
            }
        });
        tvWName7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Dimple_Mundwa.class);
                startActivity(intent);
            }
        });

        tvWName8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Shreya_Singh.class);
                startActivity(intent);
            }
        });

        tvWName9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Nidhi_Chauhan.class);
                startActivity(intent);
            }
        });

        tvWName10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Jaishri_Hansa.class);
                startActivity(intent);
            }
        });

        tvWName11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Muskan_Khan.class);
                startActivity(intent);
            }
        });

        tvWName12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Priyanka_Lobhe.class);
                startActivity(intent);
            }
        });

        tvWName13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Yami_Gautam.class);
                startActivity(intent);
            }
        });

        tvWName14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Kaira_Singh.class);
                startActivity(intent);
            }
        });

        tvWName15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Heena_Shaikh.class);
                startActivity(intent);
            }
        });

        tvWName16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Kulsum_Khan.class);
                startActivity(intent);
            }
        });

        tvWName17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Nisha_Dubey.class);
                startActivity(intent);
            }
        });

        tvWName18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Lovely_Joy.class);
                startActivity(intent);
            }
        });

        tvWName19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Kareshma_Yadav.class);
                startActivity(intent);
            }
        });

        tvWName20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Page_Women.this,Neeta_Singh.class);
                startActivity(intent);
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

        tvWName1 = findViewById(R.id.tvWName1);
        tvWName2 = findViewById(R.id.tvWName2);
        tvWName3 = findViewById(R.id.tvWName3);
        tvWName4 = findViewById(R.id.tvWName4);
        tvWName5 = findViewById(R.id.tvWName5);
        tvWName6 = findViewById(R.id.tvWName6);
        tvWName7 = findViewById(R.id.tvWName7);
        tvWName8 = findViewById(R.id.tvWName8);
        tvWName9 = findViewById(R.id.tvWName9);
        tvWName10 = findViewById(R.id.tvWName10);
        tvWName11 = findViewById(R.id.tvWName11);
        tvWName12 = findViewById(R.id.tvWName12);
        tvWName13 = findViewById(R.id.tvWName13);
        tvWName14 = findViewById(R.id.tvWName14);
        tvWName15 = findViewById(R.id.tvWName15);
        tvWName16 = findViewById(R.id.tvWName16);
        tvWName17 = findViewById(R.id.tvWName17);
        tvWName18 = findViewById(R.id.tvWName18);
        tvWName19 = findViewById(R.id.tvWName19);
        tvWName20 = findViewById(R.id.tvWName20);


    }
}