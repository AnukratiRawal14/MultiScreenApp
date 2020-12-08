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


public class tabA2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a2,container,false);
        GridView gv = rootView.findViewById(R.id.animal_tab2);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getWildAnimalsTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getWildAnimalsTab1(){


        ArrayList<Model> wanimals = new ArrayList<>();

        Model wild= new Model("Tiger",R.drawable.tiger,R.raw.tiger);
        wanimals.add(wild);

        wild = new Model("Deer",R.drawable.deer,R.raw.deer);
        wanimals.add(wild);


        wild = new Model("Lion",R.drawable.lion,R.raw.lion4);
        wanimals.add(wild);


        wild = new Model("Zebra",R.drawable.zebra,R.raw.zebra);
        wanimals.add(wild);


        wild = new Model("Bear",R.drawable.beer,R.raw.bear);
        wanimals.add(wild);


        wild = new Model("Rhinoceros",R.drawable.rhinoceros,R.raw.rhinoceros);
        wanimals.add(wild);



        return wanimals;
    }


    @Override
    public String toString() {
        String title ="Wild Animals";
        return title;
    }
}
