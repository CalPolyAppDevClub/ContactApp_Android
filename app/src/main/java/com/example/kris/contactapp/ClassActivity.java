package com.example.kris.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by kid on 8/27/16.
 */
public class ClassActivity extends AppCompatActivity {

    protected SeekBar seekBar;
    protected Button goButton;
    protected TextView year;
    protected String classLevel;
    private float progress = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayout();
        initListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    protected void initLayout() {
        setContentView(R.layout.fragment_class);
        this.seekBar = (SeekBar) findViewById(R.id.class_progress);
        this.goButton = (Button) findViewById(R.id.class_button);
        this.year = (TextView) findViewById(R.id.class_text_view);

        //initial first year
        year.setText("Freshman");
        //max for the slider
        /**
         * 0 - 5 Freshman
         * 6 - 10 Sophomore
         * 11 - 15 Junior
         * 16 - 20 Senior
         * 21 - 25 Grad
         */
        seekBar.setMax(25);
        //set everyone initial ois fresman
        seekBar.setProgress((int)progress * 0);
    }

    protected void initListener() {
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhatPlatformActivity.class);
                startActivity(intent);
            }
        });

        this.seekBar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                year.setText(convertValue(seekBar.getProgress()));
                return false;
            }
        });
    }

    private String convertValue(float value) {
        if (value > 20) {
            return "Grad";
        }
        else if (value > 15) {
            return "Senior";
        }
        else if (value > 10) {
            return "Junior";
        }
        else if (value > 5) {
            return "Sophomore";
        }
        return "Freshman";
    }
}
