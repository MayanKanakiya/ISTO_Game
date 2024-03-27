package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    Button bt1; //ADD button Declaration
    EditText et1; //New text Declaration
    ListView lt1; //List view Declaration
    List<String> friends = new ArrayList<String>(); //Define new array

    String [] startinglist= {"ABC","BCD","CDE","DEF"}; // Sample for array

    ArrayAdapter ad; //Define new adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        bt1 = findViewById(R.id.bt1); //call by id for add button
        et1 = findViewById(R.id.et1); //call by id for edit text
        lt1 = findViewById(R.id.lt1); //call by id for list view

        friends = new ArrayList<String>(Arrays.asList(startinglist));

        ad = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, friends);

        lt1.setAdapter(ad);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newname = et1.getText().toString();
                friends.add(newname);
                Collections.sort(friends);  	//sorting of list
                ad.notifyDataSetChanged();	//Notify change to List View through adapter
            }
        });

//toast event through click listener
        lt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, " pos= " + i + " name= " + friends.get(i) , Toast.LENGTH_SHORT).show();
            }
        });
    }
}