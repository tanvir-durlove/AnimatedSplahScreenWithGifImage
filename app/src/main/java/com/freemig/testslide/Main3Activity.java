package com.freemig.testslide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Thread splashTread;
    ImageView imageView;
    MediaPlayer myMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        StartAnimation();
    }



    private void StartAnimation() {



        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();

//        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rv2);
//        rl.clearAnimation();
//        rl.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();

        ImageView iv = (ImageView) findViewById(R.id.logo) ;
        iv.clearAnimation();
        iv.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate_slow);
        anim.reset();

        TextView tv = (TextView)findViewById(R.id.splashFreemig) ;
        tv.clearAnimation();
        tv.startAnimation(anim);



    }
}