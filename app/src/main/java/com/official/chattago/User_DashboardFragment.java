package com.official.chattago;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.google.android.material.card.MaterialCardView;

public class User_DashboardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_user_dashboard, container, false);

//        Intent For Delivery Service
        final Intent intent1 = new Intent(getActivity(), User_Express_or_Premium_Delivery_Activity.class);
        RelativeLayout delivery_service = (RelativeLayout) rootView.findViewById(R.id.delivery_service);
        delivery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
//        Intent For Pickup and Delivery Service
        final Intent intent2 = new Intent(getActivity(), Services_Pickup_and_Delivery.class);
        CardView pickup_and_delivery_service = (CardView) rootView.findViewById(R.id.pickup_and_delivery_service);
        pickup_and_delivery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

//        Intent For Medicine Delivery Service
        final Intent intent3 = new Intent(getActivity(), Services_Medicine_Delivery.class);
        RelativeLayout Medicine_delivery_service = (RelativeLayout) rootView.findViewById(R.id.Medicine_delivery_service);
        Medicine_delivery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent3);
            }
        });


//        Intent For Parcel Delivery Service
        final Intent intent4 = new Intent(getActivity(), Services_Parcel_Delivery.class);
        CardView parcel_delivery_service = (CardView) rootView.findViewById(R.id.parcel_delivery_service);
        parcel_delivery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent4);
            }
        });

//        Intent For Bank Deposite Service
        final Intent intent5 = new Intent(getActivity(), Services_Bank_Deposit.class);
        RelativeLayout bank_deposit_service = (RelativeLayout) rootView.findViewById(R.id.bank_deposit_service);
        bank_deposit_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent5);
            }
        });


//        Intent For Laundry Drop and Pickup Service
        final Intent intent6 = new Intent(getActivity(), Services_LaundryDrop_and_Pickup.class);
        CardView laundry_drop_and_pickup_service = (CardView) rootView.findViewById(R.id.laundry_drop_and_pickup_service);
        laundry_drop_and_pickup_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent6);
            }
        });

//        Intent For Gift Handling Service
        final Intent intent7 = new Intent(getActivity(), Services_Gift_Handling.class);
        RelativeLayout gift_handling_service = (RelativeLayout) rootView.findViewById(R.id.gift_handling_service);
        gift_handling_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent7);
            }
        });


//        Intent For Grocery Service
        final Intent intent8 = new Intent(getActivity(), Services_Grocery.class);
        CardView grocery_service = (CardView) rootView.findViewById(R.id.grocery_service);
        grocery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent8);
            }
        });


//        Intent For Food Delivery  Service
        final Intent intent9 = new Intent(getActivity(), Services_Food_Delivery.class);
        CardView food_delivery_service = (CardView) rootView.findViewById(R.id.food_delivery_service);
        food_delivery_service.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent9);
            }
        });





        return rootView;
    }
}