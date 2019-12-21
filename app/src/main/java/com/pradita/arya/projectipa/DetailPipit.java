package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailPipit extends AppCompatActivity {

    ImageView playpipit;
    MediaPlayer mppipit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pipit);

        playpipit = findViewById(R.id.playpipit);
        mppipit = MediaPlayer.create(this, R.raw.pipit);

        playpipit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailPipit.this, "Sedang Memutar Suara Pipit", Toast.LENGTH_LONG).show();
                mppipit.start();
            }
        });
    }
}
