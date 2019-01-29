package com.ithome.mydynamicintentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imagViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
//
//        if (bundle!=null)
//        {
//            String btnName = bundle.getString("btnName");
//            showDetails(btnName);
//        }
//    }
//
//    private void showDetails(String btnName) {
//
//        if (btnName.equals("bangladesh"))
//        {
////            imageView.setImageResource(R.drawable.bangladesh);
//            textView.setText(R.string.bangladesh);
//        }
//        if (btnName.equals("india"))
//        {
////            imageView.setImageResource(R.drawable.india);
//            textView.setText(R.string.india);
//        }
//        if (btnName.equals("pakistan"))
//        {
////            imageView.setImageResource(R.drawable.pakistan);
//            textView.setText(R.string.pakistan);
//        }
//        try {
//            //Get the ID
////            Field resourceField = R.string.class.getDeclaredField("yourResourceName");
//            Field resourceField = R.string.class.getDeclaredField(btnName);
//
//            //Here we are getting the String id in R file...But you can change to R.drawable or any other resource you want...
//            int resourceFieldInt= resourceField.getInt(resourceField);
//
////
//            //Here you can use it as usual
//            // set String & Image
//            imageView.setImageResource(resourceFieldInt);
//            textView.setText(resourceFieldInt);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
