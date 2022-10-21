package com.example.lastcloneapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.lastcloneapp.home.HomeFragment;
import com.example.lastcloneapp.locker.LockerFragment;
import com.example.lastcloneapp.shorts.ShortsActivity;
import com.example.lastcloneapp.shorts.ShortsFragment;
import com.example.lastcloneapp.subscribe.SubscribeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu1){
                     getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                }else if(item.getItemId() == R.id.menu2){
                    Intent intent = new Intent(MainActivity.this, ShortsActivity.class);
                    startActivity(intent);
                  /*  getSupportFragmentManager().beginTransaction().replace(R.id.container, new ShortsFragment()).commit();*/
                }else if(item.getItemId() == R.id.menu3){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new SubscribeFragment()).commit();
                }else if(item.getItemId() == R.id.menu4){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new LockerFragment()).commit();
                }


                return true;
            }
        });
    }
}