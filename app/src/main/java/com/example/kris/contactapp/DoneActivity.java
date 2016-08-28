package com.example.kris.contactapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Activity that tells the user they're done with registration
 *
 * @author Kris Campos (kcampos0101@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class DoneActivity extends AppCompatActivity {

    private static final long TIME_ON_THIS_ACTIVITY = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // timer that goes back to Welcome screen upon completion.
        new CountDownTimer(TIME_ON_THIS_ACTIVITY, TIME_ON_THIS_ACTIVITY) {
            @Override
            public void onTick(long l) {
                // do not receive updates
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}
