package com.computerstudent.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class testCode extends AppCompatActivity {
    TextView txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_code);
        txt1 = (TextView) findViewById(R.id.txt1);
        btn1=findViewById(R.id.btn1);
            txt1.setText("adfahfalkdjf");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Thread myThread=new Thread(runnable);
                    myThread.start();
                }
            });

    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            txt1.setText("Hello");
        }
    };
}