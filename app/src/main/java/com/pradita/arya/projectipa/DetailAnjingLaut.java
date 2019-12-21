package com.pradita.arya.projectipa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailAnjingLaut extends AppCompatActivity {

    ImageView playanjinglaut;
    MediaPlayer mpanjinglaut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anjing_laut);

        playanjinglaut = findViewById(R.id.playanjinglaut);
        mpanjinglaut = MediaPlayer.create(this, R.raw.anjinglaut);

        playanjinglaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailAnjingLaut.this, "Sedang Memutar Suara Anjing Laut", Toast.LENGTH_LONG).show();
                mpanjinglaut.start();
            }
        });
    }
}
