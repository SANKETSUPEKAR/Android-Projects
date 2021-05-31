package com.computerstudent.madpractical.Practical_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class datePicker extends AppCompatActivity {
    Button btnClick;
    DatePicker date;
    TextView dateShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        btnClick=findViewById(R.id.btnDate);
        date=findViewById(R.id.datePicker);
        dateShow=findViewById(R.id.dateShow);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer day= date.getDayOfMonth();
                Integer month=1 + date.getMonth();
                Integer year= date.getYear();
                dateShow.setText(day+"/"+month+"/"+year);

            }
        });

    }
}