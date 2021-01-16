package com.example.usmwelead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    Button b1,b2;
    VideoView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        b1 = (Button) findViewById(R.id.play);
        b2 = (Button) findViewById(R.id.stop);
        v1=(VideoView)findViewById(R.id.videoView);
    }
    public void playVideo(View view) {
        v1.setVideoURI(Uri.parse("android.resource://"+ getApplication().getPackageName()+"/"+R.raw.vid2));
        v1.requestFocus();
        v1.start();
        Toast.makeText(getApplicationContext(), "Playing ",Toast.LENGTH_SHORT).show();

    }
    public void stopVideo(View view) {
        v1.stopPlayback();
        v1.clearFocus();
        Toast.makeText(getApplicationContext(), "Stop",Toast.LENGTH_SHORT).show();

    }
    public void button(View view) {
        Intent myIntent = new Intent(video.this, MainActivity.class);
        startActivityForResult(myIntent, 1);
    }

    public void back (View view) {
        Intent myIntent = new Intent(video.this, map.class);
        startActivityForResult(myIntent, 1);
    }
}

