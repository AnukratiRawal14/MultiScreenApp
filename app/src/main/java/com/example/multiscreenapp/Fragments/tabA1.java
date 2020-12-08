package com.example.multiscreenapp.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.multiscreenapp.R;
import com.example.multiscreenapp.mData.Model;
import com.example.multiscreenapp.mGridView.CustomAdapter;

import java.util.ArrayList;


public class tabA1 extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a1,container,false);
        GridView gv = rootView.findViewById(R.id.animal_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getPetAnimalsTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getPetAnimalsTab1(){

        ArrayList<Model> animals= new ArrayList<>();

        Model animal = new Model("Dog",R.drawable.dog,R.raw.dog);
        animals.add(animal);

        animal = new Model("Cow",R.drawable.cow2,R.raw.cow);
        animals.add(animal);

        animal = new Model("Horse",R.drawable.horse,R.raw.horse);
        animals.add(animal);

        animal = new Model("Cat",R.drawable.cat2jpg,R.raw.cat);
        animals.add(animal);

        animal = new Model("Camel",R.drawable.rabbit,R.raw.camel);
        animals.add(animal);

        animal = new Model("Elephant",R.drawable.elephant,R.raw.elephant);
        animals.add(animal);


        return animals;
    }

    @Override
    public String toString() {
        String title ="Pet Animals";
        return title;
    }
}
