package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RateUsPage extends AppCompatActivity {

    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us_page);
        submit_btn=findViewById(R.id.submitbtn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),"Submitted Succesfully",Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(getApplicationContext(),five.class);
                startActivity(i1);
                finish();

            }
        });


    }
}