package com.stubborn.muktaifertilizers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter {
    private Context mContext;




    public GalleryImageAdapter(Context galleryFragment) {
        mContext = galleryFragment;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup) {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));

        i.setScaleType(ImageView.ScaleType.FIT_XY);


        return i;
    }

    public Integer[] mImageIds = {
            R.drawable.o1,
            R.drawable.o2,
            R.drawable.o3,
            R.drawable.o4,
            R.drawable.o5,
            R.drawable.o6,
            R.drawable.o7,
            R.drawable.o8,
            R.drawable.o9,
            R.drawable.o10,
            R.drawable.o11,
            R.drawable.o12,
            R.drawable.o13,
            R.drawable.o14,
            R.drawable.o15,
            R.drawable.o16,
            R.drawable.o17,
            R.drawable.o18,
            R.drawable.o19,
            R.drawable.o20,
            R.drawable.o21,
            R.drawable.o22,
            R.drawable.o23,
            R.drawable.o24,
            R.drawable.o25,
            R.drawable.o26,
            R.drawable.o27,
            R.drawable.o28,
            R.drawable.o29,
            R.drawable.o30,
            R.drawable.o31,
            R.drawable.o32,
            R.drawable.o33
    };

}