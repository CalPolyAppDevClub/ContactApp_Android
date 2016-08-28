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
 * Activity that show the welcome screen
 *
 * @author Dung Trinh (dungtrinh1993@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class ClassActivity extends AppCompatActivity {

    protected SeekBar seekBar;
    protected Button goButton;
    protected TextView year;
    //the seekbar use float value
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

    /**
     * Init the general layout
     */
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
        //set everyone initial as freshman
        seekBar.setProgress((int)progress * 0);
    }

    protected void initListener() {
        /**
         * The listener for the Go button
         */
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhatPlatformActivity.class);
                startActivity(intent);
            }
        });

        /**
         * The listener for the slide bar
         */
        this.seekBar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //set the year as the value of the slide bar
                year.setText(convertValue(seekBar.getProgress()));
                return false;
            }
        });
    }

    /**
     * Convert the float value from the bar to string value
     * @param value the value from seekbar
     * @return the year of the students
     */
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
