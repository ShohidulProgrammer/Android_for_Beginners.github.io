package com.ithome.mydatepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView  correntDate;
    private Button selectDateBtn;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         correntDate = findViewById(R.id.currentDateId);
        selectDateBtn = findViewById(R.id.selectDateId);
        datePicker = findViewById(R.id.datePickerId);

        correntDate.setText(setCorrentDate());

        selectDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correntDate.setText(setCorrentDate());
            }
        });

    }

    // corrent date picker
    public String setCorrentDate()
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Corrent Date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"-");
        stringBuilder.append((datePicker.getMonth()+1)+"-");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}
