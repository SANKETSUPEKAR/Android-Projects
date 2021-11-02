package com.computerstudent.madpractical.Practical_25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.computerstudent.madpractical.R;

public class loginForm3 extends AppCompatActivity {
    EditText txtUsername,txtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form3);
        txtUsername=findViewById(R.id.txtUsername);
        txtPassword=findViewById(R.id.txtPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setEnabled(false);
        txtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (checkEmptyInput())
                {
                    btnLogin.setEnabled(true);
                }
                else {
                    btnLogin.setEnabled(false);
                }

            }
        });
        txtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (checkEmptyInput())
                {
                    btnLogin.setEnabled(true);
                }
                else {
                    btnLogin.setEnabled(false);
                }

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEmptyInput())
                {
                    if(txtUsername.getText().toString().equals("sanket")&&txtPassword.getText().toString().equals("1234"))
                    {
                        Toast.makeText(getApplicationContext(), "login Successful....", Toast.LENGTH_SHORT).show();
                        clearInput();

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "login Unsuccessful....", Toast.LENGTH_SHORT).show();
                        clearInput();
                    }
                }

            }
        });
    }
    boolean checkEmptyInput() {
        boolean flag = true;
        EditText[] inputGroup = new EditText[]{txtUsername, txtPassword};
        for (int i = 0; i < 2; i++) {
            if (TextUtils.isEmpty(inputGroup[i].getText().toString())) {
                flag = false;
            }
        }
        return flag;
    }
    void clearInput()
    {
        txtPassword.setText("");
        txtUsername.setText("");
    }
}