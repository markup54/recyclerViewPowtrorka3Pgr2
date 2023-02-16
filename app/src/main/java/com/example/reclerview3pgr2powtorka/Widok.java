package com.example.reclerview3pgr2powtorka;

public class Widok {
    private  int idObrazka;
    private String opisObrazka;

    public Widok(int idObrazka, String opisObrazka) {
        this.idObrazka = idObrazka;
        this.opisObrazka = opisObrazka;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getOpisObrazka() {
        return opisObrazka;
    }
}
