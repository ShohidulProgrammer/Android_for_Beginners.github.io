package com.ithome.myratingbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView ratingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set value in UI Frame Position by Id
        ratingBar = findViewById(R.id.ratingBarId);
        ratingTextView = findViewById(R.id.ratingTextViewId);
        ratingTextView.setText("Rating: "+ratingBar.getProgress());

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                ratingTextView.setText("You are Rate: "+rating);
            }
        });
    }
}
