package com.example.multiscreenapp.mGridView;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.multiscreenapp.R;
import com.example.multiscreenapp.mData.Model;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<Model> animals;
    LayoutInflater inflater;
    MediaPlayer mediaPlayer;


    public CustomAdapter(Context c, ArrayList<Model> animals) {
        this.c = c;
        this.animals = animals;
    }

    @Override
    public int getCount()
    {
        return animals.size();
    }

    @Override
    public Object getItem(int position)
    {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(inflater == null){
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(view == null){
            view=inflater.inflate(R.layout.grid_layout,viewGroup,false);
        }

        TextView nameTxt = (TextView) view.findViewById(R.id.text1);
        ImageView image = (ImageView) view.findViewById(R.id.Image);
        ImageButton button = (ImageButton) view.findViewById(R.id.buttonImage);


        final String name = animals.get(position).getName();
        int img = animals.get(position).getImage();
        final int aAudio = animals.get(position).getAudio();


        nameTxt.setText(name);
        image.setImageResource(img);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(c,aAudio);
                mediaPlayer.start();
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
