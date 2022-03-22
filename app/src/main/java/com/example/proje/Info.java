package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    private TextView textViewBilgi;
    private TextView textViewHG;
    private TextView textViewBeceri;
    private ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewBilgi=findViewById(R.id.textViewBilgi);
        textViewHG=findViewById(R.id.textViewHG);
        textViewBeceri=findViewById(R.id.textViewBeceri);
        imageButton3=findViewById(R.id.imageButton3);

        textViewHG.setText("SNOWFLAKE'YE HOŞ GELDİNİZ \n\n" +"Uygulamamız 7.Sınıflara özgü olup size 7.sınıf müfredat bilgisini öğrenmeniz açısından yardımcı olacaktır. Konu anlatım bölümümüzde Üniteler hakkında bilgi sahibi olup pratik yapmanıza olanak sağlayacağız." );
        textViewBilgi.setText("KURS İÇERİĞİ \n \n " + "Konu Anlatım, Oyun,Sözlük, Güncel İngilizce hakkında bilgiler yer alır.");
        textViewBeceri.setText("BECERİLER \n \n" + " Derslerine takviye olarak çalışıp fark yarat \n" + " Liseye geçme aşamasında zorluklardan kurtul. ");


        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Info.this, LoginScreen.class));
            }
        });
    }
}