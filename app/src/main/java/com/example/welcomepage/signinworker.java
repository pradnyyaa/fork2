package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signinworker extends AppCompatActivity {
    Button button1;
    EditText wname_text;
    EditText wage_text;
    EditText locality_text;
    EditText waddress_text;
    EditText widproof_text;
    EditText wphone_text;
    EditText experience_text;
    EditText worker_wage_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinworker);

        button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                wname_text = (EditText) findViewById(R.id.wnametext);
                wage_text = (EditText) findViewById(R.id.wagetext);
                wphone_text = (EditText) findViewById(R.id.wphonetext);
                experience_text = (EditText) findViewById(R.id.experiencetext);
                waddress_text = (EditText) findViewById(R.id.waddresstext);
                widproof_text = (EditText) findViewById(R.id.widprooftext);
                worker_wage_text = (EditText) findViewById(R.id.worker_wagetext);
                locality_text = (EditText) findViewById(R.id.localitytext);

            }
        });

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login() {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}