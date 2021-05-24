package com.computerstudent.madpractical.Practical_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class radioGroup extends AppCompatActivity {
    RadioButton txtCOM,txtIT,txtCIVIL,txtMECH;
    RadioGroup rbDept;
    TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        rbDept=findViewById(R.id.rgDept);
        txtIT=findViewById(R.id.rbIT);
        txtCOM=findViewById(R.id.rbCOM);
        txtCIVIL=findViewById(R.id.rbCIVIL);
        txtMECH=findViewById(R.id.rbMECH);
        txtShow=findViewById(R.id.txtShow);
    }

    public void onClick(View view) {
        RadioButton result= findViewById(rbDept.getCheckedRadioButtonId());
        txtShow.setText("You Are Now Member Of "+result.getText().toString()+" Department");

    }
}