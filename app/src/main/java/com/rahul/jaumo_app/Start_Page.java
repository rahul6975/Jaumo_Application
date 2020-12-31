package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Start_Page extends AppCompatActivity {
    ImageView ivImageBackground;
    Button btnSignUp, btnGoogleSignUp;
    TextView tvPolicy, tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        initUi();
        initEventListerns();
    }

    private void initEventListerns() {
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start_Page.this, SignUpWithEmail.class);
                startActivity(intent);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start_Page.this, GenderActivity.class);
                startActivity(intent);
            }
        });
        tvPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jaumo.com/terms/"));
                startActivity(intent);
            }
        });
    }

    private void initUi() {
        ivImageBackground = findViewById(R.id.ivImageBackground);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnGoogleSignUp = findViewById(R.id.btnGoogleSignUp);
        tvPolicy = findViewById(R.id.tvPolicy);
        tvLogin = findViewById(R.id.tvLogin);

    }

}