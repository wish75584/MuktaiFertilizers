package com.stubborn.muktaifertilizers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    //variable
    Animation topAnim,bottomAnim;
    ImageView image1,image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
        setContentView(R.layout.activity_main);
        final ConstraintLayout iv = (ConstraintLayout) findViewById(R.id.listViewIcon);

        //Animation for leaves
        topAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_left_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_right_animation);
            //hooks
        image1 = findViewById(R.id.img1);
        image2 = findViewById(R.id.img2);

        image1.setAnimation(topAnim);
        image2.setAnimation(bottomAnim);

        //animation for opacity
        AlphaAnimation animation1 = new AlphaAnimation(0.9f, 0.1f);
        animation1.setDuration(3000);
        animation1.setStartOffset(3000);
        animation1.setFillAfter(true);
        iv.startAnimation(animation1);






    }
}
