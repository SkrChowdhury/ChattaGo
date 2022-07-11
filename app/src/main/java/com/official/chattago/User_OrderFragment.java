package com.official.chattago;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class User_OrderFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_user_order, container, false);

        final Intent intent = new Intent(getActivity(), Admin_UserOrder_TrackingUpdate_Page.class);
        Button trackOrder_Button1 = (Button) rootView.findViewById(R.id.trackOrder_Button1);
        trackOrder_Button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Button trackOrder_Button2 = (Button) rootView.findViewById(R.id.trackOrder_Button2);
        trackOrder_Button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Button trackOrder_Button3 = (Button) rootView.findViewById(R.id.trackOrder_Button3);
        trackOrder_Button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Button trackOrder_Button4 = (Button) rootView.findViewById(R.id.trackOrder_Button4);
        trackOrder_Button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Button trackOrder_Button5 = (Button) rootView.findViewById(R.id.trackOrder_Button5);
        trackOrder_Button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Button trackOrder_Button6 = (Button) rootView.findViewById(R.id.trackOrder_Button6);
        trackOrder_Button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return rootView;
    }
}