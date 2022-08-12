package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class five extends AppCompatActivity {
    SwitchCompat switchCompat;
    Button contact_btn,about_btn,rate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES)
        {
            setTheme(R.style.Theme_Dark);

        }
        else
        {
            setTheme(R.style.Theme_Light);
        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_five);
        switchCompat=findViewById(R.id.bt_switch);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }

            }

        });

        contact_btn=findViewById(R.id.contact);
        about_btn=findViewById(R.id.about);
        rate_btn=findViewById(R.id.rate);

        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContactUsPage.class);
                startActivity(intent);

            }
        });
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(getApplicationContext(),AboutUsPage.class);
                startActivity(intent1);
            }
        });
        rate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 =new Intent(getApplicationContext(),RateUsPage.class);
                startActivity(intent2);
            }
        });
    }
}

