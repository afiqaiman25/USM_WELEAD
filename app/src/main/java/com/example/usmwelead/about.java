package com.example.usmwelead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void button (View view){
        Intent myIntent=new Intent(about.this, MainActivity.class);
        startActivityForResult(myIntent, 1);
    }
    public void browser2 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://campusonline.usm.my/"));
        startActivity(browserIntent);
    }
    public void browser3 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://elearning.usm.my/sidang2021/"));
        startActivity(browserIntent);
    }
}
