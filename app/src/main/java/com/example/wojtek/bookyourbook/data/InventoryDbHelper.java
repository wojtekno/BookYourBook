package com.example.wojtek.bookyourbook.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.wojtek.bookyourbook.data.InventoryContract.BookEntry;

public class InventoryDbHelper extends SQLiteOpenHelper {

    /**
     * Name of the database file
     */
    private static final String DATABASE_NAME = "bookyourbook.db";

    /**
     * Database version. If you change the database schema.
     */
    private static final int DATABASE_VERSION = 1;


    public InventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        private static String SQL_CREATE_ENTRIES = "CREATE TABLE " + BookEntry.TABLE_NAME + "(" +
                BookEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                BookEntry.COLUMN_BOOK_PRODUCT_NAME + " TEXT NOT NULL, " +
                BookEntry.COLUMN_BOOK_PRICE + " INTEGER NOT NULL, " +
                BookEntry.COLUMN_BOOK_QUANTITY + " INTEGER DEFAULT 0, " +
                BookEntry.COLUMN_BOOK_SUPPLIER_NAME + " TEXT, " +
                BookEntry.COLUMN_BOOK_SUPPLIER_PHONE_NUMBER + " TEXT );";

        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
