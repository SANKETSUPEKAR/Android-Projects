package com.computerstudent.madpractical.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class gridView extends AppCompatActivity {
    String [] namesOfLang;
    Button[] btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView gridView=findViewById(R.id.gridView);
        namesOfLang= new String[]{"HTML and CSS", "Python", "Java", "JavaScript", "Swift", "C++", "C#", "R", "Golang (Go)","HTML and CSS", "Python", "Java", "JavaScript", "Swift", "C++", "C#", "R", "Golang (Go)","HTML and CSS", "Python", "Java", "JavaScript", "Swift", "C++", "C#", "R", "Golang (Go)"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,namesOfLang);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(gridView.this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}