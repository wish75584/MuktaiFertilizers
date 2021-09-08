package com.stubborn.muktaifertilizers.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.stubborn.muktaifertilizers.R;

import androidx.fragment.app.Fragment;


public class ContactFragment extends Fragment {

    private Button submit_inquiry;
    private EditText et_name, et_address, et_mobile, et_appl_for;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        submit_inquiry = view.findViewById(R.id.submit_inquiry);
        et_name = view.findViewById(R.id.et_name);
        et_address = view.findViewById(R.id.et_address);
        et_mobile = view.findViewById(R.id.et_mobile);
        et_appl_for = view.findViewById(R.id.et_appl_for);

        submit_inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String uriText = "wish75584@gmail.com";
                //  Uri uri = Uri.parse(uriText);
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.fromParts("mailto", "info@muktaiorganic.com", null));
                //  intent.setData(uri);
                //  intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"wish75584@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Applying for");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Full Name : " + et_name.getText().toString() + "\n Email : " + et_address.getText().toString() + "\nMobile : " +
                        et_mobile.getText().toString() + "\nApplying For : " + et_appl_for.getText().toString() +
                        "\n");
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });
        return view;
    }

}

