package com.computerstudent.madpractical.Practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class autoTextview extends AppCompatActivity {
    public AutoCompleteTextView txtAutoComplete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_textview);
        txtAutoComplete=findViewById(R.id.txtAutoComplete);
        String[] subject=new String[]{"MAD","NIS","ETI","PWP","MNG","EDP"};
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.select_dialog_item,subject);
        txtAutoComplete.setThreshold(1);
        txtAutoComplete.setAdapter(adapter);
        txtAutoComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(autoTextview.this, txtAutoComplete.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}