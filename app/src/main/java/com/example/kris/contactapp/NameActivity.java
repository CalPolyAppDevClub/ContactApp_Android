package com.example.kris.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kid on 8/27/16.
 */
public class NameActivity extends AppCompatActivity {
    protected Button goButton;
    protected EditText firstName;
    protected EditText lastName;
    String TAG = "DEBUG:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create the object
        Log.d(TAG, "onCreate of NameActivity");
        initLayout();
        initListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    protected void initLayout() {
        setContentView(R.layout.fragment_name);
        Log.d(TAG, "init the layout ");
        this.goButton = (Button) findViewById(R.id.name_next_button);
        this.firstName = (EditText) findViewById(R.id.first_name_edit_text);
        this.lastName = (EditText) findViewById(R.id.last_name_edit_text);
    }

    protected void initListener() {
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassActivity.class);
                startActivity(intent);
            }
        });
    }
}
