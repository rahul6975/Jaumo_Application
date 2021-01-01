package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Nipun_Jain extends AppCompatActivity {

    private ImageView tick;
    private ImageView cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nipun__jain);

        tick= findViewById(R.id.ivTick);
        cancel = findViewById(R.id.ivIgnore);

        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Nipun_Jain.this,"You liked this profile",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Nipun_Jain.this,"You disliked this profile",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}