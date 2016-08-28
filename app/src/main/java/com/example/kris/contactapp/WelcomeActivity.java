package com.example.kris.contactapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

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

    protected void initLayout() {
        setContentView(R.layout.fragment_welcome);
        this.register = (Button) findViewById(R.id.welcome_next_frag_btn);

    }

    protected void initListener() {
        this.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EmailActivity.class);
                startActivity(intent);
            }
        });
    }
}
