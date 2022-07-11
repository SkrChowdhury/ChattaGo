package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Admin_UsersOrderList_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_admin__users_order_list_page);

    }

    public void DetailsAndTrackingButton(View view)
    {
        Intent intent1 = new Intent(Admin_UsersOrderList_Page.this, Admin_UserOrder_TrackingUpdate_Page.class);
        startActivity(intent1);
    }
}