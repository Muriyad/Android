package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder>{
    public LaptopAdapter() {
        this.Laptop=new ArrayList<>();
        Laptop.add(new Laptops("mmm", 8, "Dell", "Intel"));
        Laptop.add(new Laptops("nnn", 9, "HP", "AMD"));
        Laptop.add(new Laptops("ooo", 10, "acer", "mmm"));
    }

    ArrayList<Laptops> Laptop;

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.laptop, parent, false);

        return new LaptopViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        holder.Name.setText(Laptop.get(position).laptopName);
        holder.Brand.setText(Laptop.get(position).laptopBrand);
        holder.Ram.setText(""+Laptop.get(position).laptopRam);
        holder.CPU.setText(Laptop.get(position).laptopCPU);
    }

    @Override
    public int getItemCount() {
        return Laptop.size();
    }

    public class LaptopViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView Ram;
        TextView Brand;
        TextView CPU;
        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.Name);
            Ram = itemView.findViewById(R.id.Ram);
            Brand = itemView.findViewById(R.id.Brand);
            CPU = itemView.findViewById(R.id.CPU);

        }
    }
}
