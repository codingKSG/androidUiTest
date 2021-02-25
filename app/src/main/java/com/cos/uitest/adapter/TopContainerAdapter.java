package com.cos.uitest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cos.uitest.R;

import java.util.List;

public class TopContainerAdapter extends RecyclerView.Adapter<TopContainerAdapter.MyViewHolder> {

    private static final String TAG = "TopContainerAdapter2";
    private final List<Integer> others;

    public TopContainerAdapter(List<Integer> others) {
        this.others = others;
    }

    public void addItem(int position) {
        others.add(position);
        notifyDataSetChanged();
    }

    public void removeItem(int position) {
        others.remove(position);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.top_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return others.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
