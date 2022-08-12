package com.example.myloginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {
    Button register_button,Login_btn;
    EditText username_var;
    EditText password_var;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);

        register_button=findViewById(R.id.Register_Button);
        Login_btn=findViewById(R.id.loginbtn);
        username_var=findViewById(R.id.username_U);
        password_var=findViewById(R.id.password_P);
        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = username_var.getText().toString();
                password = password_var.getText().toString();
                if (!username.isEmpty()) {
                    username_var.setError(null);
                    username_var.setEnabled(true);
                    if (!password.isEmpty()) {
                        password_var.setError(null);
                        password_var.setEnabled(true);
                        final String useraname_data=username_var.getText().toString();
                        final String password_data=password_var.getText().toString();
                        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
                        DatabaseReference databaseReference=firebaseDatabase.getReference("datauser");
                        Query check_username=databaseReference.orderByChild("username").equalTo(useraname_data);
                        check_username.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if(snapshot.exists()){
                                    username_var.setError(null);
                                    username_var.setEnabled(false);
                                    String password_check=snapshot.child(useraname_data).child("password").getValue(String.class);
                                    if(password_check.equals(password_data)){
                                        password_var.setError(null);
                                        password_var.setEnabled(false);
                                        Toast.makeText(getApplicationContext(),"Login Succesfully",Toast.LENGTH_SHORT).show();

                                        Intent intent=new Intent(getApplicationContext(),Dashboard.class);
                                        startActivity(intent);
                                        finish();
                                        String nameFromDB = snapshot.child(useraname_data).child("name").getValue(String.class);
                                        String usernameFromDB = snapshot.child(useraname_data).child("username").getValue(String.class);
                                        String phoneNoFromDB = snapshot.child(useraname_data).child("phoneNo").getValue(String.class);
                                        String emailFromDB = snapshot.child(useraname_data).child("email").getValue(String.class);
                                        Intent intent1 = new Intent(getApplicationContext(), six.class);
                                        intent1.putExtra("name", nameFromDB);
                                        intent1.putExtra("username", usernameFromDB);
                                        intent1.putExtra("email", emailFromDB);
                                        intent1.putExtra("phoneNo", phoneNoFromDB);

                                       // startActivity(intent1);
                                    }
                                    else
                                    {
                                        password_var.setError("Wrong Password");
                                    }
                                }
                                else{
                                    username_var.setError("User Does not exists");
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    } else {
                        password_var.setError("Please enter the Password");
                    }

                }

                else

                {
                    username_var.setError("Please Enter the Username");
                }

            }
        });

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),register.class);
                startActivity(intent);
                finish();
            }
        });







    }
}