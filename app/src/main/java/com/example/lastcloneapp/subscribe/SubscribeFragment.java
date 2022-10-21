package com.example.lastcloneapp.subscribe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;
import com.google.android.material.tabs.TabLayout;

public class SubscribeFragment extends Fragment {
    TabLayout tabs;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_subscribe, container, false);
        tabs = v.findViewById(R.id.tabs);
        recyclerView= v.findViewById(R.id.recv_sub);
        tabs.addTab(tabs.newTab().setText("전체"));
        tabs.addTab(tabs.newTab().setText("오늘"));
        tabs.addTab(tabs.newTab().setText("이어서 시청하기"));
        tabs.addTab(tabs.newTab().setText("시청하지 않음"));
        tabs.addTab(tabs.newTab().setText("실시간"));
        tabs.addTab(tabs.newTab().setText("게시물"));

        SubscribeAdapter adapter = new SubscribeAdapter(inflater);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
          getContext(), RecyclerView.VERTICAL,false
        );
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        return v;
    }
}