package com.ithome.myclockdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnalogClock analogClock;
    DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogClockId);
        digitalClock = findViewById(R.id.digitalClockId);

        analogClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.analogClockId)
        {
            Toast.makeText(MainActivity.this,"This is Analog Clock", Toast.LENGTH_SHORT).show();
        }

        if (view.getId()==R.id.digitalClockId)
        {
            Toast.makeText(MainActivity.this,"This is Digital Clock", Toast.LENGTH_SHORT).show();
        }


    }
}
