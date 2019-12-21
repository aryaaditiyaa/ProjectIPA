package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailAnjing extends AppCompatActivity {

    ImageView playanjing;
    MediaPlayer mpanjing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anjing);

        playanjing = findViewById(R.id.playanjing);
        mpanjing = MediaPlayer.create(this, R.raw.anjing);

        playanjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailAnjing.this, "Sedang Memutar Suara Anjing", Toast.LENGTH_LONG).show();
                mpanjing.start();
            }
        });
    }
}
