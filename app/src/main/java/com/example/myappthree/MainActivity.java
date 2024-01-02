package com.example.myappthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gv_count;
    private ArrayList<String> num_list = new ArrayList<>();
    private GridViewAdapter gridViewAdapter;
    private TextView tv_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv_count = findViewById(R.id.gv_count);
        tv_grid = findViewById(R.id.tv_grid);


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
        gv_count.setAdapter(gridViewAdapter);

        gv_count.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(), num_list.get(position), Toast.LENGTH_LONG).show();
            }
        });

        tv_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}