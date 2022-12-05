package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    private Button btnServiceStart,btnServiceStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        btnServiceStart= findViewById(R.id.btnServiceStart);
        btnServiceStop = findViewById(R.id.btnServiceStop);

        btnServiceStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ServiceExample.class);
                startService(intent);
            }
        });

        btnServiceStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ServiceExample.class);
                stopService(intent);
            }
        });
    }
}