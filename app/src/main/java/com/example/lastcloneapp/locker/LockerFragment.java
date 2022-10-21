package com.example.lastcloneapp.locker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

public class LockerFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_locker, container, false);
        recyclerView = v.findViewById(R.id.recv_view);

        LockerAdapter adapter = new LockerAdapter(inflater);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
            getContext(), RecyclerView.VERTICAL, false
        );

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);


        return v;
    }
}