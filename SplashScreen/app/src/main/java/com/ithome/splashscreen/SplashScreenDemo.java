package com.ithome.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreenDemo extends AppCompatActivity {

    private ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_demo);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_splash_screen_demo);

        progressBar = findViewById(R.id.progress_horizontalId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                changProgressBarValue();
                startApp();
            }
        });

        thread.start();
    }

    public void changProgressBarValue(){
        for (progress = 20; progress<=100; progress+=20)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void startApp(){

        Intent intent = new Intent(SplashScreenDemo.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
