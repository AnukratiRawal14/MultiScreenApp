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

public class tabB2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_b2,container,false);
        GridView gv = rootView.findViewById(R.id.shapes_tab2);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getColorTab2());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getColorTab2(){

        ArrayList<Model> color = new ArrayList<>();

        Model colors = new  Model("Red",R.drawable.red,R.raw.red);
        color.add(colors);

        colors = new  Model("Green",R.drawable.green,R.raw.green);
        color.add(colors);


        colors = new  Model("Blue",R.drawable.blue,R.raw.blue);
        color.add(colors);

        colors = new  Model("Pink",R.drawable.pink,R.raw.pink);
        color.add(colors);


        colors = new  Model("Orange",R.drawable.orange,R.raw.orange);
        color.add(colors);


        colors = new  Model("Yellow",R.drawable.yellow,R.raw.yellow);
        color.add(colors);


        return color;
    }

    @Override
    public String toString() {
        String title ="Colors";
        return title;
    }
}

