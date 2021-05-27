package com.computerstudent.madpractical.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.computerstudent.madpractical.R;

public class selectQuestion extends AppCompatActivity {
    Button btnListView,btnGridView,btnImageChange,btnScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_question);
        btnListView=findViewById(R.id.btnListView);
        btnGridView=findViewById(R.id.btnGridView);
        btnImageChange=findViewById(R.id.btnImageChange);
        btnScrollView=findViewById(R.id.btnScrollView);
    }

    public void onClick(View view) {
        if( btnListView.getId()==view.getId())
        {
            startActivity(new Intent(this,listView.class));
        }
        else if( btnGridView.getId()==view.getId())
        {
            startActivity(new Intent(this,gridView.class));
        }
        else if( btnImageChange.getId()==view.getId())
        {
            startActivity(new Intent(this,imageChange.class));
        }
        else if( btnScrollView.getId()==view.getId())
        {
            startActivity(new Intent(this,scrollView.class));
        }

    }
}