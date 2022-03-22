package com.example.proje.Oyunlar.Sözlük;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.proje.R;

import java.util.Locale;

public class DetayActivity extends AppCompatActivity {

    private TextView textViewIngilizce,textViewTurkce;
    private Kelimeler kelime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        textViewTurkce=findViewById(R.id.textViewTurkce);
        textViewIngilizce=findViewById(R.id.textViewIngilizce);

        kelime=(Kelimeler) getIntent().getSerializableExtra("nesne");

        textViewIngilizce.setText(kelime.getIngilizce().toUpperCase());
        textViewTurkce.setText(kelime.getTurkce().toUpperCase());

    }
}