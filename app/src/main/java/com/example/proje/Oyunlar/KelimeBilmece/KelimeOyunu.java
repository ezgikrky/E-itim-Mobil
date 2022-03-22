package com.example.proje.Oyunlar.KelimeBilmece;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.proje.Exercise;
import com.example.proje.R;
import com.example.proje.WordPlay;
public class KelimeOyunu extends AppCompatActivity {
    private ImageButton imageButton9,imageBaşla,imageÇıkış;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelime_bilmece);

        imageButton9=findViewById(R.id.imageButton9);
        imageBaşla=findViewById(R.id.imageBaşla);
        imageÇıkış=findViewById(R.id.imageÇıkış);

        imageBaşla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(KelimeOyunu.this, WordPlay.class));
            }});

        imageÇıkış.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(KelimeOyunu.this, Exercise.class));
            }
        }); }}