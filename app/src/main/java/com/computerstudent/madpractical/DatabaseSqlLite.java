package com.computerstudent.madpractical;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseSqlLite extends SQLiteOpenHelper {
    public static final String name="mydb";
    public static final int version=1;

    public DatabaseSqlLite(@Nullable Context context) {
        super(context, name, null, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE LOGIN_DATA(USER TEXT,PASS TEXT)";
        db.execSQL(sql);
        insertData("Sanket","1234",db);
        insertData("Supekar","5678",db);
    }

    void insertData(String user,String pass,SQLiteDatabase database)
    {
        ContentValues values=new ContentValues();
        values.put("USER",user);
        values.put("PASS",pass);
        database.insert("LOGIN_DATA",null,values);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
