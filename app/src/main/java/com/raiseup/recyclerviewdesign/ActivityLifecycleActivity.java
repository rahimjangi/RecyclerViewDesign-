package com.raiseup.recyclerviewdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityLifecycleActivity extends AppCompatActivity {
    private TextView textView;
    private Button add,anotherActivity;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        textView= findViewById(R.id.lifecycleTextView);
        add=findViewById(R.id.lifecycleButtonAdd);
        anotherActivity= findViewById(R.id.lifecycleButtonAnotherActivity);
        Log.d("message","ActivityLifecycleActivity-onCreate(Bundle savedInstanceState)");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textView.setText(counter+"");
            }
        });
        anotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message","ActivityLifecycleActivity-onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message","ActivityLifecycleActivity-onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","ActivityLifecycleActivity-onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message","ActivityLifecycleActivity-onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message","ActivityLifecycleActivity-onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message","ActivityLifecycleActivity-onRestart()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);


    }


}