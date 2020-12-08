package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.multiscreenapp.Adapter.PageAdapter;
import com.example.multiscreenapp.Fragments.tabA1;
import com.example.multiscreenapp.Fragments.tabA2;
import com.example.multiscreenapp.Fragments.tabA3;
import com.example.multiscreenapp.Fragments.tabB1;
import com.example.multiscreenapp.Fragments.tabB2;
import com.example.multiscreenapp.Fragments.tabC1;
import com.example.multiscreenapp.Fragments.tabC2;
import com.google.android.material.tabs.TabLayout;

public class MainActivity3 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager vp;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        vp =(ViewPager) findViewById(R.id.viewPage3);
        this.addPager3();


        tabLayout = findViewById(R.id.mTab_Id);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }
    private void addPager3(){
        PageAdapter pageAdapter = new PageAdapter(this.getSupportFragmentManager());
        pageAdapter.addFragment(new tabC1());
        pageAdapter.addFragment(new tabC2());

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
