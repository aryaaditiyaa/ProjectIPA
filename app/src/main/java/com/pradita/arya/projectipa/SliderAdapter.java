package com.pradita.arya.projectipa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

//        Array

    public int[] slide_gambar = {
            R.drawable.dog,
            R.drawable.apple,
            R.drawable.carrot
    };

    public String[] slide_judul = {
            "Mengenal Hewan",
            "Mengenal Buah",
            "Mengenal Sayuran"
    };

    public String[] slide_sub_judul = {
            "Mari lebih tahu tentang hewan-hewan di planet kita.",
            "Suka makan buah? Ayo cari tahu lebih dalam tentang buah.",
            "Sayur-sayuran sangat baik untuk tubuh kita lho."
    };

    @Override
    public int getCount() {
        return slide_judul.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slider_content, container, false);

        ImageView slidegambar = (ImageView) view.findViewById(R.id.slideGambar);
        TextView slidejudul = (TextView) view.findViewById(R.id.slideJudul);
        TextView slidesubjudul = (TextView) view.findViewById(R.id.slideSubJudul);

        slidegambar.setImageResource(slide_gambar[position]);
        slidejudul.setText(slide_judul[position]);
        slidesubjudul.setText(slide_sub_judul[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
