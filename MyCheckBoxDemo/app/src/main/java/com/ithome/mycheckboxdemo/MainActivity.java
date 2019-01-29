package com.ithome.mycheckboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // declare variables
    private CheckBox milkCheckBox,sugerCheckBox,honeyChckBox,waterChckBox;
    private Button showBtn;
    private TextView productListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get CheckBox id
        milkCheckBox = findViewById(R.id.milkCheckBox_id);
        sugerCheckBox = findViewById(R.id.sugerCheckBox_id);
        honeyChckBox= findViewById(R.id.honeyCheckBox_id);
        waterChckBox = findViewById(R.id.waterCheckBox_id);

        // get Button id
        showBtn = findViewById(R.id.show_list_btn_id);
        productListView = findViewById(R.id.show_product_list_id);

        // set ProductListView when click on the showList button
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();


                // adjust or set all checkbox with Product List
                if(milkCheckBox.isChecked())
                {
                    String productList = milkCheckBox.getText().toString();
                    stringBuilder.append(productList + " is Ordered\n");
                }
                if(sugerCheckBox.isChecked())
                {
                    String productList = sugerCheckBox.getText().toString();
                    stringBuilder.append(productList + " is Ordered\n");
                }

                if(honeyChckBox.isChecked())
                {
                    String productList = honeyChckBox.getText().toString();
                    stringBuilder.append(productList + " is Ordered\n");
                }

                if(waterChckBox.isChecked())
                {
                    String productList = waterChckBox.getText().toString();
                    stringBuilder.append(productList + " is Ordered\n");
                }

                // show product List

                productListView.setText(stringBuilder);

            }
        });
    }
}
