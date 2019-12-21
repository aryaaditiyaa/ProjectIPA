package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailLumba extends AppCompatActivity {

    ImageView playlumba;
    MediaPlayer mplumba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lumba);

        playlumba = findViewById(R.id.playlumba);
        mplumba = MediaPlayer.create(this, R.raw.lumba);

        playlumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailLumba.this, "Sedang Memutar Suara Lumba-lumba", Toast.LENGTH_LONG).show();
                mplumba.start();
            }
        });
    }
}
