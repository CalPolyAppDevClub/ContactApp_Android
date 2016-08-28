package com.example.kris.contactapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Activity that ask for the emails
 *
 * @author Dung Trinh (dungtrinh1993@gmail.com)
 * @version 1 - init commit. - Flow established
 */
public class EmailActivity extends AppCompatActivity {

    protected Button goButton;
    protected EditText emailText;
    /**The string value to check user input*/
    protected String userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.userEmail = "";
        initLayout();
        initListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * Init the layout components
     */
    protected void initLayout() {
        setContentView(R.layout.fragment_email);
        this.goButton = (Button) findViewById(R.id.email_next_button);
        this.emailText = (EditText) findViewById(R.id.email_edit_text);
    }

    /**
     * Init the listener for all the component
     */
    protected void initListener() {
        this.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userEmail = emailText.getText().toString();
                if (userEmail.equals("")) {
                    Toast.makeText(getApplicationContext(), "Missing the email",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), NameActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
