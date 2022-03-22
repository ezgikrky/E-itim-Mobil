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

public class Unit6 extends AppCompatActivity {

    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);


        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit6.this, HomePage.class));
            }

        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit6.this, Exercise.class));
            }
        });

        textViewU2.setText("ÜNİTE 6 – CELEBRATIONS\n\n" +
                "KONU ANLATIMI\n\n" +
                "OFFERING/MAKING SUGGESTIONS – Öneride bulunma\n" +
                "Karşımızdaki kişiye teklifte bulunurken-öneride bulunurken kullanabileceğimiz birçok yapı vardır. Bunlardan bazılarını\n" +
                "sizler için kısaca sıralayalım.\n" +
                "Would you like …………………. ?   --> ........?ister misin ?\n" +
                "Do you want …………………….. ?   --> ........?ister misin ?\n\n" +
                "*** Bu yapılardan sonra isim de kullanılabilir fiil de kullanılabilir. Eğer fiil kullanılırsa fiilin önüne “to” gelir. ***\n\n" +
                "Examples:\n" +
                "• Would you like tea? (Çay ister misin?)\n" +
                "• Would you like to drink tea? (Çay içmek ister misin?)\n" +
                "• Do you want tea? (Çay ister misin?)\n\n" +
                "• Do you want to drink tea? (Çay içmek ister misin?)\n" +
                "How about ……………………. ?  --> ........'ya ne dersin?\n" +
                "What about ………………….. ?  --> ........'ya ne dersin?\n\n" +
                "*** Bu yapılardan sonra isim de kullanılabilir fiil de kullanılabilir. Eğer fiil kullanılırsa fiile “-ing” eklenir. ***\n\n" +
                "Examples:\n" +
                "• How about coffee? (Kahveye ne dersin?)\n" +
                "• How about drinking coffee? (Kahve içmeye ne dersin?)\n" +
                "• What about coffee? (Kahveye ne dersin?)\n" +
                "• What about drinking coffee? (Kahve içmeye ne dersin?)\n\n"+"Let’s …………………………………………….... . (Haydi ………………-lım.)\n" +
                "Shall we ……………………………..…….…… ? (………………………-lım mı?)\n" +
                "Why don’t you/we ………………………… ? (Neden …………………-mıyorsun? / Neden ……………………-mıyoruz?)\n\n" +
                "*** Bu yapılardan sonra İSİM KULLANILMAZ. Sadece FİİL KULLANILIR ve FİİL YALINDIR, ek almaz. ***\n\n" +
                "Examples:\n" +
                "• Let’s drink orange juice. (Haydi portakal suyu içelim.)\n" +
                "• Shall we drink orange juice? (Portakal suyu içelim mi?)\n" +
                "• Why don’t you drink orange juice? (Neden portakal suyu içmiyorsun?)\n" +
                "• Why don’t we drink orange juice? (Neden portakal suyu içmiyoruz?)");
    }
}