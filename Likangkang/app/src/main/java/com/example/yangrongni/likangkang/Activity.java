package com.example.yangrongni.likangkang;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by ydkf051 on 2017/12/27.
 */

public class Activity extends AppCompatActivity{
    ImageButton imagebutton;
    int i=1;
    MediaPlayer mediaPlayer;
    @Override
    protected  void  onCreate( Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.bofang);
       mediaPlayer=MediaPlayer.create(this,R.raw.m1);
        mediaPlayer.setLooping(true);
    }
    public void bo(View view){
        Log.d("a", "bo: ");
        i++;
        imagebutton= (ImageButton) findViewById(R.id.imageButton);
        if(i%2==0){
            imagebutton.setImageResource(R.drawable.guan);
            mediaPlayer.start();
        }
        else {
            imagebutton.setImageResource(R.drawable.b);
            mediaPlayer.pause();
        }

    }
}

