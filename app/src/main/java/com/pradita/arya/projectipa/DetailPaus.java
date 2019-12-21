package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailPaus extends AppCompatActivity {

    ImageView playpaus;
    MediaPlayer mppaus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_paus);

        playpaus = findViewById(R.id.playpaus);
        mppaus = MediaPlayer.create(this, R.raw.paus);

        playpaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailPaus.this, "Sedang Memutar Suara Paus", Toast.LENGTH_LONG).show();
                mppaus.start();
            }
        });
    }
}
