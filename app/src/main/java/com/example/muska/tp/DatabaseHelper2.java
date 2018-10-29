package com.example.muska.tp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper2 extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION='1';
    public static final String DATABASE_NAME = "postings.db";
    public static final String TABLE_NAME = "postings";
    public static int COLUMN_JID=0;
    public static final String COLUMN_JNAME="name";
    public static final String COLUMN_CNAME="cname";
    public static final String COLUMN_STIPEND="stipend";
    public static final String COLUMN_JTYPE="jtype";
    public static final String COLUMN_CGPA="00";
    public static final String COLUMN_SKILL1="none";
    public static final String COLUMN_SKILL2="none";

    SQLiteDatabase db2;
    Cursor cursor;

    public static final String CREATE_TABLE ="create table if not exists "+ TABLE_NAME+"(JId integer primary key AUTOINCREMENT,JName varchar,CName varchar,Stipend varchar not null,Jtype varchar, CGPA varchar, Skill1 varchar, Skill2 varchar)";

    String query="select * from contacts";
    public DatabaseHelper2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL(CREATE_TABLE);
        this.db2 = db2;
        cursor=db2.rawQuery(query,null);
    }

    public void insertContact(Contact c)
    {
        db2= this.getWritableDatabase();
        ContentValues values=new ContentValues();

        COLUMN_JID = c.getJid();
        values.put(COLUMN_JNAME,c.getJname());
        values.put(COLUMN_CNAME,c.getCname());
        values.put(COLUMN_STIPEND,c.getStipend());
        values.put(COLUMN_JTYPE,c.getJType());
        values.put(COLUMN_CGPA, c.getCgpa());
        values.put(COLUMN_SKILL1,c.getSkill1());
        values.put(COLUMN_SKILL2,c.getSkill2());
        db2.insert(TABLE_NAME,null,values);
        cursor= db2.rawQuery(query,null);
        // db.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db2, int i, int i1) {

        String query="DROP TABLE "+TABLE_NAME;
        db2.execSQL(query);
        onCreate(db2);
    }

    public List<String> getAllPostings() {
        List<String> postingsList = new ArrayList<>();
        // Select All Query
        String selectQuery = "select jname from " + TABLE_NAME;

        db2 = this.getReadableDatabase();
        Cursor cursor = db2.rawQuery(selectQuery, null);
        String a;

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                a = cursor.getString(0);
                postingsList.add(a);
                // contactList.add(b);
            } while (cursor.moveToNext());
        }

        // return contact list
        return postingsList;
    }
}
