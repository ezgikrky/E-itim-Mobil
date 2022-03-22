package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.proje.KonuAnlatım.Unit1;
import com.example.proje.KonuAnlatım.Unit10;
import com.example.proje.KonuAnlatım.Unit2;
import com.example.proje.KonuAnlatım.Unit3;
import com.example.proje.KonuAnlatım.Unit4;
import com.example.proje.KonuAnlatım.Unit5;
import com.example.proje.KonuAnlatım.Unit6;
import com.example.proje.KonuAnlatım.Unit7;
import com.example.proje.KonuAnlatım.Unit8;
import com.example.proje.KonuAnlatım.Unit9;

public class Unit extends AppCompatActivity {

    private ImageButton imageButton2, imageButton6,imageButton4,imageButton7,imageButton8,imageButton10,imageButton12,imageButton13,imageButton14,imageButton15,imageButton16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        imageButton2=findViewById(R.id.imageButton2);
        imageButton6=findViewById(R.id.imageButton6);
        imageButton4=findViewById(R.id.imageButton4);
        imageButton7=findViewById(R.id.imageButton7);
        imageButton8=findViewById(R.id.imageButton8);
        imageButton10=findViewById(R.id.imageButton10);
        imageButton12=findViewById(R.id.imageButton12);
        imageButton13=findViewById(R.id.imageButton13);
        imageButton14=findViewById(R.id.imageButton14);
        imageButton15=findViewById(R.id.imageButton15);
        imageButton16=findViewById(R.id.imageButton16);


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, HomePage.class));
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit1.class));
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit2.class));
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit3.class));
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit4.class));
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit5.class));
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit6.class));
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit7.class));
            }
        });

        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit8.class));
            }
        });  imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit9.class));
            }
        });  imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit.this, Unit10.class));
            }
        });

    }
}