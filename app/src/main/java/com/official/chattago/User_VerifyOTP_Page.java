package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class User_VerifyOTP_Page extends AppCompatActivity {

    Button verifyButton;
    ImageView crossImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_verify_otp_page);

        verifyButton = findViewById(R.id.verifyButton);
        crossImageView = findViewById(R.id.crossImageView);

        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(User_VerifyOTP_Page.this, User_Dashboard.class);
                startActivity(intent1);
            }
        });


//        Varifiy Page Cross Button Go Back
        crossImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finish();
            }
        });
    }
}