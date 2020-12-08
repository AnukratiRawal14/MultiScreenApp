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


public class tabA3 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tab_a3,container,false);
        GridView gv = rootView.findViewById(R.id.animal_tab3);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getBirdsTab2());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getBirdsTab2(){

        ArrayList<Model> birds = new ArrayList<>();

        Model bird= new Model("Peacock",R.drawable.peacock,R.raw.peacock);
        birds.add(bird);

        bird = new Model("Pigeon",R.drawable.pigeon,R.raw.pigeons);
        birds.add(bird);

        bird = new Model("Parrot",R.drawable.parrot,R.raw.parrot);
        birds.add(bird);

        bird= new Model("Hummingbird",R.drawable.hummingbird,R.raw.hummingbird);
        birds.add(bird);

        bird = new Model("Crow",R.drawable.crow,R.raw.crow);
        birds.add(bird);

        bird = new Model("Owl",R.drawable.owl,R.raw.owl);
        birds.add(bird);

        return birds;
    }

    @Override
    public String toString() {
        String title ="Birds";
        return title;
    }
}