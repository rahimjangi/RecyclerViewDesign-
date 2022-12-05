package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void onButtonClicked(View view){
        Toast.makeText(ScrollViewActivity.this,((Button)view).getText().toString(),Toast.LENGTH_SHORT).show();
        System.out.println(((Button)view).getText().toString() +" clicked!" );
    }
}