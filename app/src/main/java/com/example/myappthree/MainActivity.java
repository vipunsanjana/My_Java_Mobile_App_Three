package com.example.myappthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gv_count;
    private ArrayList<String> num_list = new ArrayList<>();
    private GridViewAdapter gridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv_count = findViewById(R.id.gv_count);


        num_list.add("0");
        num_list.add("1");
        num_list.add("2");
        num_list.add("3");
        num_list.add("4");
        num_list.add("5");
        num_list.add("6");
        num_list.add("7");
        num_list.add("8");
        num_list.add("9");

        gridViewAdapter = new GridViewAdapter(MainActivity.this,num_list);

    }
}