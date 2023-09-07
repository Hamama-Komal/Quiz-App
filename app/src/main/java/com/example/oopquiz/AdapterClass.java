package com.example.oopquiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.oopquiz.databinding.MainItemsBinding;

import java.util.ArrayList;

public class AdapterClass extends  RecyclerView.Adapter<AdapterClass.ViewHolder>{

    public AdapterClass(ArrayList<ModelClass> list) {
        this.list = list;
    }

    ArrayList<ModelClass> list;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass modelClass = list.get(position);
        holder.binding.question.setText(modelClass.getQues());
        holder.binding.answer.setText(modelClass.getAns());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        MainItemsBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = MainItemsBinding.bind(itemView);

        }
    }
}
