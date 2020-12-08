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


public class tabC1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tab_c1,container,false);
        GridView gv = rootView.findViewById(R.id.alphabets_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getAlphabetsTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getAlphabetsTab1(){

        ArrayList<Model> alphabets = new ArrayList<>();

        Model alphabet = new  Model("A",R.drawable.a,R.raw.a);
        alphabets.add(alphabet);

        alphabet = new  Model("B",R.drawable.b,R.raw.b);
        alphabets.add(alphabet);

        alphabet = new Model("C",R.drawable.c,R.raw.c);
        alphabets.add(alphabet);

        alphabet = new Model("D",R.drawable.d,R.raw.d);
        alphabets.add(alphabet);

        alphabet = new  Model("E",R.drawable.e,R.raw.e);
        alphabets.add(alphabet);

        alphabet = new  Model("F",R.drawable.f,R.raw.f);
        alphabets.add(alphabet);

        alphabet = new Model("G",R.drawable.g,R.raw.g);
        alphabets.add(alphabet);

        alphabet = new  Model("H",R.drawable.h,R.raw.h);
        alphabets.add(alphabet);

        alphabet = new  Model("I",R.drawable.i,R.raw.i);
        alphabets.add(alphabet);

        return alphabets;
    }

    @Override
    public String toString() {
        String title ="Alphabets";
        return title;
    }
}

