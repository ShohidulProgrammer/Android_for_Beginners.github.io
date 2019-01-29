package com.ithome.mygridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView gridView;
    String[] countryNames;
    int[] imageArray = {
            R.drawable.ic_fingerprint_black_24dp,
            R.drawable.ic_gps_fixed_black_24dp,
            R.drawable.ic_insert_emoticon_black_24dp,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridViewId);
        countryNames = getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter = new CustomAdapter(this,countryNames,imageArray);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String stringItem = countryNames[i];
        Toast.makeText(MainActivity.this, stringItem,Toast.LENGTH_SHORT).show();
    }
}
