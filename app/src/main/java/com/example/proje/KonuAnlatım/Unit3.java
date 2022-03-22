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

public class Unit3 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3);



        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit3.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit3.this, Exercise.class));
            }
        });


        textViewU2.setText("ÜNİTE 3 – BIOGRAPHIES\n\n" +
                "KONU ANLATIMI\n\n "+"THE SIMPLE PAST TENSE\n\n" +
                "(GEÇMİŞ ZAMAN)\n" +
                "Geçmişte tamamlanmış, belirli bir zamanda gerçekleşmiş, bitmiş ve günümüzde devam etmeyen durum veya\n" +
                "eylemlerden bahsederken bu zaman kalıbı kullanılır.\n" +
                "Bu zaman kalıbında kullanılan 2 farklı cümle yapısı vardır. Bunlar;\n" +
                "1. EYLEM BİLDİRMEYEN DURUM CÜMLELERİ – WAS / WERE\n" +
                "(“to be” (am/is/are) → was/were)\n" +
                "Eylem (-mak, -mek) içermeyen cümlelerde özneye göre olumlu ise “was” ya da “were”, olumsuz ise “wasn’t” ya da\n" +
                "“weren’t” kullanılır. Soru cümlesinde ise yine öznesine göre “was” ya da “were” cümle başına gelir.\n\n"+"Examples:\n\n" +
                "I was overweight. (Ben aşırı kiloluydum.)\n" +
                "We weren’t tired. (Biz yorgun değildik.)\n" +
                "Was she at school? (O okulda mıydı?) → Yes, she was. / No, she wasn’t.\n\n" +
                "2. EYLEM BİLDİREN (-MEK, -MAK) FİİL CÜMLELERİ\n\n" +
                "“The Simple Past Tense”de olumlu cümle yapısında fiilin “past formu (V2 – Fiilin 2.hali)” kullanılır. Fakat olumsuz ve\n" +
                "soru cümlelerinde fiil yalın haldedir.\n\n"+"Not: Olumlu cümle yapısı için konuşacak olursak; fiiller “regular” (düzenli) ve “irregular” (düzensiz) fiiller olmak\n" +
                "üzere ikiye ayrılır.\n" +
                "• “Regular” (düzenli) fiiller sonlarına belli bir kurala göre “-d, -ed, -ied” eklerinden birini alır. \n\n"+ "Examples:\n\n" +
                "POSSITIVE (+)\n" +
                "I played football. (Ben futbol oynadım.) → “Regular” (Düzenli) Fiil\n" +
                "I went to Gaziantep. (Ben Gaziantep’e gittim.) → “Irregular” (Düzensiz) Fiil\n\n" +
                "NEGATIVE (-)\n" +
                "I didn’t play football. (Ben futbol oynamadım.)\n" +
                "I didn’t go to Gaziantep. (Ben Gaziantep’e gitmedim.)\n\n" +
                "QUESTION FORM (?)\n" +
                "Did you play football? (Sen futbol oynadın mı?) → Yes, I did. / No, I didn’t.\n" +
                "Did you go to Gaziantep? (Sen Gaziantep’e gittin mi?) → Yes, I did. / No, I didn’t.\n\n"+ "TIME / DAYS / DATES\n\n" +
                "TELLING THE TIME\n" +
                "İngilizce’de saat sorulurken; “What time is it?” veya “What is the time?” soruları kullanılır\n\n"+"5th April → The fifth of April\n" +
                "5th April 1924 → The fifth of April, nineteen twenty-four\n" +
                "***Not: Yıllar okunurken 2000 yılından öncesi ve sonrası genellikle farklı okunur.");
    }
}