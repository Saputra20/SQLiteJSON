package com.example.root.sqlitejson;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class database extends SQLiteOpenHelper {

    public  final static String DATABASE_NAME = "Team.db";
    public final static int DATABASE_VERSION = 1 ;
    public final static String TABLE_NAME = "team_table";
    public final static String Col_1 = "ID_TEAM";
    public final static String Col_2 = "TEAM";
    public final static String Col_3 = "MANAGER";
    public final static String Col_4 = "STADIUM";

    public database(Context context) {
        super(context, DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE Table "+TABLE_NAME+" (ID_TEAM TEXT PRIMARY KEY , TEAM TEXT , MANAGER TEXT , STADIUM TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

    public void insertDB(model data){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();


        contentValues.put(Col_1 , data.getIds());
        contentValues.put(Col_2 , data.getTeam());
        contentValues.put(Col_3 , data.getManager());
        contentValues.put(Col_4 , data.getStadium());

        Log.e("insertDB: ", String.valueOf(contentValues));

        db.insert(TABLE_NAME,null , contentValues);
        db.close();
    }

}
