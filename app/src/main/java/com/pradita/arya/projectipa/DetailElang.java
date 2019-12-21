package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailElang extends AppCompatActivity {

    ImageView playelang;
    MediaPlayer mpelang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_elang);

        playelang = findViewById(R.id.playelang);
        mpelang = MediaPlayer.create(this, R.raw.elang);

        playelang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailElang.this, "Sedang Memutar Suara Elang",Toast.LENGTH_LONG).show();
                mpelang.start();
            }
        });
    }
}
