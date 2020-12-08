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


public class tabD2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_d2,container,false);
        GridView gv = rootView.findViewById(R.id.fruits_tab2);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getFruitsTab2());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getFruitsTab2(){

        ArrayList<Model> vegetables = new ArrayList<>();

        Model v = new  Model("Potato",R.drawable.potato,R.raw.potato);
        vegetables.add(v);


        v = new Model("Curry Flower",R.drawable.curlyflower,R.raw.curlyflr);
        vegetables.add(v);

        v = new  Model("Tomato",R.drawable.tomato,R.raw.tomato);
        vegetables.add(v);

        v = new Model("Onion",R.drawable.onion,R.raw.onion);
        vegetables.add(v);

        v = new  Model("Carrot",R.drawable.carrot,R.raw.carrot);
        vegetables.add(v);

        v = new  Model("Brinjal",R.drawable.bengan,R.raw.brinjal);
        vegetables.add(v);



        return vegetables;
    }

    @Override
    public String toString() {
        String title ="Vegetables";
        return title;
    }
}


