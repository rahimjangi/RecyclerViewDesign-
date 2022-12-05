package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    private List<String> countries= new ArrayList<>();
    private List<Integer>imageList= new ArrayList<>();
    private GridView gridView;
    private GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_activityl);

        gridView= findViewById(R.id.grid_view);
        countries= Arrays.asList(getResources().getStringArray(R.array.countries));
        for (String country:countries){
            imageList.add(getResources().getIdentifier(country,"drawable",getPackageName()));
        }
        gridAdapter= new GridAdapter(getApplicationContext(),countries,imageList);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),countries.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}