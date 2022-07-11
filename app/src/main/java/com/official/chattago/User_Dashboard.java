package com.official.chattago;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class User_Dashboard extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        chipNavigationBar = findViewById(R.id.bottom_navigation_bar);
        chipNavigationBar.setItemSelected(R.id.bottom_navigation_dashboard,true);

        getSupportFragmentManager().beginTransaction().replace(R.id.user_dashboard_bottom_nav,new User_DashboardFragment()).commit();
        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;

                switch (i){
                    case R.id.bottom_navigation_dashboard:
                        fragment = new User_DashboardFragment();
                        break;

                    case R.id.bottom_navigation_my_orders:
                        fragment = new User_OrderFragment();
                        break;

                    case R.id.bottom_navigation_profile:
                        fragment = new User_ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.user_dashboard_bottom_nav,fragment).commit();
            }
        });
    }



    @Override
    public void onBackPressed(){
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(User_Dashboard.this);
//
//        builder.setTitle("Please Confirm");
//        builder.setIcon(R.drawable.alert_box_icon);
        builder.setMessage("Wanna exit for sure ?");
        builder.setCancelable(true);

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

        builder.setNegativeButton("N0", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Do something when want to stay in the app
                Toast.makeText(getApplicationContext(),"THANK YOU FOR STAYING",Toast.LENGTH_SHORT).show();
            }
        });

        // Create the alert dialog using alert dialog builder
        AlertDialog dialog = builder.create();

        // Finally, display the dialog when user press back button
        dialog.show();
    }
}