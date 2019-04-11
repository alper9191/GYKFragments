package com.abeyler.gykfragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private List<Food> foodList;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_layout, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        Food food = foodList.get(position);
        myViewHolder.foodName.setText(food.getFoodName());
        myViewHolder.foodImage.setImageResource(food.getResourceId());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView foodName;
        public ImageView foodImage;
        public ImageView deleteFoodImage;
        public MyViewHolder(View view) {
            super(view);
            foodName = view.findViewById(R.id.foodName);
            foodImage = view.findViewById(R.id.foodImage);
            deleteFoodImage = view.findViewById(R.id.deleteFood);

        }
    }

    public CustomAdapter(List<Food> list){

        this.foodList = list;
    }
}
