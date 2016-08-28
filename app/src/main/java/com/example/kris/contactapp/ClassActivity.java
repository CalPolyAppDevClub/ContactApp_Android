package com.example.kris.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by kid on 8/27/16.
 */
public class ClassActivity extends Activity{

    protected SeekBar seekBar;
    protected Button goButton;
    protected TextView year;
    protected String classLevel;
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
        seekBar.setMax(20);
    }

    protected void initListener() {
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhatPlatformActivity.class);
                startActivity(intent);
            }
        });
    }
}
