package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Admin_UserOrder_TrackingUpdate_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_admin__user_order__tracking_update__page);
    }

    public void OrderPlaced(View view) {
        //startActivity(new Intent(MainActivity.this,TrackActivity.class));
        String orderStatus="0";
        Intent intent=new Intent(Admin_UserOrder_TrackingUpdate_Page.this,User_TrackingOrders.class);
        intent.putExtra("orderStatus",orderStatus);
        startActivity(intent);
    }

    public void OrderConfirmed(View view) {
        String orderStatus="1";
        Intent intent=new Intent(Admin_UserOrder_TrackingUpdate_Page.this,User_TrackingOrders.class);
        intent.putExtra("orderStatus",orderStatus);
        startActivity(intent);
    }

    public void OrderProcessed(View view) {
        String orderStatus="2";
        Intent intent=new Intent(Admin_UserOrder_TrackingUpdate_Page.this,User_TrackingOrders.class);
        intent.putExtra("orderStatus",orderStatus);
        startActivity(intent);
    }

    public void OrderPickup(View view) {
        String orderStatus="3";
        Intent intent=new Intent(Admin_UserOrder_TrackingUpdate_Page.this,User_TrackingOrders.class);
        intent.putExtra("orderStatus",orderStatus);
        startActivity(intent);
    }

//    Go Back Arrow
    public void goBacktoPreviousActivity(View view)
    {
        // some code
        finish();
    }
}