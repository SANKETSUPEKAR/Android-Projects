package com.computerstudent.madpractical.Practical_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.computerstudent.madpractical.R;

public class toggleButton extends AppCompatActivity {
    ToggleButton tbBluetooth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        tbBluetooth=findViewById(R.id.tbBluetooth);
        tbBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(toggleButton.this, "Bluetooth "+tbBluetooth.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}