package com.ithome.spinnerwithbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] countryNames;
    private String[] population;
    int[] flags = {
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground

    };

    private boolean isFirstSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.countryNames);
        population = getResources().getStringArray(R.array.population);

        spinner = findViewById(R.id.spinnerId);
        CustomAdapter customAdapter = new CustomAdapter(this,flags,countryNames,population);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (isFirstSelection==true)
                {
                    isFirstSelection = false;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), countryNames[i]+" is selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
