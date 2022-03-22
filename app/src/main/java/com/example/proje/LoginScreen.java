package com.example.proje;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class LoginScreen extends AppCompatActivity {

    private TextView textViewGiriş;
    private TextView textViewRandom;
    private Button buttonNext , btnInfo;
    Random random= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        String[] cümleler={"Başarı seni bulmaz. Sen çıkıp onu yakalamalısın.","Hayatını bugün değiştir. Geleceğin üzerine kumar oynama. Şimdi harekete geç, hemen.","Eğer hayal edebiliyorsanız, yapabilirsiniz.","Yalnızca bugün yaptıkların, bütün yarınlarını değiştirebilir."};

        int kacinciEleman=random.nextInt(cümleler.length);

        textViewGiriş=findViewById(R.id.textViewGiriş);
        textViewRandom=findViewById(R.id.textViewRandom);
        buttonNext=findViewById(R.id.buttonNext);
        btnInfo=findViewById(R.id.btnInfo);

        textViewGiriş.setText("Ücretsiz Dilini Geliştir ");

        textViewRandom.setText(cümleler[kacinciEleman]);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivity(new Intent(LoginScreen.this, HomePage.class));
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, Info.class));
            }
        }); } }