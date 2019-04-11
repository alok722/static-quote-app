package com.example.imalok.superpowerlearning;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MoneyActivity extends AppCompatActivity {

    //MediaPlayer moneySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        stopService(new Intent(MoneyActivity.this, FitnessMusicService.class));
        startService(new Intent(MoneyActivity.this, MoneyMusicService.class));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
//        moneySong=MediaPlayer.create(MoneyActivity.this,R.raw.motivation2);
//        moneySong.setLooping(true);
//        moneySong.start();

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

//    @Override
//    protected void onPause(){
//        super.onPause();
//        moneySong.release();
//    }

}
