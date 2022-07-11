package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Delivery_Medium_and_Payment_Method_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_delivery__medium_and__payment__method_);
    }

    public void goBacktoPreviousActivity(View view) {

        Intent intent2 = new Intent(Delivery_Medium_and_Payment_Method_Activity.this,Services_Delivery.class);
        startActivity(intent2);
    }
}