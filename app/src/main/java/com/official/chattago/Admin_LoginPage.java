package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Admin_LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_admin_login_page);
    }

    public void ADminLoginButton(View view)
    {
        Intent intent1 = new Intent(Admin_LoginPage.this, Admin_UsersOrderList_Page.class);
        startActivity(intent1);
    }
}