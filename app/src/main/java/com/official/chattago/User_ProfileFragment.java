package com.official.chattago;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

public class User_ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_user_profile, container, false);

        final Intent intent1 = new Intent(getActivity(), User_EditProfile.class);
        MaterialCardView edit_profile_cardview = (MaterialCardView) rootView.findViewById(R.id.edit_profile_cardview);
        edit_profile_cardview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        final Intent intent2 = new Intent(getActivity(), ContactUs_Page.class);
        MaterialCardView contactUs_cardview = (MaterialCardView) rootView.findViewById(R.id.contactUs_cardview);
        contactUs_cardview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent2);
            }
        });


        return rootView;


    }
}