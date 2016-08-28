package com.example.kris.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kid on 8/27/16.
 */
public class NameActivity extends Activity {
    protected Button goButton;
    protected EditText firstName;
    protected EditText lastName;

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
        setContentView(R.layout.fragment_name);
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
