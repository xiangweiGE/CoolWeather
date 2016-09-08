package com.collweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	// Privince�������

	public static final String CREATE_PRIVINCE = "creater table Province ("
			+ "id integer primary key autoincrement, " + "province_name text"
			+ "province_code text)";
	
	//City�������

	public static final String CREATE_CITY = "create table City("
			+ "id integer primary key autoincrement" + "city_name text"
			+ "city_code text"+"province_id integer)";
	
	//County�������

	public static final String CREATE_COUNTY = "create table COUNTY("
			+ "id integer primary key autoincrement," + "COUNTY_name text"
			+ "COUNTY_code text"+"city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//����Province��
		db.execSQL(CREATE_PRIVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
