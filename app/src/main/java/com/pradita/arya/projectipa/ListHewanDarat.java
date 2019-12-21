package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ListHewanDarat extends AppCompatActivity {

    ImageView darat, laut, udara;
    RelativeLayout anjing, kucing, gajah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hewan_darat);

        darat = findViewById(R.id.darat);
        darat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent darat = new Intent(ListHewanDarat.this, ListHewanDarat.class);
                startActivity(darat);
            }
        });

        laut = findViewById(R.id.laut);
        laut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laut = new Intent(ListHewanDarat.this, ListHewanLaut.class);
                startActivity(laut);
            }
        });

        udara = findViewById(R.id.udara);
        udara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent udara = new Intent(ListHewanDarat.this, ListHewanUdara.class);
                startActivity(udara);
            }
        });



        anjing = findViewById(R.id.anjing);
        anjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Danjing = new Intent(ListHewanDarat.this, DetailAnjing.class);
                startActivity(Danjing);
            }
        });

        kucing = findViewById(R.id.kucing);
        kucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dkucing = new Intent(ListHewanDarat.this, DetailKucing.class);
                startActivity(Dkucing);
            }
        });

        gajah = findViewById(R.id.gajah);
        gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dgajah = new Intent(ListHewanDarat.this,DetailGajah.class);
                startActivity(Dgajah);
            }
        });
    }
}
