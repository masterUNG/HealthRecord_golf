package appbsru.supergolf.healthrecord;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 1/26/16 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String DATABASE_NAME = "Health.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_MEET_TABLE = "create table meetTABLE (" +
            "_id integer primary key, " +
            "Date text, " +
            "Month text, " +
            "Year text, " +
            "Doctor text, " +
            "Remark text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_MEET_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // MyOpenHelper
