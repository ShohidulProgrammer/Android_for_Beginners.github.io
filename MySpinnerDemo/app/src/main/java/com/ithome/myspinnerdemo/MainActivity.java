package com.ithome.myspinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countryNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.countryNames);

        spinner = findViewById(R.id.spinnerId);
        textView = findViewById(R.id.textViewId);
        button = findViewById(R.id.buttonId);

//        where it is, where to go,where to show, what content will be show
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.sample_view, R.id.textViewSampleId, countryNames);
        spinner.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });

    }
}
