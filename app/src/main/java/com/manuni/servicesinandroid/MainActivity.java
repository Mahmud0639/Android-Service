package com.manuni.servicesinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        buttonStop = findViewById(R.id.buttonStop);

        button.setOnClickListener(this);
        buttonStop.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view == button){
            startService(new Intent(this,ServiceOfAlarm.class));
        }else if (view == buttonStop){
            stopService(new Intent(this,ServiceOfAlarm.class));
        }
    }
}