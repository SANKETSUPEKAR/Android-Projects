package com.computerstudent.madpractical.Practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.computerstudent.madpractical.R;

public class studentData extends AppCompatActivity {
    public EditText txtName, txtRollno, txtDept, txtClass, txtEnroll;
    public TextView txtNameShow, txtRollnoShow, txtDeptShow, txtClassShow, txtEnrollShow;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_data);
        setUIComponent();
            btnEnter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (checkEmptyInput())
                    {
                        setContentView(R.layout.student_data_show);
                        txtNameShow = findViewById(R.id.txtNameShow);
                        txtRollnoShow = findViewById(R.id.txtRollnoShow);
                        txtDeptShow = findViewById(R.id.txtDeptShow);
                        txtClassShow = findViewById(R.id.txtClassDivisionShow);
                        txtEnrollShow = findViewById(R.id.txtEnrollmentShow);
                        txtNameShow.setText("Name : "+txtName.getText().toString());
                        txtRollnoShow.setText("Roll No : "+txtRollno.getText().toString());
                        txtDeptShow.setText("Dept : "+txtDept.getText().toString());
                        txtClassShow.setText("Class : "+txtClass.getText().toString());
                        txtEnrollShow.setText("Enrollment Number : "+txtEnroll.getText().toString());


                    }

                }
            });



    }
    void setUIComponent()
    {
        txtName = findViewById(R.id.txtName);
        txtRollno = findViewById(R.id.txtRollno);
        txtDept = findViewById(R.id.txtDept);
        txtClass = findViewById(R.id.txtClassDivision);
        txtEnroll = findViewById(R.id.txtEnrollment);
        btnEnter=findViewById(R.id.btnEnter);
    }
    boolean checkEmptyInput()
    {
        boolean flag=true;
        EditText[] inputGroup= new EditText[]{txtName, txtRollno, txtDept, txtClass, txtEnroll};
        for (int i=0;i<5;i++)
        {
            if(TextUtils.isEmpty(inputGroup[i].getText().toString()))
            {
                inputGroup[i].setError("Fill Data");
                flag=false;
            }
        }
        return flag;
    }

}