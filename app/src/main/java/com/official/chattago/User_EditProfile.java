package com.official.chattago;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.card.MaterialCardView;

public class User_EditProfile extends AppCompatActivity {

    private static final int GALLERY_REQUEST_CODE = 123;

    Button changeImageButton;
    ImageView changeImageView;
    MaterialCardView edit_profile_contactUs_cardview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_edit_profile);

//        Changing Image in EDIT PROFILE ACTIVITY
        changeImageView = findViewById(R.id.ChangeImage_ImageView);
        changeImageButton = findViewById(R.id.ChangeImage_Button);
        edit_profile_contactUs_cardview = findViewById(R.id.edit_profile_contactUs_cardview);

        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/'");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Change Image"),GALLERY_REQUEST_CODE);
            }
        });

        edit_profile_contactUs_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(User_EditProfile.this,ContactUs_Page.class);
                startActivity(intent2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == GALLERY_REQUEST_CODE && resultCode == RESULT_OK && data != null)){
            Uri imageData = data.getData();
            changeImageView.setImageURI(imageData);
        }
    }

//Edit profile go back to previous activity
    public void goBacktoPreviousActivity(View view)
    {
        // some code
        finish();
    }
}