package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("message","SecondActivity-onCreate(Bundle savedInstanceState)");
        goBack= findViewById(R.id.buttonBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ActivityLifecycleActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message","SecondActivity-onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message","SecondActivity-onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","SecondActivity-onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message","SecondActivity-onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message","SecondActivity-onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message","SecondActivity-onRestart()");
    }

}