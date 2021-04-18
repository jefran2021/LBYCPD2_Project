package com.example.lbycpd2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");
    }

    //log out
    public void logOut(View v){
        //launch a new activity
        Intent i = new Intent(this, LoginActivity.class);
        i.putExtra("Alert","Logging out...");
        startActivity(i);
    }

    //launch "Maintenance Instruction" Activity
    public void launchMaintenanceInstruction(View v){

        Intent i = new Intent(this, InstructionActivity.class);
        i.putExtra("Alert","Logging out...");
        startActivity(i);

    }
    //launch "Provide Instruction" Activity
    public void launchProvideInstruction(View v){

        Intent i = new Intent(this, ProvideActivity.class);
        i.putExtra("Alert","Logging out...");
        startActivity(i);

    }

    //launch Message Activity
    public void launchMessageMechanics(View v){

        Intent i = new Intent(this, MessageActivity.class);
        i.putExtra("Alert","Logging out...");
        startActivity(i);

    }


}