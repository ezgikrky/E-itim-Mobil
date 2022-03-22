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

public class Unit5 extends AppCompatActivity {


    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5);


        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit5.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit5.this, Exercise.class));
            }
        });


        textViewU2.setText("UNIT 5 – TELEVISION\n\n" +
                "KONU ANLATIMI\n\n" +
                "“PREFER”\n\n" +
                "“prefer” kelimesinin sözlük anlamı “tercih etmek”tir. Bu ünitede sevdiğiniz, tercih ettiğiniz televizyon\n" +
                "programlarından ya da filmlerden söz ederken bu kalıbı kullanabilirsiniz.\n\n" +
                "• İsimlerle kullanırken;\n\n" +
                "- I prefer horror films. (Ben korku filmlerini tercih ederim.)\n" +
                "- She prefers animations. (O animasyonları tercih eder.)\n" +
                "- We prefer cartoons. (Biz çizgi filmleri tercih ederiz.)\n\n" +
                "• Fiillerle kullanılırken; fiile “-ing” eki getirilir.\n\n" +
                "- I prefer watching horror films. (Ben korku filmleri izlemeyi tercih ederim.)\n" +
                "- She prefers watching animations. (O animasyonları izlemeyi tercih eder.)\n" +
                "- We prefer watching cartoons. (Biz çizgi filmleri izlemeyi tercih ederiz.)\n\n" +
                "• İki şey arasında -neyi neye- tercih ettiğinizi belirtirken de;\n" +
                "iki durum arasına “to” getirilir.\n" +
                "- I prefer horror film to action film. (Ben korku filmini aksiyon filmine tercih ederim.)\n" +
                "- I prefer watching horror film to watching action film. (Ben korku filmi izlemeyi aksiyon filmi izlemeye\n" +
                "tercih ederim.)\n" +
                "- He prefers news to documentaries. (O haberleri belgesellere tercih eder.)\n" +
                "- He prefers watching news to watching documentaries. (O haberleri izlemeyi belgeselleri izlemeye tercih\n" +
                "eder.)\n\n" +
                "“Television” ünitesi ile ilgili diğer cümle kalıpları;\n\n" +
                "- Do you fancy watching a science fiction film?\n" +
                "- Yes, I do. / No, I don’t.\n\n" + "- What is your favourite TV Programme?\n" +
                "- My favourite TV programme is a Quiz Show.\n\n"+"- Do you like cartoons?\n" +
                "- Yes, I do. / No, I don’t.\n\n" +
                "- Does your mother like soap opera?\n" +
                "- Yes, she does. / No, she doesn’t.\n\n" +
                "- He isn’t very keen on documentaries.\n" +
                "- We aren’t very keen on cartoons.\n\n" +
                "- What is it about?\n" +
                "- It is about wild life.");
    }
}