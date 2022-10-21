package com.example.lastcloneapp.shorts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lastcloneapp.R;

public class ShortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shorts);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_shorts, new ShortsFragment()).commit();
    }

}