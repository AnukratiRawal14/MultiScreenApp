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

public class tabB1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tab_b1,container,false);
        GridView gv = rootView.findViewById(R.id.shapes_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getShapesTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getShapesTab1(){

        ArrayList<Model> shape = new ArrayList<>();

        Model shapes = new  Model("Circle",R.drawable.circle,R.raw.circle);
        shape.add(shapes);

        shapes = new  Model("Triangle",R.drawable.triangle,R.raw.triangle);
        shape.add(shapes);

        shapes = new Model("Square",R.drawable.square,R.raw.square);
        shape.add(shapes);

        shapes = new Model("Rectangle",R.drawable.rectangle,R.raw.rectangle);
        shape.add(shapes);

        shapes = new  Model("Oval",R.drawable.oval,R.raw.oval);
        shape.add(shapes);

        shapes = new  Model("Star",R.drawable.star,R.raw.star);
        shape.add(shapes);


        return shape;
    }

    @Override
    public String toString() {
        String title ="Shapes";
        return title;
    }
}
