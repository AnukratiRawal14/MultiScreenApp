package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Shapes/Colors
    public void onClickCard1(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    // Animals/Birds
    public void onClickCard2(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity1.class);
        startActivity(intent);
    }
    // Alphabets/Numbers
    public void onClickCard3(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }
    // Fruits/Vegetables
    public void onClickCard4(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }
}
