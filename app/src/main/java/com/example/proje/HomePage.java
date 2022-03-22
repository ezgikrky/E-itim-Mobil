package com.example.proje;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.proje.Oyunlar.Sözlük.MainActivity2;

public class HomePage extends AppCompatActivity {

    private ImageButton imageKA , imageEg, imageGB,imageSozluk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        imageKA=findViewById(R.id.imageKA);
        imageEg=findViewById(R.id.imageEg);
        imageGB=findViewById(R.id.imageGB);
        imageSozluk=findViewById(R.id.imageSozluk);


        imageKA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomePage.this, Unit.class));
            }
        });

        imageEg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomePage.this, Exercise.class));
            }
        });

        imageGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomePage.this, GuncelBilgi.class));
            }
        });

        imageSozluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomePage.this, MainActivity2.class));
            }
        });
    }
}