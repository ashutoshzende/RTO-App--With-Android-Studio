package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {

    EditText name,username,password,email,phone;
    Button button;
    FirebaseDatabase firebasedatase;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name = findViewById(R.id.name);
        username = findViewById(R.id.username_U);
        password = findViewById(R.id.password_P);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        button= findViewById(R.id.register);
        Button one=findViewById((R.id.AlreadyUser));



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String full_name = name.getText().toString();
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String mail = email.getText().toString();
                String phone_no = phone.getText().toString();
                if (!full_name.isEmpty()) {
                    name.setError(null);
                    name.setEnabled(true);
                    if (!user.isEmpty()) {
                        username.setError(null);
                        username.setEnabled(true);
                        if (!mail.isEmpty()) {
                            email.setError(null);
                            email.setEnabled(true);
                            if (!phone_no.isEmpty() ) {
                                phone.setError(null);
                                phone.setEnabled(true);
                                if (!pass.isEmpty()) {
                                    password.setError(null);
                                    password.setEnabled(true);
                                    if(mail.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                                        firebasedatase=firebasedatase.getInstance();
                                        reference=firebasedatase.getReference("datauser");
                                        String full_name_s = name.getText().toString();
                                        String user_s = username.getText().toString();
                                        String mail_s = email.getText().toString();
                                        String phone_no_s = phone.getText().toString();
                                        String pass_s = password.getText().toString();

                                        StoringData storingData_s=new StoringData(full_name_s,user_s,mail_s,phone_no_s,pass_s);
                                        reference.child(user_s).setValue(storingData_s);
                                        Toast.makeText(getApplicationContext(),"Register Succesfully",Toast.LENGTH_SHORT).show();
                                        Intent intent=new Intent(getApplicationContext(),Dashboard.class);
                                        startActivity(intent);
                                        finish();

                                    }else{
                                        email.setError("Invalid Email");
                                    }

                                } else {
                                    password.setError("Please Enter Password");
                                }

                            } else {
                                phone.setError("Please Enter Phone number");
                            }

                        } else {
                            email.setError("Please Enter E-mail Id");
                        }
                    }
                    else
                    {
                        username.setError("Please Enter The Username");
                    }
                }

                else {
                    name.setError("Please Enter The FullName");
                }

            }


        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(register.this,login.class);
                startActivity(intent);


            }
        });
    }
}