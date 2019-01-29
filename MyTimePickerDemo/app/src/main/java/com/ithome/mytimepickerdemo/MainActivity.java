package com.ithome.mytimepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TextView timeTextView;
    private Button showTimeBtn;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeTextView = findViewById(R.id.timePickerTextViewId);
        timePicker = findViewById(R.id.timePickerId);
        showTimeBtn = findViewById(R.id.showTimeBtnId);

        //timePicker.setIs24HourView(true);

        showTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                timeTextView.setText(time);
            }
        });
    }
}
