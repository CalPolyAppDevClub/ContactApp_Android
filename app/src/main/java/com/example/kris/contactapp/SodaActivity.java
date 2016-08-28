package com.example.kris.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SodaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Button btn = (Button) findViewById(R.id.btn_soda);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
                startActivity(intent);
            }
        });
    }
}
