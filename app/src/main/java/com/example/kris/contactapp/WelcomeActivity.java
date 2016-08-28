package com.example.kris.contactapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
/**
 * Activity that show the welcome screen
 *
 * @author Dung Trinh (dungtrinh1993@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class WelcomeActivity extends AppCompatActivity {

    //debugging tag. Only show in IDE
    String TAG = "DEBUG";

    //Button to go the next Activity
    protected Button register;
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
     * Inflated the layout a initialize the button for the app
     */
    protected void initLayout() {
        setContentView(R.layout.fragment_welcome);
        this.register = (Button) findViewById(R.id.welcome_next_frag_btn);
    }

    /**
     * Init the listener for the buttons
     */
    protected void initListener() {
        this.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick()");
                //Create the intent to go to the next activity
                Intent intent = new Intent(WelcomeActivity.this, EmailActivity.class);
                //TODO: Attached the components to pass to the next Activity.
                //Add the component in here
                startActivity(intent);

                Log.d(TAG, "After initiated");
            }
        });
    }
}
