package com.example.usmwelead;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class attraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);
    }
    public void button (View view){
        Intent myIntent=new Intent(attraction.this, MainActivity.class);
        startActivityForResult(myIntent, 1);
    }
}