package com.example.proje.Oyunlar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class QuizVeritabani extends SQLiteOpenHelper {

    public QuizVeritabani(@Nullable Context context) {
        super(context, "quiz.db", null,  1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL("CREATE TABLE IF NOT EXISTS \"quiz\" (\n" +
              "\t\"quiz_id\"\tINTEGER,\n" +
              "\t\"quiz_ad\"\tTEXT,\n" +
              "\t\"quiz_resim\"\tTEXT,\n" +
              "\tPRIMARY KEY(\"quiz_id\")\n" +
              ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS quiz");
        onCreate(db);

    }
}
