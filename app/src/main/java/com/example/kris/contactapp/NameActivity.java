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
 * Activity that ask for name from users
 *
 * @author Dung Trinh (dungtrinh1993@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class NameActivity extends AppCompatActivity {
    // Button to go to the next Activity
    protected Button goButton;
    protected EditText firstName;
    protected EditText lastName;
    String TAG = "DEBUG:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //debug tag
        Log.d(TAG, "onCreate of NameActivity");
        initLayout();
        initListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * Init all the layout components
     */
    protected void initLayout() {
        setContentView(R.layout.fragment_name);
        Log.d(TAG, "init the layout ");
        //Init the layout component
        this.goButton = (Button) findViewById(R.id.name_next_button);
        this.firstName = (EditText) findViewById(R.id.first_name_edit_text);
        this.lastName = (EditText) findViewById(R.id.last_name_edit_text);
    }

    /**
     * Init the listener for the layout
     */
    protected void initListener() {
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassActivity.class);
                //TODO: Add the components to the Intent and pass on the next
                startActivity(intent);
            }
        });
    }
}
