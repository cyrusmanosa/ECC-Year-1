package com.example.tryrecyclerview;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    final TextView itemName;
    static ICallWebView listener;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemName = itemView.findViewById(R.id.tv);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int position = getAdapterPosition();
                Toast.makeText(view.getContext(),
                        RecyclerAdapter.bookmarkList.get(position).get(0),
                        Toast.LENGTH_SHORT).show();
                listener.setWebViewURL(RecyclerAdapter.bookmarkList.get(position).get(1));
            }
        });
    }
}
