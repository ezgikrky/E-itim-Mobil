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

public class Unit4 extends AppCompatActivity {


    private ImageButton butonHome;
    private TextView textViewU2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4);


        butonHome=findViewById(R.id.butonHome);
        textViewU2=findViewById(R.id.textViewU2);
        button=findViewById(R.id.button);

        butonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit4.this, HomePage.class));
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unit4.this, Exercise.class));
            }
        });


        textViewU2.setText("ÜNİTE 4 – WILD ANIMALS\n\n" +
                "KONU ANLATIMI\n\n" +
                "SHOULD – SHOULDN’T\n\n" +
                "Karşınızdaki bir kişiye yapması ya da yapmaması gereken bir durumla ilgili tavsiyede bulunurken ya da\n" +
                "bulunduğunuz herhangi bir ortamda etrafınıza öneride bulunurken;\n\n" +
                "- We should protect the wild animals. (Vahşi hayvanları korumalıyız.)\n" +
                "- You should keep the environment clean. (Çevreyi temiz tutmalısın.)\n" +
                "- We shouldn’t hunt the animals. (Hayvanları avlamamalıyız.)\n" +
                "- You shouldn’t waste energy. (Enerjiyi boşa harcamamalısın.)\n\n" +
                "“Wild Animals” ünitesi ile ilgili cümle örnekleri;\n\n" +
                "A: Where do wild animals live?\n" +
                "B: They live in the wild like jungles, deserts, oceans.\n" +
                "A: What is the class of chameleons?\n" +
                "B: They are reptiles.\n" +
                "A: How long do eagles live?\n" +
                "B: They live about 40 years.\n" +
                "A: What do lions eat?\n" +
                "B: They eat meat.\n" +
                "A: What should we do to protect wild animals?\n" +
                "B: We should keep the wild animals’ habitats clean. We shouldn’t hunt wild animals and harm the nature. ");
    }
}