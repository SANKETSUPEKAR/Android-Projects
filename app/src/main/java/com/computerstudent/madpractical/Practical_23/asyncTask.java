package com.computerstudent.madpractical.Practical_23;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.computerstudent.madpractical.DatabaseSqlLite;
import com.computerstudent.madpractical.Practical_10.loginForm;
import com.computerstudent.madpractical.R;

public class asyncTask extends AppCompatActivity {
    EditText txtUsername,txtPassword;
    String user,pass,DataUser=null,DataPass=null;
    Button btnLogin;
    DatabaseSqlLite databaseSqlLite;
    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        databaseSqlLite=new DatabaseSqlLite(getApplicationContext());
        SQLiteDatabase database=databaseSqlLite.getReadableDatabase();

        txtUsername=findViewById(R.id.txtUsername);
        txtPassword=findViewById(R.id.txtPassword);
        btnLogin=findViewById(R.id.btnLogin);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEmptyInput())
                {
                        user=txtUsername.getText().toString();
                        pass=txtPassword.getText().toString();
                        AsyncTask asyncTask=new AsyncTask() {
                            @Override
                            protected Object doInBackground(Object[] objects) {
                                Cursor cursor= database.rawQuery("SELECT USER,PASS FROM LOGIN_DATA WHERE USER=?",new String[]{user});
                                if (cursor!=null)
                                {
                                    cursor.moveToFirst();
                                    try {
                                       DataUser=cursor.getString(0);
                                       DataPass=cursor.getString(1);
                                    }
                                    catch (Exception e) {

                                    }
                                }
                                return null;
                            }

                            @Override
                            protected void onPostExecute(Object o) {
                                super.onPostExecute(o);
                                checkData();

                            }
                        };

                        asyncTask.execute();


                }

            }
        });
    }

    boolean checkEmptyInput() {
        boolean flag = true;
        EditText[] inputGroup = new EditText[]{txtUsername, txtPassword};
        for (int i = 0; i < 2; i++) {
            if (TextUtils.isEmpty(inputGroup[i].getText().toString())) {
                inputGroup[i].setError("Fill Data");
                flag = false;
            }
        }
        return flag;
    }
    void checkData()
    {
        Toast.makeText(this, pass+DataPass, Toast.LENGTH_SHORT).show();
        if(DataUser==null || DataPass==null)
        {
            Toast.makeText(asyncTask.this, "Data Not Found....", Toast.LENGTH_SHORT).show();
            clearInput();
        }
        else if (pass.equals(DataPass))
        {
           Toast.makeText(asyncTask.this, "login Successful....", Toast.LENGTH_SHORT).show();
            clearInput();
        }
        else {

            Toast.makeText(asyncTask.this, "login Unsuccessful....", Toast.LENGTH_SHORT).show();
            clearInput();
        }
    }
    void clearInput()
    {
        txtPassword.setText("");
        txtUsername.setText("");
    }
}