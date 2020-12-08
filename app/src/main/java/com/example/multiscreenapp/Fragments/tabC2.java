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

public class tabC2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_c2,container,false);
        GridView gv = rootView.findViewById(R.id.alphabets_tab2);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getNumbersTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getNumbersTab1(){

        ArrayList<Model> nos = new ArrayList<>();

        Model no = new  Model("One",R.drawable.num1,R.raw.num1);
        nos.add(no);

        no = new  Model("Two",R.drawable.num2,R.raw.num2);
        nos.add(no);

        no = new Model("Three",R.drawable.num3,R.raw.num3);
        nos.add(no);

        no = new Model("Four",R.drawable.num4,R.raw.num4);
        nos.add(no);

        no = new  Model("Five",R.drawable.num5,R.raw.num5);
        nos.add(no);

        no = new  Model("Six",R.drawable.num6,R.raw.num6);
        nos.add(no);

        no = new Model("Seven",R.drawable.num7,R.raw.num7);
        nos.add(no);

        no = new  Model("Eight",R.drawable.num8,R.raw.num8);
        nos.add(no);

        no = new  Model("Nine",R.drawable.num9,R.raw.num9);
        nos.add(no);

        no = new  Model("Ten",R.drawable.num10,R.raw.num10);
        nos.add(no);

        return nos;
    }

    @Override
    public String toString() {
        String title ="Numbers";
        return title;
    }
}
