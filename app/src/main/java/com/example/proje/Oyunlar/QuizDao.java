package com.example.proje.Oyunlar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class QuizDao {

    public ArrayList<QuizFotolar> rasgele5Getir(QuizVeritabani vt) {

        ArrayList<QuizFotolar> fotolarArrayList = new ArrayList<>();
        SQLiteDatabase db = vt.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM quiz ORDER BY RANDOM() LIMIT 5 ", null); // QuizFotolar tablosundan rasgele şekilde 5 tane veri  getir dedim

        //while döngüsünde c.moveToNext diyerek kaydedicem

          while (c.moveToNext()) {

            QuizFotolar f = new QuizFotolar(c.getInt(c.getColumnIndex("quiz_id")), c.getString(c.getColumnIndex("quiz_ad")), c.getString(c.getColumnIndex("quiz_resim")));

         fotolarArrayList.add(f);
      }

        return fotolarArrayList;
    }

    public ArrayList<QuizFotolar> rasgele3YanlisSecenekGetir(QuizVeritabani vt, int quiz_id) {
        ArrayList<QuizFotolar> fotolarArrayList = new ArrayList<>();
        SQLiteDatabase db = vt.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM quiz WHERE quiz_id != " + quiz_id + " ORDER BY RANDOM()  LIMIT 3", null);

        while (c.moveToNext()) {
            QuizFotolar f = new QuizFotolar(c.getInt(c.getColumnIndex("quiz_id"))
                    , c.getString(c.getColumnIndex("quiz_ad"))
                    , c.getString(c.getColumnIndex("quiz_resim")));

            fotolarArrayList.add(f);
        }

        return fotolarArrayList;


    }
}







