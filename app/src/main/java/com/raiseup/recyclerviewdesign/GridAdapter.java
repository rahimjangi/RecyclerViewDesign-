package com.raiseup.recyclerviewdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private List<String> countries;
    private List<Integer> imageList;

    public GridAdapter(Context context, List<String> countries, List<Integer> imageList) {
        this.context = context;
        this.countries = countries;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_design, parent, false);
        ImageView imageView = view.findViewById(R.id.grid_imageView);
        TextView textView = view.findViewById(R.id.grid_textView);
        imageView.setImageResource(imageList.get(position));
        textView.setText(countries.get(position));

        return view;
    }

}
