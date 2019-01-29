package com.ithome.myfontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView regularFontTextView;
    private Typeface regularFontTypeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regularFontTextView = findViewById(R.id.regularFontTextViewId);

        regularFontTypeface = Typeface.createFromAsset(getAssets(), "font.kaushan_script/KaushanScript_Regular.otf");
        regularFontTextView.setTypeface(regularFontTypeface);
    }
}
