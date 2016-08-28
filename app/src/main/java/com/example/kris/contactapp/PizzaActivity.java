package com.example.kris.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Activity that collects the user's favorite pizza
 *
 * @author Kris Campos (kcampos0101@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Button btn = (Button) findViewById(R.id.btn_pizza);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SodaActivity.class);
                startActivity(intent);
            }
        });
    }
}
