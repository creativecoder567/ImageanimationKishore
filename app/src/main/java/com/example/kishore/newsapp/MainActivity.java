package com.example.kishore.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    private Button btnAntiClock;
    private Button btnClock;
    private ImageView imageView1;
    private Button btnTransparent;
    private Button btnOpaque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAntiClock = (Button) findViewById(R.id.btnAnticlock);
        btnClock = (Button) findViewById(R.id.btnClock);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        btnTransparent = (Button) findViewById(R.id.btnTransparent);
        btnOpaque = (Button) findViewById(R.id.btnOpaque);
    }

    public void rotateImage(View view) {

        switch (view.getId()) {

            case R.id.btnClock:
                imageView1.setRotation(imageView1.getRotation() + 45);
                break;

            case R.id.btnAnticlock:
                imageView1.setRotation(imageView1.getRotation() - 45);
                break;
        }

    }

    public void alphaImage(View view) throws InterruptedException {

        switch (view.getId()) {

            case R.id.btnTransparent:
                imageView1.animate().alpha(0).setDuration(1200);

                break;

            case R.id.btnOpaque:
                imageView1.animate().alpha(1).setDuration(1200);
                break;
        }
    }

    public void moveImage(View view) {
        TranslateAnimation animation = new TranslateAnimation(0.0f, 400.0f,
                0.0f, 0.0f);
        animation.setDuration(2000);
        animation.setRepeatCount(1);
        animation.setRepeatMode(2);
        imageView1.startAnimation(animation);
    }

    public void shakeImage(View view){

     Animation shake= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shake);
        imageView1.startAnimation(shake);


    }

 }


