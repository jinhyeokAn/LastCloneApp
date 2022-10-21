package com.example.lastcloneapp.subscribe;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

public class SubscribeAdapter extends RecyclerView.Adapter<SubscribeAdapter.Veiwholder> {
    LayoutInflater inflater;

    public SubscribeAdapter(LayoutInflater inflater) {
        this.inflater= inflater;
    }


    @NonNull
    @Override
    public Veiwholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_subscribe,parent, false);
        return new Veiwholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Veiwholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Veiwholder extends RecyclerView.ViewHolder{

        public Veiwholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
