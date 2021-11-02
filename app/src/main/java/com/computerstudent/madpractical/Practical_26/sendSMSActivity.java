package com.computerstudent.madpractical.Practical_26;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class sendSMSActivity extends AppCompatActivity {
    EditText txtphoneNo,txtMessage;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    Button sendBtn;
    String message,phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_smsactivity);

        sendBtn = (Button) findViewById(R.id.btnSend);
        txtphoneNo = (EditText) findViewById(R.id.txtNumber);
        txtMessage = (EditText) findViewById(R.id.txtMessage);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (checkEmptyInput())
                {
                    sendSMSMessage();
                    clearInput();
                }
            }
        });
    }

    protected void sendSMSMessage() {
        phoneNo = txtphoneNo.getText().toString();
        message = txtMessage.getText().toString();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }

    boolean checkEmptyInput() {
        boolean flag = true;
        EditText[] inputGroup = new EditText[]{txtphoneNo, txtMessage};
        for (int i = 0; i < 2; i++) {
            if (TextUtils.isEmpty(inputGroup[i].getText().toString())) {
                inputGroup[i].setError("Fill Data");
                flag = false;
            }
        }
        return flag;
    }
    void clearInput()
    {
        txtphoneNo.setText("");
        txtMessage.setText("");
    }
}