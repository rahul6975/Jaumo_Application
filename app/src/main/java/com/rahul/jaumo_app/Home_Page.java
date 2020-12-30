package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class Home_Page extends AppCompatActivity {

    private ImageView ivRandomImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);

        ivRandomImage = findViewById(R.id.ivRandomPeoples);

    }

    private  void setRandomImage()
    {
        final TypedArray imgs = getResources().obtainTypedArray(R.array.men_images);
        final Random rand = new Random();
        final int randInt = rand.nextInt(imgs.length());
        final int resID = imgs.getResourceId(randInt,0);

        ivRandomImage.setImageResource(resID);


    }
}