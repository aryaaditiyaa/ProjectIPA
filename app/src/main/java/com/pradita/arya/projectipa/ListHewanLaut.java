package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ListHewanLaut extends AppCompatActivity {

    ImageView darat, laut, udara;
    RelativeLayout lumba, paus, anjinglaut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hewan_laut);

        darat = findViewById(R.id.darat);
        darat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent darat = new Intent(ListHewanLaut.this, ListHewanDarat.class);
                startActivity(darat);
            }
        });

        laut = findViewById(R.id.laut);
        laut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laut = new Intent(ListHewanLaut.this, ListHewanLaut.class);
                startActivity(laut);
            }
        });

        udara = findViewById(R.id.udara);
        udara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent udara = new Intent(ListHewanLaut.this, ListHewanUdara.class);
                startActivity(udara);
            }
        });



        lumba = findViewById(R.id.lumba);
        lumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dlumba = new Intent(ListHewanLaut.this, DetailLumba.class);
                startActivity(Dlumba);
            }
        });

        paus = findViewById(R.id.paus);
        paus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dpaus = new Intent(ListHewanLaut.this, DetailPaus.class);
                startActivity(Dpaus);
            }
        });

        anjinglaut = findViewById(R.id.anjing_laut);
        anjinglaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Danjinglaut = new Intent(ListHewanLaut.this, DetailAnjingLaut.class);
                startActivity(Danjinglaut);
            }
        });
    }
}
