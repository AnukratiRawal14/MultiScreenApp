package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.multiscreenapp.Adapter.PageAdapter;
import com.example.multiscreenapp.Fragments.tabA1;
import com.example.multiscreenapp.Fragments.tabA2;
import com.example.multiscreenapp.Fragments.tabA3;
import com.google.android.material.tabs.TabLayout;

public class MainActivity1 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager vp;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        vp =(ViewPager) findViewById(R.id.viewPage1);
        this.addPager1();

        tabLayout = findViewById(R.id.mTab_Id);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }
    private void addPager1(){
        PageAdapter pageAdapter = new PageAdapter(this.getSupportFragmentManager());
        pageAdapter.addFragment(new tabA1());
        pageAdapter.addFragment(new tabA2());
        pageAdapter.addFragment(new tabA3());

        vp.setAdapter(pageAdapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}