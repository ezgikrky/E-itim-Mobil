package com.example.proje.Oyunlar.Sözlük;

import java.io.Serializable;


// bu sınıf modeline göre adaptör oluşturdum
public class Kelimeler implements Serializable { //implements Serializable özelliğini kattım çünkü kelimeye tıklayınca sayfayı diğer sınıfa taşımak için
    private int kelime_id;
    private String ingilizce;
    private String turkce;

    public Kelimeler() {
    }

    public Kelimeler(int kelime_id, String ingilizce, String turkce) {
        this.kelime_id = kelime_id;
        this.ingilizce = ingilizce;
        this.turkce = turkce;
    }

    public int getKelime_id() {
        return kelime_id;
    }

    public void setKelime_id(int kelime_id) {
        this.kelime_id = kelime_id;
    }

    public String getIngilizce() {
        return ingilizce;
    }

    public void setIngilizce(String ingilizce) {
        this.ingilizce = ingilizce;
    }

    public String getTurkce() {
        return turkce;
    }

    public void setTurkce(String turkce) {
        this.turkce = turkce;
    }



}
