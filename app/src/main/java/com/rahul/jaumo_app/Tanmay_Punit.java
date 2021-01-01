package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Tanmay_Punit extends AppCompatActivity {

    private ImageView tick;
    private ImageView cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanmay__punit);

        tick= findViewById(R.id.ivTick);
        cancel = findViewById(R.id.ivIgnore);

        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tanmay_Punit.this,"You liked this profile",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tanmay_Punit.this,"You disliked this profile",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}