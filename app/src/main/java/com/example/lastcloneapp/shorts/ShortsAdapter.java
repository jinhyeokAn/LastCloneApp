package com.example.lastcloneapp.shorts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.Shorts_RecvHolder> {
    LayoutInflater inflater;

    public ShortsAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public Shorts_RecvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_shorts,parent,false);

        return new Shorts_RecvHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Shorts_RecvHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Shorts_RecvHolder extends RecyclerView.ViewHolder {
        public Shorts_RecvHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
