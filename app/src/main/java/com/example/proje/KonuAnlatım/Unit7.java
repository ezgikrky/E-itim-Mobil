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

public class Unit7 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit7);

        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit7.this, HomePage.class));
            }

        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit7.this, Exercise.class));
            }
        });

        textViewU2.setText("ÜNİTE 7 – DREAMS\n\n" +
                "KONU ANLATIMI\n\n" +
                "THE FUTURE TENSE (Gelecek Zaman)\n\n" +
                "“The Future Tense” Türkçedeki “gelecek zaman” kalıbıdır. Cümlede fiile “-ecek, -acak” anlamı katar.\n" +
                "Eğer geleceğe yönelik bir tahminde bulunulacaksa ya da henüz gerçekleşmemiş, gelecekte yapılacak olan bir\n" +
                "eylemden bahsediliyorsa bu kalıp kullanılır.\n\n\n" +
                "Examples:\n\n" +
                "I will pass my English exam. (İngilizce sınavımı geçeceğim.)\n" +
                "She will be successful in her career. (O kariyerinde başarılı olacak.)\n\n\n"+
                "POSITIVE (+) \n\n"+
                "I will be happy.\n" +
                "You will be happy.\n" +
                "We will be happy.\n" +
                "They will be happy.\n" +
                "He will be happy.\n" +
                "She will be happy.\n" +
                "It will be happy.\n\n\n" + "NEGATIVE (-)\n\n"+
                "I won’t be happy.\n" +
                "You won’t be happy.\n" +
                "We won’t be happy.\n" +
                "They won’t be happy.\n" +
                "He won’t be happy.\n" +
                "She won’t be happy.\n" +
                "It won’t be happy.\n\n\n" + "QUESTION FORM (?)\n\n" +
                "Will I be happy?\n" +
                "Will you be happy?\n" +
                "Will we be happy?\n" +
                "Will they be happy?\n" +
                "Will he be happy?\n" +
                "Will she be happy?\n" +
                "Will it be happy?\n\n" +
                "Zaman Zarfları\n\n" +
                "(Adverbs of Time)\n" +
                "tomorrow: yarın\n" +
                "tomorrow morning: yarın sabah\n" +
                "tomorrow afternoon: yarın öğleden sonra\n" +
                "tomorrow evening: yarın akşam\n" +
                "tomorrow night: yarın gece\n" +
                "the day after tomorrow: yarından sonra\n" +
                "in ten minutes: 10 dakika içinde\n" +
                "in an hour: bir saat içinde\n" +
                "in a week: bir hafta içinde\n" +
                "in a month: bir ay içinde\n" +
                "in a year: bir yıl içinde\n" +
                "in the future: gelecekte, ileride\n" +
                "next day: ertesin gün / önümüzdeki gün\n" +
                "next week: gelecek/önümüzdeki hafta\n" +
                "next month: gelecek/önümüzdeki ay\n" +
                "next year: gelecek/önümüzdeki yıl\n" +
                "next time: bir dahaki sefere\n" +
                "next Sunday: gelecek/önümüzdeki Pazar\n" +
                "next Monday: gelecek/önümüzdeki Pazartesi\n" +
                "…\n" +
                "next Summer: gelecek/önümüzdeki yaz\n" +
                "next Winter: gelecek/önümüzdeki kış\n" +
                "…\n" +
                "tonight: bu gece\n" +
                "soon: en kısa zamanda\n" +
                "later: daha sonra");
    }
}