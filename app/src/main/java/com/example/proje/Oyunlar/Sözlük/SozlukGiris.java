package com.example.proje.Oyunlar.Sözlük;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;
import java.util.ArrayList;

import com.example.proje.R;

public class SozlukGiris extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private Toolbar toolbar;
    private RecyclerView rv;

    private ArrayList<Kelimeler> kelimelerListe;
    private KelimelerAdapter adapter;
    private Veritabani vt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sozluk_giris);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);

        vt = new Veritabani(this);
        veritabaniKopyala();

        // menüye toolbar a bağlica<
        toolbar.setTitle("Sözlük Uygulaması");//toolbar başlık
        setSupportActionBar(toolbar); //toolbar etkin halde

        //tasarımını fixledim
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this)); //alt alta görünsün diye linear kullanıldı

        kelimelerListe=new KelimelerDao().tumKelimeler(vt);

        adapter = new KelimelerAdapter(this,kelimelerListe);
        rv.setAdapter(adapter); //kelimeler görünür olsundiye


    }

    //toolbarı arama işlemi yapmak için kullanıyoruz butonu gösterme işi
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.arama_menu,menu); //toolbar eklendi

        // arama özelliğini aktif hale getiriyorum ve veri gönderme işlemini yapıyorum
        MenuItem item = menu.findItem(R.id.arama_id);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    // arama işlemi yaparken 2 seçenek veriyor
    @Override
    public boolean onQueryTextSubmit(String query) { // veriyi girdik arama butonuna tıklayınca veriyi gönderiyor
        Log.e("Gönderilen Arama",query);
        aramaYap(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) { //harf silip girdiğimizde arama işlemi yapıyor
        Log.e("Harf girdikçe",newText);
        return false;
    }
    public void veritabaniKopyala(){
        DatabaseCopyHelper copyHelper = new DatabaseCopyHelper(this);

        try {
            copyHelper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        copyHelper.openDataBase();
    }

    public void aramaYap(String aramaKelime){

        kelimelerListe = new KelimelerDao().kelimeAra(vt,aramaKelime);

        adapter = new KelimelerAdapter(this,kelimelerListe);

        rv.setAdapter(adapter);
    }

}