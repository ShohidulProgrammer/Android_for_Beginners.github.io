package com.ithome.myalertdialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitBtn;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitBtn = findViewById(R.id.exitBtnId);

        exitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //for setting alert title
        alertDialogBuilder.setTitle(R.string.alert_title);

        // for setting alert massage
        alertDialogBuilder.setMessage(R.string.alert_massage);

        // for setting Alert Icon
        //alertDialogBuilder.setIcon(R.drawable.question_icon);

        // for setting up not cancel the dialog interface
        // if click on the out side of the dialog interface
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // exit the program
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //cancel the dialog box
                dialogInterface.cancel();

            }
        });

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "No Changes has been made.",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}
