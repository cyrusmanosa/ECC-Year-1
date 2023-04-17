package com.example.trywebapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter <ViewHolder> {
    static final String[][] CITYS =
    {
        {"大阪","Osaka"},
        {"名古屋","Nagoya"},
        {"京都","Kyoto"},
        {"横浜","Yokohama"},
        {"神戸","Kobe"},
        {"鹿児島","Kagoshima"},
        {"札幌","Sapporo"}
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemXml = LayoutInflater.from( parent.getContext() ).inflate(R.layout.one_layout,parent,false);
        return new ViewHolder(itemXml);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){ holder.itemName.setText(CITYS[position][0]); }
    @Override
    public int getItemCount(){
        return CITYS.length;
    }
}
