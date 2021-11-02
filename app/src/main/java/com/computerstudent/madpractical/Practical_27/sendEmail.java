package com.computerstudent.madpractical.Practical_27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.computerstudent.madpractical.MainActivity;
import com.computerstudent.madpractical.R;

public class sendEmail extends AppCompatActivity {
    Button btnSend;
    EditText from,to,sub,msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
        btnSend=findViewById(R.id.btnSend);
        from=findViewById(R.id.txtFrom);
        to=findViewById(R.id.txtTo);
        sub=findViewById(R.id.txtSub);
        msg=findViewById(R.id.txtMessage);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEmptyInput())
                {
                    sendEmail();
                    clearInput();

                }
            }
        });

    }
        protected void sendEmail() {

            Toast.makeText(this, "Send email...", Toast.LENGTH_SHORT).show();
            String[] CC = {""};
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setData(Uri.parse("mailto:"+from.getText().toString()));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL,to.getText().toString() );
            emailIntent.putExtra(Intent.EXTRA_CC, CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, sub.getText().toString());
            emailIntent.putExtra(Intent.EXTRA_TEXT, msg.getText().toString());

            try {
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                finish();
                Toast.makeText(this, "Finished sending email...", Toast.LENGTH_SHORT).show();

            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(getApplicationContext(), "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
    boolean checkEmptyInput() {
        boolean flag = true;
        EditText[] inputGroup = new EditText[]{from,to,sub,msg};
        for (int i = 0; i < 4; i++) {
            if (TextUtils.isEmpty(inputGroup[i].getText().toString())) {
                inputGroup[i].setError("Fill Data");
                flag = false;
            }
        }
        return flag;
    }
    void clearInput()
    {
        from.setText("");
        to.setText("");
        sub.setText("");
        msg.setText("");
    }

    }

