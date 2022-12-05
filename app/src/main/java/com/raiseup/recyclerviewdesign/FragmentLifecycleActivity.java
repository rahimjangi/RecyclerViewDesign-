package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class FragmentLifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_lifecycle);
        Log.i("fragment","Activity -> onCreate");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("fragment","Activity -> onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("fragment","Activity -> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("fragment","Activity -> onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("fragment","Activity -> onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("fragment","Activity -> onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("fragment","Activity -> onRestart");
    }
}