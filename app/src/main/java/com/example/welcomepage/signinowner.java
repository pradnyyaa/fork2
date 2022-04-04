package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class signinowner extends AppCompatActivity {

    Button button1;
    Button savebtn;
    EditText name_text;
    EditText age_text;
    EditText email_text;
    EditText address_text;
    EditText idproof_text;
    EditText phone_text;
    CheckBox check_male;
    CheckBox check_female;
    CheckBox check_ohters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinowner);

        savebtn = (Button) findViewById(R.id.button2);

        savebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                name_text = (EditText) findViewById(R.id.nametext);
                age_text = (EditText) findViewById(R.id.agetext);
                phone_text = (EditText) findViewById(R.id.phonetext);
                email_text = (EditText) findViewById(R.id.emailtext);
                address_text = (EditText) findViewById(R.id.addresstext);
                idproof_text = (EditText) findViewById(R.id.idprooftext);

            }
        });

        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }

}