package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailKucing extends AppCompatActivity {

    ImageView playkucing;
    MediaPlayer mpkucing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kucing);

        playkucing = findViewById(R.id.playkucing);
        mpkucing = MediaPlayer.create(this, R.raw.kucing);

        playkucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailKucing.this, "Sedang Memutar Suara Kucing", Toast.LENGTH_LONG).show();
                mpkucing.start();
            }
        });
    }
}
