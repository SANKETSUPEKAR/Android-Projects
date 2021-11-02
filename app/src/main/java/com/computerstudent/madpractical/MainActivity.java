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
import com.computerstudent.madpractical.Practical_14.selectQuestion;
import com.computerstudent.madpractical.Practical_15.coustomToast;
import com.computerstudent.madpractical.Practical_16.selectQuestionPractical16;
import com.computerstudent.madpractical.Practical_17.lifeCycle;
import com.computerstudent.madpractical.Practical_18.explicitIntent;
import com.computerstudent.madpractical.Practical_19.broadcastReceiver;
import com.computerstudent.madpractical.Practical_20.sensorExample;
import com.computerstudent.madpractical.Practical_21.cameraExample;
import com.computerstudent.madpractical.Practical_22.bluetoothExample;
import com.computerstudent.madpractical.Practical_23.asyncTask;
import com.computerstudent.madpractical.Practical_24.loginForm2;
import com.computerstudent.madpractical.Practical_25.loginForm3;
import com.computerstudent.madpractical.Practical_26.sendSMSActivity;
import com.computerstudent.madpractical.Practical_27.sendEmail;
import com.computerstudent.madpractical.Practical_4.hello_world;
import com.computerstudent.madpractical.Practical_5.student_info;
import com.computerstudent.madpractical.Practical_6.frame_example;
import com.computerstudent.madpractical.Practical_7.studentData;
import com.computerstudent.madpractical.Practical_8.autoTextview;
import com.computerstudent.madpractical.Practical_9.toggleButton;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity  {

    Button btnPractical4,btnPractical5,btnPractical6,btnPractical7,btnPractical8,
            btnPractical9,btnPractical10,btnPractical11,btnPractical12,btnPractical13,
            btnPractical14,btnPractical15,btnPractical16,btnPractical17,btnPractical18,
            btnPractical19,btnPractical20,btnPractical21,btnPractical22,
            btnPractical23,btnPractical24,btnPractical25,btnPractical26,btnPractical27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUIComponent();

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
        btnPractical14=findViewById(R.id.btnPractical14);
        btnPractical15=findViewById(R.id.btnPractical15);
        btnPractical16=findViewById(R.id.btnPractical16);
        btnPractical17=findViewById(R.id.btnPractical17);
        btnPractical18=findViewById(R.id.btnPractical18);
        btnPractical19=findViewById(R.id.btnPractical19);
        btnPractical20=findViewById(R.id.btnPractical20);
        btnPractical21=findViewById(R.id.btnPractical21);
        btnPractical22=findViewById(R.id.btnPractical22);
        btnPractical23=findViewById(R.id.btnPractical23);
        btnPractical24=findViewById(R.id.btnPractical24);
        btnPractical25=findViewById(R.id.btnPractical25);
        btnPractical26=findViewById(R.id.btnPractical26);
        btnPractical27=findViewById(R.id.btnPractical27);






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
        }else if (btnPractical14.equals(v)) {
            startActivity(new Intent(this, selectQuestion.class));
        } else if (btnPractical15.equals(v)) {
            startActivity(new Intent(this, coustomToast.class));
        }else if (btnPractical16.equals(v)) {
            startActivity(new Intent(this, selectQuestionPractical16.class));
        }else if (btnPractical17.equals(v)) {
            startActivity(new Intent(this, lifeCycle.class));
        } else if (btnPractical18.equals(v)) {
            startActivity(new Intent(this, explicitIntent.class));
        }else if (btnPractical19.equals(v)) {
            startActivity(new Intent(this, broadcastReceiver.class));
        } else if (btnPractical20.equals(v)) {
            startActivity(new Intent(this, sensorExample.class));
        }else if (btnPractical21.equals(v)) {
            startActivity(new Intent(this, cameraExample.class));
        }else if (btnPractical22.equals(v)) {
            startActivity(new Intent(this, bluetoothExample.class));
        }else if (btnPractical23.equals(v)) {
            startActivity(new Intent(this, asyncTask.class));
        }else if (btnPractical24.equals(v)) {
            startActivity(new Intent(this, loginForm2.class));
        }else if (btnPractical25.equals(v)) {
            startActivity(new Intent(this, loginForm3.class));
        }else if (btnPractical26.equals(v)) {
            startActivity(new Intent(this, sendSMSActivity.class));
        }else if (btnPractical27.equals(v)) {
            startActivity(new Intent(this, sendEmail.class));
        }
        else {
            throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}