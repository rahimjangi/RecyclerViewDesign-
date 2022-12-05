package com.raiseup.recyclerviewdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    private List<String> countries;
    private List<String>detailsList;
    private List<Integer>imageList;

    private Context context;

    public RecyclerAdapter(List<String> countries, List<String> detailsList, List<Integer> imageList, Context context) {
        this.countries = countries;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.title.setText(countries.get(position));
        holder.detail.setText(detailsList.get(position));
        holder.profilePicture.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,holder.detail.getText(),Toast.LENGTH_SHORT).show();
                System.out.println(holder.detail.getText());
            }
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder{
        private TextView title,detail;
        private ImageView profilePicture;
        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.txtCountryName);
            detail=itemView.findViewById(R.id.txt_details);
            profilePicture=itemView.findViewById(R.id.profile_image);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
