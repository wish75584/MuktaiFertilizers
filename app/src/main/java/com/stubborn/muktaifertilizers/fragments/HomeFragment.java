package com.stubborn.muktaifertilizers.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.stubborn.muktaifertilizers.R;

import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    FrameLayout frame_about, frame_prod, frame_gal, frame_career, frame_video, frame_contact;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        frame_about = (FrameLayout) view.findViewById(R.id.frame_about);
        frame_prod = (FrameLayout) view.findViewById(R.id.frame_prod);
        frame_gal = (FrameLayout) view.findViewById(R.id.frame_gal);
        frame_career = (FrameLayout) view.findViewById(R.id.frame_career);
        frame_video = (FrameLayout) view.findViewById(R.id.frame_video);
        frame_contact = (FrameLayout) view.findViewById(R.id.frame_contact);


        frame_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AboutUsFragment nextFrag = new AboutUsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        frame_prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProductsFragment nextFrag = new ProductsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        frame_gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GalleryFragment nextFrag = new GalleryFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        frame_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CareerFragment nextFrag = new CareerFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        frame_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                VideosFragmentX nextFrag = new VideosFragmentX();
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
//                        .addToBackStack(null)
//                        .commit();

                startActivity(new Intent(getActivity(),VideosFragmentX.class));
            }
        });
        frame_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContactFragment nextFrag = new ContactFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;

    }

}
