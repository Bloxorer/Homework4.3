package com.example.homework43;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlantAdapter extends  RecyclerView.Adapter<PlantAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Plant> plants;

    public PlantAdapter(LayoutInflater inflater, List<Plant> plants) {
        this.inflater = inflater;
        this.plants = plants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlantAdapter.ViewHolder holder, int position) {
        Plant plant = plants.get(position);
        holder.plantview.setImageResource(plant.getPlantnumber());
        holder.plantdesc.setText(plant.getDesc());
        holder.plantpopulation.setText((plant.getPopulation()));
        holder.plantname.setText((plant.getName()));

    }

    @Override
    public int getItemCount() {
        return plants.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView plantview;
        final TextView plantname, plantpopulation, plantdesc;

        ViewHolder(View view){
            super(view);
            plantview = view.findViewById(R.id.plantView);

            plantname = view.findViewById(R.id.name);
            plantpopulation = view.findViewById(R.id.population);
            plantdesc = view.findViewById(R.id.desc);

        }

    }
}
