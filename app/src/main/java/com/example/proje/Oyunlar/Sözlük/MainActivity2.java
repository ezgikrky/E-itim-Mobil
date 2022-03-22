package com.example.proje.Oyunlar.Sözlük;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.proje.R;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton imageIlerle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageIlerle=findViewById(R.id.imageIlerle);

        imageIlerle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, SozlukGiris.class));
            }
        });


    }
}