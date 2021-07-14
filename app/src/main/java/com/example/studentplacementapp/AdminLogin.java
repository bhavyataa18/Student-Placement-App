package com.example.studentplacementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
    private EditText adminusername, adminPassword;
    private Button adminlogin;
    String correct_username = "admin";
    String correct_password = "pass@123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        adminusername = findViewById(R.id.et_adminusername);
        adminPassword = findViewById(R.id.et_adminPassword);
        adminlogin = findViewById(R.id.btnlogin);

        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adminusername.getText().toString().equals("")) {
                    adminusername.setError("Name can't be empty");
                } else if (adminPassword.getText().toString().equals("")) {
                    adminPassword.setError("Password can't be empty");
                    //check password
                    Toast.makeText(AdminLogin.this, "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AdminLogin.this, "Login sucess", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AdminLogin.this, AdminHome.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}