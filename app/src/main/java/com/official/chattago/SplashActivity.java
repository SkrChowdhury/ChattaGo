package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    //Variables
    Animation topAnim,bottomAnim;
    ImageView splashImage;
    TextView splashText,splashSlogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);


        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks

        splashImage =findViewById(R.id.imageView1);
        splashText = findViewById(R.id.textView1);
        splashSlogan = findViewById(R.id.textView2);

        splashImage.setAnimation(topAnim);
        splashText.setAnimation(bottomAnim);
        splashSlogan.setAnimation(bottomAnim);



        int SPLASH_SCREEN = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intenttoLoginPage = new Intent(SplashActivity.this, User_LoginPage.class);
                startActivity(intenttoLoginPage);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}