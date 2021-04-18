package com.example.lbycpd2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        TextView signupText;

        //launch Register Activity
        signupText = findViewById(R.id.signupText);
        signupText.setOnClickListener((v -> {
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        }));
    }

    //launch Home Activity
    public void lauchHome(View v){

        Intent i = new Intent(this, HomeActivity.class);
        i.putExtra("ALERT", "logging in...");
        startActivity(i);

    }
}