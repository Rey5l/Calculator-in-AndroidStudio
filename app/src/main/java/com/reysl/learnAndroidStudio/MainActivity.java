package com.reysl.learnAndroidStudio;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnSecond;
    ImageButton carImage, policeImage;
    MediaPlayer carSound, policeSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carImage = findViewById(R.id.car_image);
        policeImage = findViewById(R.id.police_image);

        carSound = MediaPlayer.create(this, R.raw.car);
        policeSound = MediaPlayer.create(this, R.raw.police);

        carImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(carSound, policeSound);
            }
        });

        policeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(policeSound, carSound);
            }
        });
    }

    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2) {
        if (sound1.isPlaying()) {
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
        }

        if (sound2.isPlaying()) {
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }
        sound1.start();
        sound1.setLooping(true);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}