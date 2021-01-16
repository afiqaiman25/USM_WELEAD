package com.example.usmwelead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1 (View view){
        Intent myIntent=new Intent(MainActivity.this, about.class);
        startActivityForResult(myIntent, 1);
    }
    public void button2 (View view){
        Intent myIntent=new Intent(MainActivity.this, attraction.class);
        startActivityForResult(myIntent, 1);
    }
    public void button3 (View view){
        Intent myIntent=new Intent(MainActivity.this, Accommodation.class);
        startActivityForResult(myIntent, 1);
    }
    public void button4 (View view){
        Intent myIntent=new Intent(MainActivity.this, map.class);
        startActivityForResult(myIntent, 1);
    }
    public void browser1 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usm.my/"));
        startActivity(browserIntent);
    }
}