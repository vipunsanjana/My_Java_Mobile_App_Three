package com.example.myappthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView rv_contact;
    private ArrayList<String> names_list = new ArrayList<>();
    private RecyclerViewAdapter recyclerViewAdapter;
    private TextView tv_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rv_contact = findViewById(R.id.rv_contact);
        tv_recycler = findViewById(R.id.tv_recycle);

        names_list.add("vipun sanjana");
        names_list.add("roshith chathum");
        names_list.add("ruwan darshana");
        names_list.add("vipun sanjana");
        names_list.add("vipun sanjana");
        names_list.add("vipun sanjana");
        names_list.add("vipun sanjana");
        names_list.add("vipun sanjana");

        recyclerViewAdapter = new RecyclerViewAdapter(SecondActivity.this, names_list, new RecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getApplicationContext(), "Name "+names_list.get(position),Toast.LENGTH_LONG).show();
            }
        });
        rv_contact.setAdapter(recyclerViewAdapter);
        rv_contact.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        tv_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}