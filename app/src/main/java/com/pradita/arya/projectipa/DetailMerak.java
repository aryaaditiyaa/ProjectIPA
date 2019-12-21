package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailMerak extends AppCompatActivity {

    ImageView playmerak;
    MediaPlayer mpmerak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_merak);

        playmerak = findViewById(R.id.playmerak);
        mpmerak = MediaPlayer.create(this, R.raw.merak);

        playmerak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailMerak.this, "Sedang Memutar Suara Merak", Toast.LENGTH_SHORT).show();
                mpmerak.start();
            }
        });
    }
}
