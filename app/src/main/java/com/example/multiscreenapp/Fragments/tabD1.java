package com.example.multiscreenapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.multiscreenapp.R;
import com.example.multiscreenapp.mData.Model;
import com.example.multiscreenapp.mGridView.CustomAdapter;

import java.util.ArrayList;


public class tabD1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_d1,container,false);
        GridView gv = rootView.findViewById(R.id.fruits_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getFruitsTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getFruitsTab1(){

        ArrayList<Model> fruits = new ArrayList<>();

        Model f =  f = new  Model("Banana",R.drawable.banana,R.raw.banana);
        fruits.add(f);

        f= new  Model("Apple",R.drawable.apple,R.raw.apple);
        fruits.add(f);

        f = new Model("Cherry",R.drawable.cherry,R.raw.cherry);
        fruits.add(f);

        f= new  Model("Orange",R.drawable.orange,R.raw.orange);
        fruits.add(f);

        f = new Model("Pineapple",R.drawable.pineapple,R.raw.pineapple);
        fruits.add(f);

        f = new  Model("Mango",R.drawable.mango,R.raw.mango);
        fruits.add(f);



        return fruits;
    }

    @Override
    public String toString() {
        String title ="Fruits";
        return title;
    }
}


