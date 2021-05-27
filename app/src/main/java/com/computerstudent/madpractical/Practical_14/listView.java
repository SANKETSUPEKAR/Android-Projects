package com.computerstudent.madpractical.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class listView extends AppCompatActivity {
    String [] namesOfLang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView=(ListView) findViewById(R.id.listView);
        namesOfLang= new String[]{"HTML and CSS", "Python", "Java", "JavaScript", "Swift", "C++", "C#", "R", "Golang (Go)"};
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,namesOfLang);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(listView.this,adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}