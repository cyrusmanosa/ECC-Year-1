package com.example.trywebapi;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView itemName;
    static ICallWebAPI listener;
    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        itemName = itemView.findViewById(R.id.tv);
        itemView.setOnClickListener
        (
            view ->
            {
                int position = getAdapterPosition();
                Toast.makeText(view.getContext(),RecyclerAdapter.CITYS[position][0],Toast.LENGTH_SHORT).show();
                String[] item = RecyclerAdapter.CITYS[position];
                listener.receiveWeatherInfo(item[1]);
            }
        );
    }
}
