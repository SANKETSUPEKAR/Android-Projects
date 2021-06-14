package com.computerstudent.madpractical.Practical_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.computerstudent.madpractical.R;

public class explicitIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        Button button1 = (Button) findViewById(R.id.Button01);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {

                Intent i = new Intent(getApplicationContext(), implicitIntent.class);
                startActivity(i);
            }
        });
    }
}
