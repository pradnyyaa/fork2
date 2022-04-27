package com.example.welcomepage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DB1Helper extends SQLiteOpenHelper {
    public static final String DBNAME = "Login.db";
    public DB1Helper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(name TEXT primary key, password TEXT, phone TEXT, age TEXT, address TEXT, wage TEXT, gender TEXT, aadhar TEXT, jobpref TEXT, locality TEXT, experience TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");
    }

    public Boolean insertData(String name, String password, String phone, String age, String address, String wage, String gender, String aadhar, String jobpref, String locality, String experience){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("name", name);
        contentValues.put("password", password);
        contentValues.put("phone", phone);
        contentValues.put("age", age);
        contentValues.put("address", address);
        contentValues.put("wage", wage);
        contentValues.put("gender", gender);
        contentValues.put("aadhar", aadhar);
        contentValues.put("jobpref", jobpref);
        contentValues.put("locality", locality);
        contentValues.put("experience", experience);
        long result = MyDB.insert("users", null, contentValues);
        if(result==-1) return false;
        else
            return true;
    }

    public Boolean checkusername(String name) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where name = ?", new String[]{name});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String name, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where name = ? and password = ?", new String[] {name,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}