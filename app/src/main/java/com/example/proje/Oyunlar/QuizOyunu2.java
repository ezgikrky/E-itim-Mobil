package com.example.proje.Oyunlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.proje.R;

import java.util.ArrayList;
import java.util.HashSet;

public class QuizOyunu2 extends AppCompatActivity {


    private TextView textViewDogru, textViewYanlış,textViewSoru,textViewIsim;
    private ImageButton imageButtonFoto;
    private Button buttonA,buttonB,buttonC,buttonD;

    private ArrayList<QuizFotolar> sorularListe;
    private ArrayList<QuizFotolar> yanlısSeçeneklerListe;

    private QuizFotolar dogruSoru;
    private QuizVeritabani vt;
    //Sayaç
    private int soruSayac=0;
    private int yanlisSayac=0;
    private int dogruSayac=0;

    //Secenekleri
    private HashSet<QuizFotolar> secenekleriKaristirmaListe= new HashSet<>();
    private ArrayList<QuizFotolar> seceneklerListe= new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_oyunu2);

        buttonA=findViewById(R.id.buttonA);
        buttonB=findViewById(R.id.buttonB);
        buttonC=findViewById(R.id.buttonC);
        buttonD=findViewById(R.id.buttonD);
        textViewDogru=findViewById(R.id.textViewDogru);
        textViewYanlış=findViewById(R.id.textViewYanlış);
        textViewSoru=findViewById(R.id.textViewSoru);
        textViewIsim=findViewById(R.id.textViewIsim);
        imageButtonFoto=findViewById(R.id.imageButtonFoto);


       vt = new QuizVeritabani(this);

       sorularListe = new QuizDao().rasgele5Getir(vt);

       soruYukle(); // arayüzü yenilicez

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogruKontrol(buttonA);
                soruSayacKontrol();
                Log.e("SAYAC",String.valueOf(soruSayac));
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogruKontrol(buttonB);
                soruSayacKontrol();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogruKontrol(buttonC);
                soruSayacKontrol();
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogruKontrol(buttonD);
                soruSayacKontrol();
            }
        });
    }

    public void soruYukle(){ // arayüzü yeniliyoruz kendi yapısı olduğu için dışardan veri yapısı almayacak
        textViewSoru.setText((soruSayac+1)+". SORU");
        textViewDogru.setText("Doğru : "+(dogruSayac));
        textViewYanlış.setText("Yanlış : "+(yanlisSayac));

        dogruSoru = sorularListe.get(soruSayac);

        yanlısSeçeneklerListe = new QuizDao().rasgele3YanlisSecenekGetir(vt,dogruSoru.getQuiz_id());

        imageButtonFoto.setImageResource(getResources().getIdentifier(dogruSoru.getQuiz_resim()
                ,"drawable",getPackageName()));

        textViewIsim.setText(dogruSoru.getQuiz_resim());

        //Tüm secenekleri hashset yardımıyla karıştırma
        secenekleriKaristirmaListe.clear(); // her seferinde başka seçenek olduğu için temizledik
        secenekleriKaristirmaListe.add(dogruSoru);//Doğru secenek
        secenekleriKaristirmaListe.add(yanlısSeçeneklerListe.get(0));
        secenekleriKaristirmaListe.add(yanlısSeçeneklerListe.get(1));
        secenekleriKaristirmaListe.add(yanlısSeçeneklerListe.get(2));

        //Hashset ile butonlara dinamik şekilde yazı yazdıramadığımızdan arraylist dönüşümü yaptık.
        seceneklerListe.clear();

        for(QuizFotolar f: secenekleriKaristirmaListe){
            seceneklerListe.add(f);
        }
        //Secenekleri buttonlara yerleştirdik.
        buttonA.setText(seceneklerListe.get(0).getQuiz_ad());
        buttonB.setText(seceneklerListe.get(1).getQuiz_ad());
        buttonC.setText(seceneklerListe.get(2).getQuiz_ad());
        buttonD.setText(seceneklerListe.get(3).getQuiz_ad());

    }

    public void dogruKontrol(Button button){

        String buttonYazi = button.getText().toString();
        String dogruCevap = dogruSoru.getQuiz_ad();
        Log.e("Doğru",dogruCevap);
        Log.e("ButtonYazi",buttonYazi);

        if(buttonYazi.equals(dogruCevap)){
            dogruSayac++;
        }else{
            yanlisSayac++;
        }

        textViewDogru.setText("Doğru : "+(dogruSayac));
        textViewYanlış.setText("Yanlış : "+(yanlisSayac));
    }

    public void soruSayacKontrol(){

        soruSayac++;

        //soru sayısı 5 olduysa sonuca git
        if(soruSayac != 5){
            soruYukle();
        }else{
            Intent i = new Intent(QuizOyunu2.this,QuizOyunu3.class);
            i.putExtra("dogruSayac",dogruSayac);
            startActivity(i);
            finish();
        }
    }
}