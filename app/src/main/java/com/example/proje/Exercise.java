package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.proje.Oyunlar.KelimeBilmece.BaslangicActivity;
import com.example.proje.Oyunlar.QuizOyunu;

public class Exercise extends AppCompatActivity {

    private ImageButton imageHome,imageQuiz,imageKBilmece ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        imageHome=findViewById(R.id.imageHome);
        imageQuiz=findViewById(R.id.imageQuiz);

        imageKBilmece=findViewById(R.id.imageKBilmece);

        imageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Exercise.this,HomePage.class));
            }
        });

        imageQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Exercise.this, QuizOyunu.class));
            }
        });

        imageKBilmece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Exercise.this, BaslangicActivity.class));
            }
        });
    }
}