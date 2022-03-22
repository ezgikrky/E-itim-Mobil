package com.example.proje.KonuAnlatım;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.proje.Exercise;
import com.example.proje.HomePage;
import com.example.proje.R;

public class Unit9 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit9);

        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit9.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit9.this, Exercise.class));
            }
        });


        textViewU2.setText("ÜNİTE 9 – ENVIRONMENT\n\n" +
                "KONU ANLATIMI\n\n" +
                "OBLIGATION AND PROHIBITON (ZORUNLULUK VE YASAKLAMA)\n\n" +
                "MUST – MUSTN’T\n\n" +
                "Yasakları veya kuralları ifade etmek için ya da bazı durumlarda çok güçlü bir öneride bulunurken “must” (olumlu) ya\n" +
                "da “must not - mustn’t” (olumsuz) kullanılır ve bunlar genelde zorunluluk ifade eden kalıplardır.\n\n" +
                "Must → -meli, -malı\n" +
                "Must not / Mustn’t → -memeli, -mamalı\n\n\n" +
                "Examples:\n\n" +
                "\uF043You must keep the environment clean. (Çevreyi temiz tutmalısın.)\n\n" +
                "\uF043 We must use renewable energy. (Yenilenebilir enerji kullanmalıyız.)\n\n" +
                "\uF043You must turn off the lights. (Işıkları kapatmalısın.)\n\n" +
                "\uF044You mustn’t leave the lights on. (Işıkları açık bırakmamalısın.)\n\n" +
                "\uF044 We mustn’t cut down trees. (Ağaçları kesmemeliyiz.)\n\n" +
                "\uF044 We mustn’t keep the tap running. (Musluğu açık tutmamalıyız.)");
    }
}