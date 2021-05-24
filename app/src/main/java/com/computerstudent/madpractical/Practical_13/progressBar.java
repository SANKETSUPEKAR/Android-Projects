package com.computerstudent.madpractical.Practical_13;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.Practical_6.frame_example;
import com.computerstudent.madpractical.R;

public class progressBar extends AppCompatActivity {
    ProgressBar progressBar;
    TextView txt1;
    Thread myThread;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progressBar = findViewById(R.id.progressBar);
        txt1=findViewById(R.id.textView);
        myThread=new Thread(runnable);
        myThread.start();
    }
    Runnable runnable=new Runnable() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public void run() {
            int i=0;
            while (i<=100)
            {
                progressBar.setProgress(i,true);
                txt1.setText("Loading..."+String.valueOf(progressBar.getProgress())+"%");
                i+=10;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            startActivity(new Intent(progressBar.this, frame_example.class));


        }
        };
    }

