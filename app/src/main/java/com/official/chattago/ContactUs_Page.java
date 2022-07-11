package com.official.chattago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class ContactUs_Page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_contact_us__page);

        TextView contactUs_call_textview = (TextView) findViewById(R.id.contactUs_call_textview);
        contactUs_call_textview.setMovementMethod(LinkMovementMethod.getInstance());

        TextView contactUs_support_textview = (TextView) findViewById(R.id.contactUs_support_textview);
        contactUs_support_textview.setMovementMethod(LinkMovementMethod.getInstance());

        TextView contactUs_facebook_textview = (TextView) findViewById(R.id.contactUs_facebook_textview);
        contactUs_facebook_textview.setMovementMethod(LinkMovementMethod.getInstance());

        TextView contactUs_whatsapp_textview = (TextView) findViewById(R.id.contactUs_whatsapp_textview);
        contactUs_whatsapp_textview.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void goBacktoPreviousActivity(View view)
    {
        // some code
        finish();
    }
}