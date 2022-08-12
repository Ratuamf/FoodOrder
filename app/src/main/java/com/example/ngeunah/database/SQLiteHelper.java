package com.example.ngeunah.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class SQLiteHelper extends SQLiteOpenHelper {

    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public void insertData(String name, String quantity, String price){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO CART(NAME, QUANTITY, PRICE) VALUES (?, ?, ?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1, name);
        statement.bindString(2, quantity);
        statement.bindString(3, price);
        statement.executeInsert();
    }
    public void updateData(String name, String quantity, String price, int id) {
        SQLiteDatabase database = getWritableDatabase();
        String sql = "UPDATE CART SET name = ?, quantity = ?, price = ? WHERE id = ?";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.bindString(1, name);
        statement.bindString(2, quantity);
        statement.bindString(3, price);
        statement.execute();
        database.close();
    }
    public  void deleteAllData() {
        SQLiteDatabase database = getWritableDatabase();
        String sql = "DELETE FROM CART";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.execute();
        database.close();
    }
    public  void deleteData(int id) {
        SQLiteDatabase database = getWritableDatabase();
        String sql = "DELETE FROM CART WHERE id = ?";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindDouble(1, (double)id);
        statement.execute();
        database.close();
    }
    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}