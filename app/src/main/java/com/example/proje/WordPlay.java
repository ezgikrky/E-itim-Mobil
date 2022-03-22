package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class WordPlay extends AppCompatActivity {
    private ArrayList<Word> wordArrayList=new ArrayList<>();
    private char[] chars=new char[100];
    private String ipucu=" ";
    private TextView textView38,textView39;
    private EditText editText,txtInput ;
    private ImageButton imageButton11,IBtnClose;
    private   String text="";
    private   Word temp=new Word();
    private boolean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_play);

        textView38=findViewById(R.id.textView38);
        textView39=findViewById(R.id.textView39);
        editText= (EditText)findViewById(R.id.txtInput);
        imageButton11=findViewById(R.id.imgTahminEt);
        IBtnClose=findViewById(R.id.IBtnClose);
        txtInput=findViewById(R.id.txtInput);
        IBtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordPlay.this,Exercise.class));
            }
        });

        Word w1=new Word();
        w1.setSoru("'E H T O N S ' Karışık verilen harflerle anlamlı bir kelime oluşturduğumuzda cevap ne olur ?");
        w1.setICvp("HONEST");
        w1.setTCvp("BAL");

        Word w2=new Word();
        w2.setSoru("'' Hızlı '' kelimesinin İngilizce karşılığı aşağıdakilerden hangisidir ?");
        w2.setICvp("FAST");
        w2.setTCvp("HIZLI");

        Word w3=new Word();
        w3.setSoru("'' Köpek '' kelimesinin İngilizce karşılığı aşağıdakilerden hangisidir ?");
        w3.setICvp("DOG");
        w3.setTCvp("KÖPEK");

        Word w4=new Word();
        w4.setSoru("'' APPLE '' kelimesinin TÜRKÇE karşılığı aşağıdakilerden hangisidir ?");
        w4.setICvp("APPLE");
        w4.setTCvp("ELMA");

        Word w5=new Word();
        w5.setSoru("'Özer: ………………………………..?\n" +
                "\n" +
                "Müfit: I often do yoga.' cümlesinde boş alana ne gelmelidir ?");
        w5.setICvp("How often do you do yoga?");

        Word w6=new Word();
        w6.setSoru(" 'Every day I eat healthy food. I ……………. eat helthy food.' Boşluğa ne gelmelidir? ");
        w6.setICvp("always");

        Word w7=new Word();
        w7.setSoru(" 'I____bornin Trabzon 1999.  Boş bırakılan yere hangisi gelir?");
        w7.setICvp("was");

        Word w8=new Word();
        w8.setSoru(" ''Koç burcu'' İngilizcesi nedir? ");
        w8.setICvp("Aries");

        Word w9=new Word();
        w9.setSoru(" ''İmpress'' kelimesinin Türkçe karşılığı nedir? ");
        w9.setICvp("Etkilemek");

        Word w10=new Word();
        w10.setSoru(" ''Küresel Isınma''İngilizce karşılığı nedir? ");
        w10.setICvp("Global warming");

        wordArrayList.add(w1);
        wordArrayList.add(w2);
        wordArrayList.add(w3);
        wordArrayList.add(w4);
        wordArrayList.add(w5);
        wordArrayList.add(w6);
        wordArrayList.add(w7);
        wordArrayList.add(w8);
        wordArrayList.add(w9);
        wordArrayList.add(w10);

        temp=wordArrayList.get(randomsay());

        Log.e("soru",temp.getSoru());
        Log.e("soru",temp.getICvp());
        Log.e("soru",temp.getTCvp());


        for (char c : parcala(temp.getICvp())) {
            Log.e("parcala",String.valueOf(c));
        }

        Karıştır(parcala(temp.getICvp()));

        textView38.setText(temp.getSoru());
        textView39.setText(ipucu);

        Word finalTemp = temp;
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text=String.valueOf(txtInput.getText());
                String s=String.valueOf(finalTemp.getICvp());
                s=s.toUpperCase();
                text=text.toUpperCase();
                if (text.equals(s)){
                    ipucu=" ";
                    temp=wordArrayList.get(randomsay());
                    textView38.setText(temp.getSoru());
                    Karıştır(parcala(temp.getICvp()));
                    textView39.setText(ipucu);
                    editText.setText(" ");
                    Toast.makeText(getApplicationContext(),"TEBRİKLER DOGRU CEVAP!!",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext()," YANLIŞ CEVAP!!",Toast.LENGTH_LONG).show(); }

            }}); }
     int randomsay(){
         Random r=new Random(); //random sınıfı
         int a=r.nextInt(wordArrayList.size());

         return a;

     }
     char[] parcala(String str){

         char[] ch = new char[str.length()];


         for (int i = 0; i < str.length(); i++) {
             ch[i] = str.charAt(i);
         }
         return ch;
     }
     void Karıştır(char[] ch){
        int say=0;
        int ip=0;
        for (char c : ch){

            Random r=new Random();
            if (r.nextBoolean()&&ip<2){
                ipucu+=ch[say];
                ip++;
            }
            else{
                ipucu+="-";
            }
            say++; }
    }}