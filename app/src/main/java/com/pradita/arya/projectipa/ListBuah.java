package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class ListBuah extends AppCompatActivity {

    RelativeLayout jeruk, pisang, apel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_buah);

        jeruk = findViewById(R.id.jeruk);
        jeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Djeruk = new Intent(ListBuah.this, DetailJeruk.class);
                startActivity(Djeruk);
            }
        });

        pisang = findViewById(R.id.pisang);
        pisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dpisang = new Intent(ListBuah.this, DetailPisang.class);
                startActivity(Dpisang);
            }
        });

        apel = findViewById(R.id.apel);
        apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Djeruk = new Intent(ListBuah.this, DetailApel.class);
                startActivity(Djeruk);
            }
        });
    }
}
