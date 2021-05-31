package com.computerstudent.madpractical.Practical_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.computerstudent.madpractical.Practical_14.gridView;
import com.computerstudent.madpractical.Practical_14.listView;
import com.computerstudent.madpractical.R;

public class selectQuestionPractical16 extends AppCompatActivity {
    Button btnTimePicker,btnDatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_question2);
        btnDatePicker=findViewById(R.id.btnDatePicker);
        btnTimePicker=findViewById(R.id.btnTimePicker);

    }

    public void onClick(View view) {
        if( btnDatePicker.getId()==view.getId())
        {
            startActivity(new Intent(this, datePicker.class));
        }
        else if( btnTimePicker.getId()==view.getId())
        {
            startActivity(new Intent(this, timePiker.class));
        }
    }
}