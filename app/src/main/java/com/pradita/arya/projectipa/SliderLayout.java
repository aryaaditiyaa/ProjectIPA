package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SliderLayout extends AppCompatActivity {

    ViewPager mSlideViewPager;
    SliderAdapter sliderAdapter;
    Button btnmulai;
    ImageView dotspage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_layout);

        mSlideViewPager = findViewById(R.id.slideViewPager);
        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);
        mSlideViewPager.addOnPageChangeListener(viewListener);

        btnmulai = findViewById(R.id.btnMulai);
        btnmulai.setVisibility(View.INVISIBLE);

        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuutama = new Intent(SliderLayout.this, MainActivity.class);
                startActivity(menuutama);
            }
        });

        dotspage1 = findViewById(R.id.dotspage1);
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            if (position == 0) {
                btnmulai.setVisibility(View.INVISIBLE);
                dotspage1.setImageResource(R.drawable.dots_page1);
                dotspage1.setVisibility(View.VISIBLE);
            } else if (position == 1) {
                btnmulai.setVisibility(View.INVISIBLE);
                dotspage1.setImageResource(R.drawable.dots_page2);
                dotspage1.setVisibility(View.VISIBLE);
            } else {
                btnmulai.setVisibility(View.VISIBLE);
                dotspage1.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
