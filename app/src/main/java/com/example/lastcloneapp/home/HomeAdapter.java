package com.example.lastcloneapp.home;


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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.RecvHolder> {
LayoutInflater inflater;
Context context;
ArrayList<HomeDTO> list;

    public void setList(ArrayList<HomeDTO> list) {
        this.list = list;
    }

    public HomeAdapter(LayoutInflater inflater, Context context) {
        this.inflater = inflater;
        this.context = context;
    }

    @NonNull
    @Override
    public RecvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_home, parent, false);

        return new RecvHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecvHolder h, int i) {
        h.profile_img.setImageResource(list.get(i).getProfile_img());
        h.thumbnail_img.setImageResource(list.get(i).getThumbnail_img());
        h.title.setText(list.get(i).getTitle());
        h.tv_id.setText(list.get(i).getId());
        h.tv_views.setText(list.get(i).getViews() + "회");
        h.tv_time.setText(list.get(i).getTime()+"세일전");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecvHolder extends RecyclerView.ViewHolder{
        TextView title, tv_id, tv_views, tv_time;
        ImageView thumbnail_img, profile_img;

        public RecvHolder(@NonNull View v) {
            super(v);
            title = v.findViewById(R.id.title);
            tv_id = v.findViewById(R.id.tv_id);
            tv_views = v.findViewById(R.id.tv_views);
            tv_time = v.findViewById(R.id.tv_time);
            thumbnail_img = v.findViewById(R.id.thumbnail_img);
            profile_img =v.findViewById(R.id.profile_img);
        }
    }

    public void Count_View(int views,@NonNull RecvHolder h, int i){
       String view = list.get(i).getViews()+"";
        if(views <1000 ){
            h.tv_views.setText( view+ "회전");
        }else if(views >=1000){
            view = views/1000 + "";
            h.tv_views.setText( view+ "천만회");

        }
    }
}
