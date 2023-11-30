package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button green,blue,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        green=findViewById(R.id.green);
        blue=findViewById(R.id.blue);
        red=findViewById(R.id.red);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.green);
                mediaPlayer.start();
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.red);
                mediaPlayer.start();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.blue);
                mediaPlayer.start();
            }
        });


    }
/*
    @Override
    public void onClick(View view) {
         int clickInt=view.getId();
         if(clickInt==R.raw.red)
         {
          sounds(R.raw.red);
         }
         else if (clickInt==R.raw.green) {
             sounds(R.raw.green);
         }
         else if (clickInt==R.raw.blue) {
             sounds(R.raw.blue);
         }

    }

    private void sounds(int id) {
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);
        mediaPlayer.start();
    }*/
}