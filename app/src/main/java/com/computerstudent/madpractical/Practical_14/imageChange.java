package com.computerstudent.madpractical.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.computerstudent.madpractical.R;

import java.util.Objects;

public class imageChange extends AppCompatActivity {
    ToggleButton tb;
    ImageView imageLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change);
        tb=findViewById(R.id.tbLight);
        imageLight=findViewById(R.id.imageView);
    }

    public void onClick(View view) {
        if (Objects.equals(tb.getText(), "ON"))
        {
            imageLight.setImageResource(R.drawable.on_bulp);
        }
        else {
            imageLight.setImageResource(R.drawable.off_bulp);
        }

    }
}