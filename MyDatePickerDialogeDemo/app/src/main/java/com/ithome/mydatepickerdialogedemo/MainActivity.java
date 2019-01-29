package com.ithome.mydatepickerdialogedemo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button selectDatePickerBtn;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView.findViewById(R.id.textViewId);
        selectDatePickerBtn.findViewById(R.id.selectDatePickerBtnId);

        selectDatePickerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        DatePicker datePicker = new DatePicker(this);

        int correntDay = datePicker.getDayOfMonth();
        int correntMonth = (datePicker.getMonth())+1;
        int correntYear = datePicker.getYear();

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        textView.setText(dayOfMonth+"-"+month+"-"+year);
                    }
                },correntDay,correntMonth,correntYear);

        datePickerDialog.show();

    }
}
