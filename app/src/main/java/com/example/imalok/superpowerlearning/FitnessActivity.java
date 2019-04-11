package com.example.imalok.superpowerlearning;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class FitnessActivity extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter adapter;
    ImageView lftbtn;
    ImageView rtbtn;
   // MediaPlayer fitnessSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        startService(new Intent(FitnessActivity.this,FitnessMusicService.class));
        stopService(new Intent(FitnessActivity.this,MoneyMusicService.class));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
//        fitnessSong=MediaPlayer.create(FitnessActivity.this,R.raw.motivation);
//        fitnessSong.setLooping(true);
//        fitnessSong.start();

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Fitness");

        viewPager = (ViewPager)findViewById(R.id.fitness_slider);
        adapter = new SliderAdapter(this);
        viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setAdapter(adapter);

        lftbtn = (ImageView) findViewById(R.id.leftbtn);
        rtbtn = (ImageView) findViewById(R.id.rightbtn);

        lftbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        rtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               viewPager.arrowScroll(View.FOCUS_RIGHT);

            }
        });


    }

//    @Override
//    protected void onPause(){
//        super.onPause();
//        fitnessSong.release();
//    }
    
}
