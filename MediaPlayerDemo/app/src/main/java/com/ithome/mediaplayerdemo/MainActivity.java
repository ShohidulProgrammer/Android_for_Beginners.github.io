package com.ithome.mediaplayerdemo;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playBtn,pauseBtn;
    private MediaPlayer mediaPlayer;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = findViewById(R.id.playBtnId);
        pauseBtn= findViewById(R.id.pauseBtnId);
//        mediaPlayer = MediaPlayer.create(this, R.raw.sura_fatiha);

        playBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()== R.id.playBtnId)
        {
            if (mediaPlayer!=null)
            {
                mediaPlayer.start();
                int duration = mediaPlayer.getDuration()/1000;
                Toast.makeText(MainActivity.this, "Audio Played"+duration, Toast.LENGTH_SHORT).show();

            }
        }
        if (view.getId()== R.id.pauseBtnId)
        {
            if (mediaPlayer!=null)
            {
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this, "Audio Paused", Toast.LENGTH_SHORT).show();

            }
        }

//        public void showDetails()
//        {
//            titleTextView.setText(audioName[count]);
//            finalTime = mediaPlayer.getDuration();
//            durationTextView.setText(String.format("%d:%d",
//                    TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
//                    TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
//                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
//                                finalTime))
//                    ));
    }



    protected void onDestroy() {

        if (mediaPlayer!=null && mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer=null;
        }

        super.onDestroy();
    }
}
