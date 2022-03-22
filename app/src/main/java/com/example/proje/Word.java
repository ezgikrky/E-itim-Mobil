package com.example.proje;

public class Word {
    private  String Soru;
    private String TCvp;
    private String ICvp;

    public Word() {
    }

    public Word(String soru, String TCvp, String ICvp) {
        Soru = soru;
        this.TCvp = TCvp;
        this.ICvp = ICvp;
    }
    public String getSoru() {
        return Soru;
    }

    public void setSoru(String soru) {
        Soru = soru;
    }

    public String getTCvp() {
        return TCvp;
    }

    public void setTCvp(String TCvp) {
        this.TCvp = TCvp;
    }

    public String getICvp() {
        return ICvp;
    }

    public void setICvp(String ICvp) {
        this.ICvp = ICvp;
    }
}
