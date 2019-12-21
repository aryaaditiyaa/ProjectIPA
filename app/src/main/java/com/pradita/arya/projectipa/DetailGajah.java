package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailGajah extends AppCompatActivity {

    ImageView playgajah;
    MediaPlayer mpgajah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gajah);

        playgajah = findViewById(R.id.playgajah);
        mpgajah = MediaPlayer.create(this, R.raw.gajah);

        playgajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailGajah.this, "Sedang Memutar Suara Gajah", Toast.LENGTH_LONG).show();
                mpgajah.start();
            }
        });
    }
}
