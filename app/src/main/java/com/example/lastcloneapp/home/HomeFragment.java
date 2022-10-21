package com.example.lastcloneapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    TabLayout tabs;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_home, container, false);
         recyclerView = v.findViewById(R.id.recv_home);
         tabs = v.findViewById(R.id.tabs);

         tabs.addTab(tabs.newTab().setText("전체"));
         tabs.addTab(tabs.newTab().setText("게임"));
         tabs.addTab(tabs.newTab().setText("음악"));
         tabs.addTab(tabs.newTab().setText("스케치코미디"));
         tabs.addTab(tabs.newTab().setText("믹스"));
         tabs.addTab(tabs.newTab().setText("실시간"));
         tabs.addTab(tabs.newTab().setText("액션 어드벤쳐 게임"));
         tabs.addTab(tabs.newTab().setText("랩"));
         tabs.addTab(tabs.newTab().setText("요리"));
         tabs.addTab(tabs.newTab().setText("축구"));
         tabs.addTab(tabs.newTab().setText("공예"));
         tabs.addTab(tabs.newTab().setText("최근에 업로드한 영상"));
         tabs.addTab(tabs.newTab().setText("감상한 동영상"));
         tabs.addTab(tabs.newTab().setText("게시물"));
         tabs.addTab(tabs.newTab().setText("의견보내기"));
        ArrayList<HomeDTO> list = new ArrayList<>();
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_baseline_arrow_downward_24,R.drawable.ic_launcher_background));
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_baseline_arrow_downward_24,R.drawable.ic_launcher_background));
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_baseline_arrow_downward_24,R.drawable.ic_launcher_background));
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_baseline_arrow_downward_24,R.drawable.ic_launcher_background));
        list.add(new HomeDTO("테스트1","테스트1","50","5", R.drawable.ic_baseline_arrow_downward_24,R.drawable.ic_launcher_background));
         HomeAdapter adapter = new HomeAdapter(inflater, getContext());
        adapter.setList(list);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(
          getContext(),RecyclerView.VERTICAL,false
        );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

         return  v;
    }
}