package com.example.proje.Oyunlar.KelimeBilmece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.proje.R;

import java.util.HashMap;

public class BaslangicActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView mtextView;
    private SQLiteDatabase database;
    private float maksimumProgres=100f , artacakProgress , progresMiktari=0;
    static public HashMap<String , String> sorularHashMap;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar=findViewById(R.id.progressBar);
        mtextView=(TextView)findViewById(R.id.textView41);

        sorularHashMap=new HashMap<>();

        try{
            database   =this.openOrCreateDatabase("KelimeBilmecee",MODE_PRIVATE,null);



            mtextView.setText("Sorular Yükleniyor");


            mtextView.setText("Oyun Başlıyor");


            new CountDownTimer(1100,1000){

                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    Intent mainIntent= new Intent(BaslangicActivity.this, KelimeOyunu.class);
                    finish();
                    startActivity(mainIntent);

                }
            }.start();


        } catch (Exception e){
            mtextView.setText("Sorular patladı");
            e.printStackTrace(); } } }





