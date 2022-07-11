package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class User_LoginPage extends AppCompatActivity {

    Button loginUserButton1,loginUserButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_login_page);

        loginUserButton1 =findViewById(R.id.loginUserButton1);
        loginUserButton2 =findViewById(R.id.loginUserButton2);


loginUserButton2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent1 = new Intent(User_LoginPage.this, Admin_LoginPage.class);
        startActivity(intent1);
    }
});

loginUserButton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent2 = new Intent(User_LoginPage.this, User_VerifyOTP_Page.class);
        startActivity(intent2);
    }
});
    }


}