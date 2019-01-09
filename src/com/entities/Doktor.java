package com.entities;






public class Doktor {
    private int id;
    private String adi;
    private String soyadi;
    private String bolum;
    
    public Doktor(int id, String adi, String soyadi,String bolum) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.bolum=bolum;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    
    
    
}
