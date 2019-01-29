package com.ithome.mytimepickerdialogedemo;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView timeTextView;
    private Button selectTimeBtn;
    private TimePickerDialog timePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeTextView = findViewById(R.id.timePickerTextViewId);
        selectTimeBtn = findViewById(R.id.selectTimeBtnId);

        selectTimeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        TimePicker timePicker = new TimePicker(this);

        int correntHour = timePicker.getCurrentHour();
        int correntMinute = timePicker.getCurrentMinute();

        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        timeTextView.setText(hour+":"+minute);
                    }
                },correntHour,correntMinute,false
        );

        timePickerDialog.show();
    }
}
