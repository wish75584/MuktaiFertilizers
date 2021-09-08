package com.stubborn.muktaifertilizers.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.stubborn.muktaifertilizers.R;
import com.stubborn.muktaifertilizers.products.BioFertilizers;
import com.stubborn.muktaifertilizers.products.BioPestisides;
import com.stubborn.muktaifertilizers.products.MicroNutrients;
import com.stubborn.muktaifertilizers.products.OrganicFertilizers;
import com.stubborn.muktaifertilizers.products.StraightFertilizers;

import androidx.fragment.app.Fragment;


public class ProductsFragment extends Fragment implements View.OnClickListener {

    ImageView bio_fertilizers, bio_pesticides, micro_nutri, straight_fertilizers, organic_fertilizers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_products, container, false);
        View view = inflater.inflate(R.layout.fragment_products,
                container, false);
        bio_fertilizers = view.findViewById(R.id.bio_fertilizers);
        bio_pesticides = view.findViewById(R.id.bio_pesticides);
        micro_nutri = view.findViewById(R.id.micro_nutri);
        straight_fertilizers = view.findViewById(R.id.straight_fertilizers);
        organic_fertilizers = view.findViewById(R.id.organic_fertilizers);


        InitView();
        return view;
    }

    private void InitView() {
        bio_fertilizers.setOnClickListener(this);
        bio_pesticides.setOnClickListener(this);
        micro_nutri.setOnClickListener(this);
        straight_fertilizers.setOnClickListener(this);
        organic_fertilizers.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bio_fertilizers:
                startActivity(new Intent(getActivity(), BioFertilizers.class));
                break;
            case R.id.bio_pesticides:
                startActivity(new Intent(getActivity(), BioPestisides.class));
                break;
            case R.id.micro_nutri:
                startActivity(new Intent(getActivity(), MicroNutrients.class));
                break;
            case R.id.straight_fertilizers:
                startActivity(new Intent(getActivity(), StraightFertilizers.class));
                break;
            case R.id.organic_fertilizers:
                startActivity(new Intent(getActivity(), OrganicFertilizers.class));
                break;

            default:
                break;
        }

    }
}
