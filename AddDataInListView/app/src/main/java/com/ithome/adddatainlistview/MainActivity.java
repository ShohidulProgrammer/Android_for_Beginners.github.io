package com.ithome.adddatainlistview;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button addBtn;
    ListView listView;
    ArrayList<String> stringArrayList;
    ArrayAdapter<String> stringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextId);
        addBtn = findViewById(R.id.button_add_data_id);
        listView = findViewById(R.id._dynamicListViewId);

        stringArrayList = new ArrayList<String>();
        stringArrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, stringArrayList);

        listView.setAdapter(stringArrayAdapter);

        onBtnClick();
    }
    public void onBtnClick()
    {
        addBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString().trim();

                if(stringArrayList.contains(input))
                {
                    Toast.makeText(MainActivity.this, "Item Already Added to the list", Toast.LENGTH_LONG).show();
                    editText.setHint("Item Already Added!");
                    editText.setText("");
                }
                else if (input == null || input.trim().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input field is Empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //add data in array index 0 or on top of the list view
                    stringArrayList.add(0,input);
                    stringArrayAdapter.notifyDataSetChanged();
                    listView.smoothScrollToPosition(0);
                    Toast.makeText(MainActivity.this, "Item is Added!", Toast.LENGTH_SHORT).show();
                    editText.setText("");

                }
            }
        });
    }
}
