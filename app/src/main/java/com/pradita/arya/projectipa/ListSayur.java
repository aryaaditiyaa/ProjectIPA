package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class ListSayur extends AppCompatActivity {

    RelativeLayout brokoli, terong, wortel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sayur);

        brokoli = findViewById(R.id.brokoli);
        brokoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dbrokoli = new Intent(ListSayur.this, DetailBrokoli.class);
                startActivity(Dbrokoli);
            }
        });

        terong = findViewById(R.id.terong);
        terong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dterong = new Intent(ListSayur.this, DetailTerong.class);
                startActivity(Dterong);
            }
        });

        wortel = findViewById(R.id.wortel);
        wortel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dwortel = new Intent(ListSayur.this, DetailWortel.class);
                startActivity(Dwortel);
            }
        });
    }
}
