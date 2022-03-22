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


public class Unit1 extends AppCompatActivity {

    private ImageButton buttonHome;
    private TextView textView4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);


        buttonHome=findViewById(R.id.butonHome);
        textView4=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);


        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit1.this, HomePage.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit1.this, Exercise.class));
            }
        });


        textView4.setText("UNIT 1:APPEARANCE AND PERSONALITY\n\n" +
                "KONU ANLATIMI\n\n" +"TALKING ABOUT PHYSICAL APPEARANCE AND PERSONALITY\n\n" +
                "• Birinin fiziksel (dış) görünüşünden bahsederken (saç yapısı ve rengi, göz rengi, kilosu ve boyu vb.) belli soru ve\n" +
                "cümle kalıpları kullanılır.\n\n" +
                "- What does he/she look like?\n" +
                "- He/she is tall and slim. He/she has got wavy dark hair and brown eyes.\n\n\n" +
                "• Birinin kişilik özelliğinden bahsederken de;\n\n" +
                "- What is he/she like?\n" +
                "- He/she is honest and punctual.\n\n\n" +
                "MAKING COMPARISONS – COMPARATIVE ADJECTIVES\n\n" +
                "İki şey karşılaştırılırken sıfatlar kullanılır ve karşılaştırma cümlelerinde bu kullanılan sıfatların hece sayıları önemlidir.\n" +
                "• Tek heceli sıfatların sonuna “-er” eki getirilir ve bu cümleye “daha” anlamı katar.\n\n" +
                "old → older\n" +
                "small → smaller\n\n" +
                "• İki veya daha fazla heceli sıfatların önüne “more” kelime getirilir ve bu cümleye “daha” anlamı\n" +
                "katar.\n" +
                "beautiful → more beautiful\n"+
                "stubborn → more stubborn\n\n" +
                "Note 1: Tek heceli sıfatlarda sıfat “sessiz harf + y” şeklinde bitiyorsa, bu sıfatın sonuna “-er” eki getirilirken “-y”\n" +
                "düşer ve yerine “-ier” eki getirilir.\n" +
                "lazy → lazier\n" +
                "easy → easier\n\n" +
                "Note 2: Tek heceli sıfatlarda sıfat “sesli harf + sessiz harf” şeklinde bitiyorsa, sıfatın sonundaki sessiz harf çift yazılır\n" +
                "ve ardından “-er” eki getirilir.\n" +
                "big → bigger\n" +
                "slim → slimmer\n" +
                "• Bazı sıfatlar düzensizdir. Bu sıfatlarda kısa ya da uzun sıfatlardaki kurallar uygulanmaz. Bu\n" +
                "sıfatlar cümlede “daha” anlamında kullanılacağı zaman sıfat tamamen değişir ve değişirken belli\n" +
                "bir kuralı yoktur.\n" +
                "good → better\n" +
                "little → less\n" +
                "far → farther/further\n\n" +
                "*** Karşılaştırma cümlelerinde sıfatlardan sonra mutlaka “than” ifadesi kullanılır.***");
    }
}