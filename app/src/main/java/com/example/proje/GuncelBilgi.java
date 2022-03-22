package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class GuncelBilgi extends AppCompatActivity {

    private TextView textViewGB;

    Random random= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guncel_bilgi);

        textViewGB=findViewById(R.id.textViewGB);


        String[] cümleler={"''Friendly'' sözcüğü hem arkadaş canlısı hem de cana yakın anlamına gelir. Bu nedenle bazı cümlelerle " +
                "Accesible sözcüğünün yerine kullanılabilir."," İngiizcede her sıfatın birden çok karşılığı vardır. Bu sıfatlar bazıları eş anlamlı, " +
                "bazıları ise yakın anlamlıdır. Örneğin ''Hardworking'' - Sıkı çalışan kişiler için kullanılırken, ''Earnest'' kelimesi öğrenmeye hevesli kişileri tanımlar."
                ,"Olumsuz sıfatlar ve kişilik özelliklerinde de ''eş anlam'' ve ''yakın anlam'' ayrımı vardır. Örneğin Unthinking " +
                "kelimesinin sözlük anlamı ''Düşüncesiz''dir. Planlarına sadık kalmayan ve patavatsız insanlar için kullanılır. Impudent ise genel bir tabir olup saygısızca davranan herkes için kullanılabilir.",
                "Kişiliği sormak için aşağıdaki soru kalıbı kullanılır. (What is…. like?)\n" +
                        "Ve bu soruya da kişilik özellikleri ile ilgili sıfatlarla cevap verilir.", "İki şeyi birbiriyle karşılatırırkn " +
                "\"Comparative Adjective\" yapısını kullanırız. Yani\n" +
                "sıfatlarda karşılaştırma dediğimiz yapıyı kullanırız. " , "Kısa sıfata eklediğimiz ” – er “ eki daha anlamına ve " +
                "“ than” kelimesi\n" + "de –den anlamına gelmektedir.\n"};


        int kacinciEleman=random.nextInt(cümleler.length);
        textViewGB.setText(cümleler[kacinciEleman]);

    }
}