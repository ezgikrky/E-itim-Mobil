package com.example.proje.Oyunlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.proje.R;

import java.io.IOException;

public class QuizOyunu extends AppCompatActivity {

    private ImageButton imageStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_oyunu);

        imageStart=findViewById(R.id.imageStart);

        veritabanıKopyala();

        imageStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizOyunu.this, QuizOyunu2.class));
            }
        });


    }

    public void veritabanıKopyala(){

        QuizDataBase helper =  new QuizDataBase(this);

        try {
            helper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        helper.openDataBase();

    }
}