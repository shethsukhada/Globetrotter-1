package com.example.globetrotter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ListHelper extends SQLiteOpenHelper {


    public ListHelper(Context context){
        this(context,"checklist",null,1);
    }

    private ListHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE checklist(_id INTEGER PRIMARY KEY NOT NULL,"+
                "citem VARCHAR NOT NULL,"+
                "amount INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
