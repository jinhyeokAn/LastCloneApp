package com.example.lastcloneapp.shorts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

public class ShortsFragment extends Fragment {
    RecyclerView recv_shorts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_shorts, container, false);
       recv_shorts = v.findViewById(R.id.recv_shorts);
       ShortsAdapter adapter = new ShortsAdapter(inflater);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
          getContext(),RecyclerView.VERTICAL,false
        );

        recv_shorts.setLayoutManager(manager);
        recv_shorts.setAdapter(adapter);

       return v;
    }
}