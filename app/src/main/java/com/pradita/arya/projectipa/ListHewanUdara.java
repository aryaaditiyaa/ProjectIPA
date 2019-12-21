package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ListHewanUdara extends AppCompatActivity {

    ImageView darat, laut, udara;
    RelativeLayout elang, pipit, merak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hewan_udara);

        darat = findViewById(R.id.darat);
        darat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent darat = new Intent(ListHewanUdara.this, ListHewanDarat.class);
                startActivity(darat);
            }
        });

        laut = findViewById(R.id.laut);
        laut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laut = new Intent(ListHewanUdara.this, ListHewanLaut.class);
                startActivity(laut);
            }
        });

        udara = findViewById(R.id.udara);
        udara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent udara = new Intent(ListHewanUdara.this, ListHewanUdara.class);
                startActivity(udara);
            }
        });

        elang = findViewById(R.id.elang);
        elang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Delang = new Intent(ListHewanUdara.this, DetailElang.class);
                startActivity(Delang);
            }
        });

        pipit = findViewById(R.id.pipit);
        pipit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dpipit = new Intent(ListHewanUdara.this, DetailPipit.class);
                startActivity(Dpipit);
            }
        });

        merak = findViewById(R.id.merak);
        merak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dmerak = new Intent(ListHewanUdara.this, DetailMerak.class);
                startActivity(Dmerak);
            }
        });
    }
}
