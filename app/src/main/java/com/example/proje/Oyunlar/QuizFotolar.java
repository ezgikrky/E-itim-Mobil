package com.example.proje.Oyunlar;

public class QuizFotolar {

    private int quiz_id;
    private  String quiz_ad;
    private String quiz_resim;


    public QuizFotolar() {
    }


    public QuizFotolar(int quiz_id, String quiz_ad, String quiz_resim) {
        this.quiz_id = quiz_id;
        this.quiz_ad = quiz_ad;
        this.quiz_resim = quiz_resim;
    }


    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public String getQuiz_ad() {
        return quiz_ad;
    }

    public void setQuiz_ad(String quiz_ad) {
        this.quiz_ad = quiz_ad;
    }

    public String getQuiz_resim() {
        return quiz_resim;
    }

    public void setQuiz_resim(String quiz_resim) {
        this.quiz_resim = quiz_resim;
    }

}
