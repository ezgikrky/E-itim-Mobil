package com.example.proje.Oyunlar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proje.R;

public class QuizOyunu3 extends AppCompatActivity {

    private TextView textDY, textYüzde;
    private Button buttonTekrarD;
    private int dogruSayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_oyunu3);

        textDY=findViewById(R.id.textDY);
        textYüzde=findViewById(R.id.textYüzde);
        buttonTekrarD=findViewById(R.id.buttonTekrarD);

        dogruSayac=getIntent().getIntExtra("dogruSayac",0);

        textDY.setText(dogruSayac+" DOĞRU "+(5-dogruSayac)+" YANLIŞ");
        textYüzde.setText("% "+(dogruSayac*100)/5+" Başarı");

        buttonTekrarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizOyunu3.this,QuizOyunu2.class));
                finish();

            }}); }}