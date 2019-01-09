package com.entities;






public class Hasta {
    
    private int id;
    private String adi;
    private String soyadi;
    private String tc;
    private String tel;
    private String tarih;
    private String doktor_adi;
    private String doktor_soyadi;
    private String doktor_bolumu;

    public Hasta(int id, String adi, String soyadi, String tc, String tel,String tarih,String doktor_adi,String doktor_soyadi,String doktor_bolumu) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.tc = tc;
        this.tel = tel;
        this.tarih=tarih;
        this.doktor_adi=doktor_adi;
        this.doktor_soyadi=doktor_soyadi;
        this.doktor_bolumu=doktor_bolumu;
        
    }

    public String getDoktor_adi() {
        return doktor_adi;
    }

    public void setDoktor_adi(String doktor_adi) {
        this.doktor_adi = doktor_adi;
    }

    public String getDoktor_soyadi() {
        return doktor_soyadi;
    }

    public void setDoktor_soyadi(String doktor_soyadi) {
        this.doktor_soyadi = doktor_soyadi;
    }

    public String getDoktor_bolumu() {
        return doktor_bolumu;
    }

    public void setDoktor_bolumu(String doktor_bolumu) {
        this.doktor_bolumu = doktor_bolumu;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
}
