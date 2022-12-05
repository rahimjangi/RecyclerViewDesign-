package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerAdapter recyclerAdapter;

    private List<String>countries= new ArrayList<>();
    private List<String>detailsList= new ArrayList<>();
    private List<Integer>imageList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView= findViewById(R.id.my_recycler_view);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        countries= Arrays.asList(getResources().getStringArray(R.array.countries));
        detailsList= Arrays.asList(getResources().getStringArray(R.array.details));
        for (String country:getResources().getStringArray(R.array.countries)){
            imageList.add(getResources().getIdentifier(country, "drawable",getPackageName()));
        }

        recyclerAdapter= new RecyclerAdapter(countries,detailsList,imageList,MainActivity.this);
        myRecyclerView.setAdapter(recyclerAdapter);
        TextView textView= findViewById(R.id.textView);
        textView.setText("MASH RAHIM");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"nothing",Toast.LENGTH_SHORT).show();
            }
        });




    }
}