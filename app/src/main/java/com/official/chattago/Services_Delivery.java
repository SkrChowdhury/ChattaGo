package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Services_Delivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_services__delivery);
    }

//    Go Back Arrow
    public void goBacktoPreviousActivity(View view) {

        Intent intent2 = new Intent(Services_Delivery.this,User_Express_or_Premium_Delivery_Activity.class);
        startActivity(intent2);
    }

//    next activity
    public void customer_information_to_paymentMethod(View view) {

        Intent intent2 = new Intent(Services_Delivery.this,Delivery_Medium_and_Payment_Method_Activity.class);
        startActivity(intent2);
    }
}