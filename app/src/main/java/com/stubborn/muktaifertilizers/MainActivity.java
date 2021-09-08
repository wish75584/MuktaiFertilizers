package com.stubborn.muktaifertilizers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {

    //variable
    Animation topAnim, bottomAnim;
    ImageView image1, image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ConstraintLayout iv = (ConstraintLayout) findViewById(R.id.listViewIcon);

//        //Animation for leaves
//        topAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_left_animation);
//        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_right_animation);
//            //hooks
//        image1 = findViewById(R.id.img1);
//        image2 = findViewById(R.id.img2);
//
//        image1.setAnimation(topAnim);
//        image2.setAnimation(bottomAnim);

        //animation for opacity
//        AlphaAnimation animation1 = new AlphaAnimation(0.9f, 0.1f);
//        animation1.setDuration(1000);
//        animation1.setStartOffset(1000);
//        animation1.setFillAfter(true);
//        iv.startAnimation(animation1);


        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(
                            MainActivity.this, HomeActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }

}