package com.freemig.testslide;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifTextView;

public class MainActivity extends AppCompatActivity {

    Thread splashTread;
    ImageView imageView;
    MediaPlayer myMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StartAnimation();
    }



    private void StartAnimation() {


        Animation anim = AnimationUtils.loadAnimation(this, R.anim.left_to_right1);
        anim.reset();

        ImageView iv = (ImageView) findViewById(R.id.logo) ;
        iv.clearAnimation();
        iv.startAnimation(anim);
        anim.reset();

        Animation anm = AnimationUtils.loadAnimation(this, R.anim.animation);
        TextView tv = (TextView)findViewById(R.id.splashFreemig) ;
        tv.clearAnimation();
        tv.startAnimation(anm);

        Animation gfanm = AnimationUtils.loadAnimation(this, R.anim.translate);
        GifTextView gf = (GifTextView) findViewById(R.id.animated_call) ;
        gf.clearAnimation();
        gf.startAnimation(gfanm);

    }
}