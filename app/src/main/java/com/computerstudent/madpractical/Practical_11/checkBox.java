package com.computerstudent.madpractical.Practical_11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class checkBox extends AppCompatActivity {
    CheckBox txtMAD,txtNIS,txtPWP,txtETI;
    TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
                txtMAD=findViewById(R.id.cbMad);
                txtNIS=findViewById(R.id.cbNis);
                txtPWP=findViewById(R.id.cbPwp);
                txtETI=findViewById(R.id.cbEti);
                txtShow=findViewById(R.id.txtShow);
    }

    public void onClick(View view) {
        String result="";
        if(txtMAD.isChecked()){result+="MAD,";}
        if(txtNIS.isChecked()){result+="NIS,";}
        if(txtETI.isChecked()){result+="ETI,";}
        if(txtPWP.isChecked()){result+="PWP,";}
        txtShow.setText("Selected Subjects : "+result);

    }

}