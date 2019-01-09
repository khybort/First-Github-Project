/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entities.Hasta;
import com.entities.Doktor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khybort
 */
public interface HastaDao {
    void hastaEkle(String adi,String soyadi,String tc,String tel, String tarih,String doktor_adi, String doktor_soyadi, String doktor_bolumu);
    void hastaSil(int id);
    void hastaGuncelle(int id,String yeni_adi,String yeni_soyadi,String yeni_tc,String yeni_tel, String yeni_tarih, String yeni_doktor_adi,String yeni_doktor_soyadi, String yeni_doktor_bolumu);
    void doktorEkle(String doktor_adi,String doktor_soyadi,String doktor_bolumu);
    boolean girisYap(String kullanici_adi,String parola);
    ArrayList<Doktor> doktorlariGetir();
    ArrayList<Hasta> hastalariGetir();
    
}
