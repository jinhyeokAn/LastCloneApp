package com.example.lastcloneapp.locker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

import java.util.ArrayList;

public class LockerAdapter extends RecyclerView.Adapter<LockerAdapter.ViewHolder> {
    LayoutInflater inflater;
    Context context;
    ArrayList<LockerDTO> list;


    public void setList(ArrayList<LockerDTO> list) {
        this.list = list;
    }

    public LockerAdapter(LayoutInflater inflater, Context context) {
        this.inflater = inflater;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_locker,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.list_img.setImageResource(list.get(i).getList_img());
        h.tv_title.setText(list.get(i).getTv_title());
        h.tv_count.setText("동영상" + list.get(i).getTv_count() + "개");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView list_img;
        TextView tv_count, tv_title;
        public ViewHolder(@NonNull View v) {
            super(v);
            list_img = v.findViewById(R.id.list_img);
            tv_count = v.findViewById(R.id.tv_count);
            tv_title = v.findViewById(R.id.tv_title);
        }
    }
}
