package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class six extends AppCompatActivity {
    TextInputLayout fullName,email,phoneNo,password,username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        fullName=findViewById(R.id.nameError);
        fullName=findViewById(R.id.emailError);
        fullName=findViewById(R.id.phoneError);
        fullName=findViewById(R.id.usernameError);

        showAllUserData();



    }

    private void showAllUserData() {
        Intent intent1=getIntent();
        String user_username=intent1.getStringExtra("username");
        String user_name=intent1.getStringExtra("name");
        String user_email=intent1.getStringExtra("email");
        String user_phoneNo=intent1.getStringExtra("phoneNo");

        fullName.getEditText().setText(user_name);
        email.getEditText().setText(user_email);
        phoneNo.getEditText().setText(user_phoneNo);
        username.getEditText().setText(user_username);
    }
}