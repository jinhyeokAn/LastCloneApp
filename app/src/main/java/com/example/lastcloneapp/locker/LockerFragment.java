package com.example.lastcloneapp.locker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastcloneapp.R;

import java.util.ArrayList;

public class LockerFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_locker, container, false);
        recyclerView = v.findViewById(R.id.recv_view);
        ArrayList<LockerDTO> list = new ArrayList<>();
        list.add(new LockerDTO("50","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("60","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("57","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("54","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("50","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("55","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("50","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("32","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("63","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("124","좋아한 동영상",R.drawable.ic_baseline_image_24));
        list.add(new LockerDTO("53","좋아한 동영상",R.drawable.ic_baseline_image_24));

        LockerAdapter adapter = new LockerAdapter(inflater,getContext());
        adapter.setList(list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
            getContext(), RecyclerView.VERTICAL, false
        );


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);


        return v;
    }
}