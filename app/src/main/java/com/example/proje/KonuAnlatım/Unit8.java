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

public class Unit8 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit8);

        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit8.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit8.this, Exercise.class));
            }
        });


        textViewU2.setText("ÜNİTE 8 – PUBLIC BUILDINGS\n\n" +
                "KONU ANLATIMI\n\n" +
                "“IF” CLAUSE (Conditional Sentences) – Koşullu/Şartlı Cümleler\n\n" +
                "• “if” → eğer\n" +
                "• “if” fiile “-se, -sa” anlamı verir.\n" +
                "If Clause → Simple Present Tense\n" +
                "Main Clause → will / should / can\n\n\n" +
                "Examples:\n\n" +
                "If I have money, I will buy a house. (Param olursa, bir ev alacağım.)\n" +
                "If you need a bread, you should go to the bakery. (Ekmeğe ihtiyacın varsa, fırına gitmelisin.)\n" +
                "If you need a medicine, you should go to the chemist’s. (İlaca ihtiyacın varsa, eczaneye gidebilirsin.)\n\n\n" +
                "*** NOT: Cümleler yer değiştirdiğinde anlam değişmez. Dikkat edilmesi gereken nokta şudur; “if clause” başta\n" +
                "kullanılırsa virgül ile ana cümleye bağlanır. Ama “main clause” başta kullanılırsa cümeleler arası virgül kullanılmaz.\n\n" +
                "- If you need help about a fire, You should call the fire station.\n" +
                "- You should call the fire station if you need help about a fire.\n" +
                "Infinitive of Purpose ( TO + V\n" +
                "1 ) – Amaç Mastarı\n" +
                "Cümlede “to” kelimesi fiillerden önce gelirse fiili “-mek, -mak” / mastar haline dönüştürür ve cümlede “için”\n" +
                "anlamında kullanılır.\n\n" +
                "Examples:\n\n" +
                "- I should go to florist’s to buy a rose. (Gül satın almak için çiçekçiye gitmeliyim.)\n" +
                "- You should go to butcher to buy a meat. (Et satın almak için kasaba gitmelisin.)");
    }
    }