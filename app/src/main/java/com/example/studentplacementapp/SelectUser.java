package com.example.studentplacementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_user);
    }

    public void adminbtn(View view) {
        Intent intent1 = new Intent(this,AdminLogin.class);
        startActivity(intent1);
    }
}