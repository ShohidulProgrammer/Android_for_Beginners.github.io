package com.ithome.myimageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgShoikatFb,imgShoikatFuchka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // select image
        imgShoikatFb = (ImageView) findViewById(R.id.imgshoikat);
        imgShoikatFuchka = (ImageView) findViewById(R.id.imgshoikatfuchka);

        imgShoikatFb.setOnClickListener(this);
        imgShoikatFuchka.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.imgshoikat)
        {
            Toast.makeText(MainActivity.this, "Masha Allah! shoikat tui ato sundor kare", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.imgshoikatfuchka)
        {
            Toast.makeText(MainActivity.this, "shoikat Fuchkar dokane", Toast.LENGTH_SHORT).show();
        }
    }
}
