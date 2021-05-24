package com.computerstudent.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.computerstudent.madpractical.Practical_10.loginForm;
import com.computerstudent.madpractical.Practical_11.checkBox;
import com.computerstudent.madpractical.Practical_12.radioGroup;
import com.computerstudent.madpractical.Practical_13.progressBar;
import com.computerstudent.madpractical.Practical_4.hello_world;
import com.computerstudent.madpractical.Practical_5.student_info;
import com.computerstudent.madpractical.Practical_6.frame_example;
import com.computerstudent.madpractical.Practical_7.studentData;
import com.computerstudent.madpractical.Practical_8.autoTextview;
import com.computerstudent.madpractical.Practical_9.toggleButton;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity  {

    Button btnPractical4,btnPractical5,btnPractical6,btnPractical7,btnPractical8,
            btnPractical9,btnPractical10,btnPractical11,btnPractical12,btnPractical13;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUIComponent();
        btnPractical4.setOnClickListener(this::onClick);
        btnPractical5.setOnClickListener(this::onClick);
        btnPractical6.setOnClickListener(this::onClick);
        btnPractical7.setOnClickListener(this::onClick);
        btnPractical8.setOnClickListener(this::onClick);
        btnPractical9.setOnClickListener(this::onClick);
        btnPractical10.setOnClickListener(this::onClick);
        btnPractical11.setOnClickListener(this::onClick);
        btnPractical12.setOnClickListener(this::onClick);
        btnPractical13.setOnClickListener(this::onClick);




    }
    void setUIComponent()
    {
        btnPractical4=findViewById(R.id.btnPractical4);
        btnPractical5=findViewById(R.id.btnPractical5);
        btnPractical6=findViewById(R.id.btnPractical6);
        btnPractical7=findViewById(R.id.btnPractical7);
        btnPractical8=findViewById(R.id.btnPractical8);
        btnPractical9=findViewById(R.id.btnPractical9);
        btnPractical10=findViewById(R.id.btnPractical10);
        btnPractical11=findViewById(R.id.btnPractical11);
        btnPractical12=findViewById(R.id.btnPractical12);
        btnPractical13=findViewById(R.id.btnPractical13);

    }
    public void onClick(View v) {
        if (btnPractical4.equals(v)) {
            startActivity(new Intent(this, hello_world.class));
        } else if (btnPractical5.equals(v)) {
            startActivity(new Intent(this, student_info.class));
        } else if (btnPractical6.equals(v)) {
            startActivity(new Intent(this, frame_example.class));
        } else if (btnPractical7.equals(v)) {
            startActivity(new Intent(this, studentData.class));
        }else if (btnPractical8.equals(v)) {
                startActivity(new Intent(this, autoTextview.class));
        } else if (btnPractical9.equals(v)) {
            startActivity(new Intent(this, toggleButton.class));
        } else if (btnPractical10.equals(v)) {
            startActivity(new Intent(this, loginForm.class));
        } else if (btnPractical11.equals(v)) {
            startActivity(new Intent(this, checkBox.class));
        } else if (btnPractical12.equals(v)) {
            startActivity(new Intent(this, radioGroup.class));
        } else if (btnPractical13.equals(v)) {
            startActivity(new Intent(this, progressBar.class));
        }else {
            throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}