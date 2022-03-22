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

public class Unit10 extends AppCompatActivity {


    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit10);

        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit10.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit10.this, Exercise.class));
            }
        });


        textViewU2.setText("ÜNİTE 10 – PLANETS\n\n" +
                "KONU ANLATIMI\n\n" +
                "MAKING COMPARISONS – COMPARATIVE ADJECTIVES\n\n" +
                "İki şey karşılaştırılırken sıfatlar kullanılır ve karşılaştırma cümlelerinde bu kullanılan sıfatların hece sayıları önemlidir.\n" +
                "• Tek heceli sıfatların sonuna “-er” eki getirilir ve bu cümleye “daha” anlamı katar.\n" +
                "small → smaller (küçük → daha küçük)\n" +
                "fast → faster (hızlı → daha hızlı)\n\n" +
                "• İki veya daha fazla heceli sıfatların önüne “more” kelimesi getirilir ve bu cümleye “daha” anlamı katar.\n" +
                "interesting → more interesting (ilginç → daha ilginç) \n\n" +
                "Note 1: Tek heceli sıfatlarda sonu “-e” ile biten sıfatlara sadece “-r” eki eklenir.\n" +
                "large → larger\n\n" +
                "Note 2: Tek heceli sıfatlarda sıfat “sesli harf + sessiz harf” şeklinde bitiyorsa, sıfatın sonundaki sessiz harf çift yazılır\n" +
                "ve ardından “-er” eki getirilir.\n" +
                "big → bigger\n\n" +
                "Note 3: Tek heceli sıfatlarda sıfat “sessiz harf + y” şeklinde bitiyorsa, bu sıfatın sonuna “-er” eki getirilirken “-y”\n" +
                "düşer ve yerine “-ier” eki getirilir.\n" +
                "lazy → lazier\n\n" +
                "• Bazı sıfatlar düzensizdir. Bu sıfatlarda kısa ya da uzun sıfatlardaki kurallar uygulanmaz. Bu sıfatlar\n" +
                "cümlede “daha” anlamında kullanılacağı zaman sıfat tamamen değişir ve değişirken belli bir kuralı\n" +
                "yoktur.\n" +
                "good → better\n" +
                "many/much → more\n" +
                "far → farther/further\n\n" +
                "*** Karşılaştırma cümlelerinde sıfatlardan sonra mutlaka “than” ifadesi kullanılır.***\n\n"+ "SUPERLATIVE ADJECTIVES\n\n" +
                "Türkçe’deki “en” ifadesinin karşılığıdır ve üstünlük ifade eder.\n" +
                "• Tek heceli sıfatların başına “the” kelimesi ile birlikte sonuna “-est” eki getirilir ve bu cümleye “en” anlamı katar.\n" +
                "small → the smallest (küçük → en küçük)\n" +
                "fast → the fastest (hızlı → en hızlı)\n\n" +
                "• İki veya daha fazla heceli sıfatların önüne “the most” kelimesi getirilir ve bu cümleye “en” anlamı katar.\n" +
                "interesting → the most interesting (ilginç → en ilginç)\n\n" +
                "Note 1: Tek heceli sıfatlarda sonu “-e” ile biten sıfatlara “-st” eki eklenir ve sıfatın başına yine “the” kelimesi getirilir.\n" +
                "large → the largest\n\n" +
                "Note 2: Tek heceli sıfatlarda sıfat “sesli harf + sessiz harf” şeklinde bitiyorsa, sıfatın sonundaki sessiz harf çift yazılır ve\n" +
                "ardından “-est” eki getirilir."  );
    }
}