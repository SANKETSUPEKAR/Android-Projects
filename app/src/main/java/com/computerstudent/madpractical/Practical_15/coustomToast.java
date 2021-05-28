package com.computerstudent.madpractical.Practical_15;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class coustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coustom_toast);

    }

    public void onClick(View view) {

        LayoutInflater inflater=getLayoutInflater();
        View v= inflater.inflate(R.layout.costomtoast,findViewById(R.id.linearlayout));
        Toast toast=new Toast(getApplicationContext());
        toast.setView(v);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}