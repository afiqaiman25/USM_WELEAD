package com.example.usmwelead;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Accommodation extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acommodation_adfh);
    }

    public void button(View view) {
        Intent myIntent = new Intent(Accommodation.this, MainActivity.class);
        startActivityForResult(myIntent, 1);
    }

    public void button1(View view) {
        setContentView(R.layout.activity_acommodation_adfh);
    }
    public void button2(View view) {
        setContentView(R.layout.activity_acommodation_rst);
    }
    public void button3(View view) {
        setContentView(R.layout.activity_acommodation_bpcg);
    }
    public void button4(View view) {
        setContentView(R.layout.activity_acommodation_ik);
    }
}