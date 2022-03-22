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

public class Unit2 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2);


        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit2.this, HomePage.class));
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit2.this, Exercise.class));
            }
        });

        textViewU2.setText("DESCRIBING WHAT PEOPLE DO REGULARLY / REGULAR-DAILY ACTIVITIES\n\n" +
                "Simple Present Tense (Geniş Zaman)\n\n" +
                "• Bu zaman kalıbını genelde yaptığımız işleri, her zaman tekrarlanan eylemleri ve alışkanlıklarımızı anlatırken\n" +
                "kullanırız. Bu kalıbı Türkçeye çevirirken genellikle fiile “-r, -ar, -er, -ir, -ır, -ur, -ür” ekleri getiririz. (yapar, gider,\n" +
                "gelir, oynar, vb.)\n\n" +
                "Examples:\n" +
                "+ I have breakfast. (Ben kahvaltı yaparım.)\n" +
                "+ He gets up early. (O erken uyanır.)\n" +
                "+ She plays tennis. (O tenis oynar.)\n" +
                "− I don’t have breakfast. (Ben kahvaltı yapmam.)\n" +
                "− He doesn’t get up early. (O erken uyanmaz.)\n" +
                "− She doesn’t play tennis. (O tenis oynamaz.)\n\n" +
                "Not: “He, She, It” özneleri ile olumlu bir cümle kuruyorsak;\n" +
                "fiile “-s, -es, -ies” eklerinden biri getirilir.\n" +
                "play → plays\n" +
                "go → goes\n" +
                "fly → flies\n\n" +
                "Not: Olumsuz cümle oluştururken;\n" +
                "− “I, You, We, They” öznelerinden sonra\n" +
                "“do not/don’t”,\n" +
                "− “He, She, It” öznelerinden sonra\n" +
                "“does not/doesn’t” kullanılır.\n\n" +
                "Yes / No Questions (Evet/Hayır Soruları)\n\n" +
                "- Do you go to gym? - Does he go jogging?\n" +
                "- Yes, I do. (+) - Yes, he does. (+)\n" +
                "- Do you ride a bike? - Does she swim?\n" +
                "- No, I don’t. (-) - No, she doesn’t. (-)\n\n" +
                "WH- Questions (Bilgi Soruları)\n" +
                "What? – Ne?\n" +
                "Who? – Kim?\n" +
                "Whose? – Kimin?\n" +
                "Where? – Nerede?/Nereye?\n" +
                "When? – Ne zaman?\n" +
                "Which? – Hangi?/Hangisi?\n" +
                "What time? – Saat kaçta?\n" +
                "Why? – Neden?\n" +
                "How? – Nasıl?\n" +
                "How often? – Ne sıklıkta?\n\n" +
                "FREQUENCY OF ACTIONS\n" +
                "Bir işin hangi sıklıkta yapıldığını sorarken;\n" +
                "“How often ……. ?” soru cümlesi kullanılır.\n\n" +
                "Frequency Adverbs (Sıklık Zarfları)\n" +
                "%100 Always – Her zaman\n" +
                "%90 Usually – Genellikle\n" +
                "%75 Often – Sık sık\n" +
                "%50 Sometimes – Bazen\n" +
                "%10 Seldom/Rarely – Nadiren\n" +
                "%0 Never – Hiç, hiçbir zaman, asla\n" +
                "***Bu zarflar bir işin hangi sıklıkta yapıldığını ifade etmek için kullanılır ve cümlede özne ile fiilin arasında yer alır.***\n\n" +
                "Other Frequency Expressions (Diğer Sıklık İfadeleri)\n\n" +
                "Every morning" +
                "Every day, " +
                "Every summer …, " +
                "Every Monday…, "+
                "Once a day" );
    }
}