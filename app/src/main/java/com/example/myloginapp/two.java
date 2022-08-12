package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class two extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btn1= findViewById(R.id.button);
        btn2= findViewById(R.id.button2);
        btn3= findViewById(R.id.button3);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), pdfmarathi.class);
                startActivity(i);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent i1 = new Intent(getApplicationContext(), pdfenglish.class);
                startActivity(i1);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent i2 = new Intent(getApplicationContext(), hindipdf.class);
                startActivity(i2);
            }

        });

    }
}