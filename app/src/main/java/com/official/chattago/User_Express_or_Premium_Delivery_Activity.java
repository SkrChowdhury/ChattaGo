package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class User_Express_or_Premium_Delivery_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user__express_or__premium__delivery_);
    }


    public void goBacktoPreviousActivity(View view) {

        finish();
    }


    public void clicktoContinueButton(View view) {

        Intent intent2 = new Intent(User_Express_or_Premium_Delivery_Activity.this,Services_Delivery.class);
        startActivity(intent2);
    }
}