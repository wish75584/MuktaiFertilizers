package com.stubborn.muktaifertilizers.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.stubborn.muktaifertilizers.R;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


public class CareerFragment extends Fragment {

    Button button_choose_file, button_submit;
    EditText f_name, mail, mobile, apply_for;
    int PICK_FILE_REQUEST = 100;
    Uri selectedFilePath = null;
    TextView tv_file_name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_career, container, false);


        button_choose_file = (Button) view.findViewById(R.id.button_choose_file);
        button_submit = (Button) view.findViewById(R.id.button_submit);
        tv_file_name = (TextView) view.findViewById(R.id.tv_file_name);
        f_name = (EditText) view.findViewById(R.id.et_name);
        mail = (EditText) view.findViewById(R.id.et_address);
        mobile = (EditText) view.findViewById(R.id.et_mobile);
        apply_for = (EditText) view.findViewById(R.id.et_appl_for);

        button_choose_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("application/pdf");
                //  intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(
                        Intent.createChooser(intent, "Select a File to Upload"),
                        1);
            }
        });


        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@muktaiorganic.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Applying for");
                intent.putExtra(Intent.EXTRA_TEXT, "Full Name : " + f_name.getText().toString() + "\n Email : " + mail.getText().toString() + "\nMobile : " +
                        mobile.getText().toString() + "\nApplying For : " + apply_for.getText().toString() +
                        "\n");

                intent.putExtra(Intent.EXTRA_STREAM, selectedFilePath);
                //startActivityForResult(intent,2);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
        return view;
    }


    @SuppressLint("Range")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String result;

        if (data != null) {
            selectedFilePath = data.getData();
            if (selectedFilePath.getScheme().equals("content")) {
                Cursor cursor = getContext().getContentResolver().query(selectedFilePath, null, null, null, null);
                try {
                    if (cursor != null && cursor.moveToFirst()) {
                        result = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME));
                        tv_file_name.setText(result);
                    }
                } finally {
                    cursor.close();
                }
            }
        } else {
            Toast.makeText(getContext(), "Please select the pdf file of Resume", Toast.LENGTH_SHORT).show();
        }


//        if (requestCode == 1) {
//            assert data != null;
//            try {
//                selectedFilePath = data.getData();
//                // Cursor r_cursor = getActivity().getContentResolver().query(selectedFilePath, null, null, null);
//            } catch (Exception e) {
//                Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//            String result = null;
//
//            if (selectedFilePath.getScheme().equals("content")) {
//                Cursor cursor = getContext().getContentResolver().query(selectedFilePath, null, null, null, null);
//                try {
//                    if (cursor != null && cursor.moveToFirst()) {
//                        result = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME));
//                    }
//                } finally {
//                    cursor.close();
//                }
//            }
////            if (result == null) {
////                result = selectedFilePath.getPath();
////                int cut = result.lastIndexOf('/');
////                if (cut != -1) {
////                    result = result.substring(cut + 1);
////                }
////            }
//            tv_file_name.setText(result);
//        } else {
//            Toast.makeText(getContext(), "Empty", Toast.LENGTH_SHORT).show();

        // }
    }
}
