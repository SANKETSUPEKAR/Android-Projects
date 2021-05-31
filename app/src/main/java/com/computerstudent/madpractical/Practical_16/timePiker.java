package com.computerstudent.madpractical.Practical_16;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class timePiker extends AppCompatActivity {
    TimePicker time;
    TextView timeShow;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_piker);
        time=findViewById(R.id.timePicker);
        timeShow=findViewById(R.id.timeShow);
        btnClick=findViewById(R.id.btnTime);
        time.setIs24HourView(true);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                int hour=time.getHour();
                int min=time.getMinute();
                timeShow.setText("Time : "+ hour +" : "+min);


            }
        });

    }
}