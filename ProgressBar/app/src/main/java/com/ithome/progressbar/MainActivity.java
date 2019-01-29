package com.ithome.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progress;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove the notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        progressBar = findViewById(R.id.progress_horizontalId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                changeProgressBarValue();
            }
        });

        thread.start();
    }

    public void changeProgressBarValue(){
        for (progress=10; progress<=100; progress+=10)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
