package com.ithome.mydynamicintentdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshBtn, indiaBtn, pakistanBtn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshBtn = findViewById(R.id.bangladeshBtnId);
        indiaBtn= findViewById(R.id.indiaBtnId);
        pakistanBtn= findViewById(R.id.pakistanBtnId);

        bangladeshBtn.setOnClickListener(this);
        indiaBtn.setOnClickListener(this);
        pakistanBtn.setOnClickListener(this);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onClick(View view) {
//        intent = new Intent(MainActivity.this, ProfileActivity.class);

        Toast.makeText(MainActivity.this, view.getId(), Toast.LENGTH_SHORT).show();
        if (view.getId() == R.id.bangladeshBtnId)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("btnName", "Bangladesh");
            startActivity(intent);
        }
        if (view.getId() == R.id.bangladeshBtnId)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("btnName", "India");
            startActivity(intent);
        }
//        if (view.getId() == R.id.bangladeshBtnId)
//        {
//            intent = new Intent(MainActivity.this, ProfileActivity.class);
//            intent.putExtra("btnName", view.getId());
////            intent.putExtra("btnName", "Pakistan");
//            startActivity(intent);
//        }
//        intent.putExtra("btnName", view.getId());
//        startActivity(intent);
    }
}
