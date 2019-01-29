package com.ithome.myrediobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup genderRadioGroup;
    private RadioButton genderRadioBtn;
    private Button showbtn;
    private TextView genderTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genderRadioGroup = findViewById(R.id.genderRadioGroupId);
        showbtn = findViewById(R.id.showBtnId);
        genderTxtView = findViewById(R.id.genderTextViewId);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedGender = genderRadioGroup.getCheckedRadioButtonId();
                genderRadioBtn = findViewById(selectedGender);

                String gender = genderRadioBtn.getText().toString();
                genderTxtView.setText("You have selected: "+gender);
            }
        });
    }
}
