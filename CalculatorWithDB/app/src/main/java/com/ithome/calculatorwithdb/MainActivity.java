package com.ithome.calculatorwithdb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText output;
    private Button button1,button2,button3,addBtn,subtractBtn,equalBtn,previousResultBtn;

    int value1=0,value2=0,result=0;
    boolean add = false,subtract = false;
    String resultString,operator;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (EditText) findViewById(R.id.outputEditTextId);
        button1 = (Button) findViewById(R.id.b1Id);
        button2 = (Button) findViewById(R.id.b2Id);
        button3 = (Button) findViewById(R.id.b3Id);
        addBtn = (Button) findViewById(R.id.addBtnId);
        subtractBtn = (Button) findViewById(R.id.subtractBtnId);
        equalBtn = (Button) findViewById(R.id.equalBtnId);
        previousResultBtn = (Button) findViewById(R.id.previousResultsId);


//        SQLiteDatabase db and table Create
        this.deleteDatabase("Calculation.db");
        db = openOrCreateDatabase("Calculation",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS numbers(ID Integer PRIMARY KEY AUTOINCREMENT, value1 VARCHAR, operator VARCHAR, value2 VARCHAR, result VARCHAR);");


        //  numbers
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        // operators
        addBtn.setOnClickListener(this);
        subtractBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
        previousResultBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1Id:
                output.append("1 ");
                setNumber(1);
                break;
            case R.id.b2Id:
                output.append("2 ");
                setNumber(2);
                break;
            case R.id.b3Id:
                output.append("3 ");
                setNumber(3);
                break;
            case R.id.addBtnId:
                add = true;
                output.append("+ ");
                break;
            case R.id.subtractBtnId:
                subtract = true;
                output.append("- ");
                break;

                // result calculation
            case R.id.equalBtnId:
                output.append("= ");

                calculation();
//                output.append(resultString);

                output.setHint(value1+" "+operator+" "+value2+" = "+ resultString);
                insertValue();
                setEmpty();
                break;

            case R.id.previousResultsId:
//                Toast.makeText(MainActivity.this, "Previous Result is: ", Toast.LENGTH_SHORT).show();
                showPreviousResult();
                break;

        }
    }

    private void showPreviousResult() {

//        Cursor c = db.rawQuery("SELECT value1,operator,value2 FROM numbers", null);
//        Cursor cursor = db.rawQuery("SELECT * FROM numbers ORDER BY ID DESC LIMIT 1;", null);
        final Cursor c = db.rawQuery("select * from numbers",null);
        output.append("previous Result: ");

        try{
            // Passing values
            c.moveToFirst();
            output.append(c.getString(c.getColumnIndex("value1")));
            output.append(c.getString(c.getColumnIndex("operator")));
            output.append(c.getString(c.getColumnIndex("value2")));
            output.append(c.getString(c.getColumnIndex("result")));
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"Last Record cann't show",Toast.LENGTH_LONG).show(); e.printStackTrace();
        }


//        if (cursor.moveToFirst()){
//            do {
//                // Passing values
//                String num1 = cursor.getString(1);
//                String prevOperator = cursor.getString(2);
//                String num2 = cursor.getString(3);
//                String prevResult = cursor.getString(4);
//
//                // Do something Here with values
//                output.setHint(num1+" "+prevOperator+" "+num2+" = "+prevResult);
//            } while(cursor.moveToNext());
//        }
        c.close();
        db.close();
    }

    private void insertValue() {
        db.execSQL("INSERT INTO numbers VALUES('"+value1+"', '"+operator+"', '"+value2+"','"+result+"');");
        Toast.makeText(MainActivity.this, "Result inserted Successfully!: ", Toast.LENGTH_SHORT).show();
    }

    private void calculation() {
        if (add == true){
            result = value1 + value2;
            operator = "+";
        }
        else{
            result = value1 - value2;
            operator = "-";
        }
        resultString = Integer.toString(result);
    }

    private void setEmpty() {
        add = false;
        subtract = false;
        value2 = 0;
        value1 = 0;
        output.setText("");
    }

    public void setNumber(int number)
    {

        if (value1==0)
        {
            value1 = number;
        }
        else if (value2==0){
            value2 = number;
        }
    }


}
