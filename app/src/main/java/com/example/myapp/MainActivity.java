package com.example.myapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    LinearLayout LL;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL = (LinearLayout) findViewById(R.id.LL);

    }

    public void dialog(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("button 1");
        adb.setMessage("this is an alert dialog");

        AlertDialog ad=adb.create();
        ad.show();

    }


    public void dialog_button(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("button 2");
        adb.setMessage("this is an alert dialog");
        adb.setIcon(R.drawable.scratch);

        AlertDialog ad=adb.create();
        ad.show();

    }

    public void cancel(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("button 3");
        adb.setMessage("click the button");
        adb.setIcon(R.drawable.android);
        adb.setCancelable(false);
        adb.setPositiveButton("click me", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void change(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("button 4");
        adb.setMessage("change background, press the cancel button to go back");
        adb.setCancelable(false);
        adb.setPositiveButton("click to chnage background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            LL.setBackgroundColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });


        AlertDialog ad=adb.create();
        ad.show();

    }

    public void chnage_revert(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("button 5");
        adb.setMessage("change background or reset, press cancel button to close popup message");
        adb.setCancelable(false);
        adb.setPositiveButton("click to chnage background", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LL.setBackgroundColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
            }
        });

        adb.setNegativeButton("reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LL.setBackgroundColor(Color.WHITE);
            }
        });

        adb.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });


        AlertDialog ad=adb.create();
        ad.show();
    }
}
