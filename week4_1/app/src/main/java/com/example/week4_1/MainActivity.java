package com.example.week4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageview_large = (ImageView) findViewById(R.id.imageView_large);
        imageview_large.setImageResource(R.drawable.cop2);
        SeekBar tuner = (SeekBar) findViewById(R.id.Seekbar_tuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastProgess;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i>1 && i<100)
                    imageview_large.setImageResource(R.drawable.cop);
//                lastProgess = i;
                else if(i>100 && i<225)
                    imageview_large.setImageResource(R.drawable.d);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageview_large.setImageResource(R.drawable.cop);
//                imageview_large.setColorFilter(Color.argb(255,0, lastProgess, 255-lastProgess));

            }
        });
    }
}
