package com.example.tryrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    static List<ArrayList<String>> bookmarkList = new ArrayList<>(
        Arrays.asList
            (
                    new ArrayList<>(Arrays.asList("Yahoo!", "https://www.yahoo.co.jp/")),
                    new ArrayList<>(Arrays.asList("Google", "https://www.google.com/")),
                    new ArrayList<>(Arrays.asList("amazon", "https://www.amazon.co.jp/-/en/?language=ja_JP")),
                    new ArrayList<>(Arrays.asList("楽天", "https://www.rakuten.co.jp/")),
                    new ArrayList<>(Arrays.asList("softbank", "https://www.softbank.jp/en/")),
                    new ArrayList<>(Arrays.asList("docomo", "https://www.docomo.ne.jp/")),
                    new ArrayList<>(Arrays.asList("KDDI", "https://www.kddi.com/"))
            ));

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemXml = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.one_layout,parent,false);
        return new ViewHolder(itemXml);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.itemName.setText(bookmarkList.get(position).get(0));
    }

    @Override
    public int getItemCount(){
        return bookmarkList.size();
    }
}
