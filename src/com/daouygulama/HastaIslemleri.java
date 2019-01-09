package com.daouygulama;
import com.entities.Hasta;
import com.entities.Doktor;
import com.baglanti.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HastaIslemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public ArrayList<Hasta> hastalariGetir() { 
        ArrayList<Hasta> cikti = new ArrayList<Hasta>(); 
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From hastalar";     
            ResultSet rs =  statement.executeQuery(sorgu);     
            while(rs.next()) {
                int id = rs.getInt("id");
                String adi = rs.getString("adi");
                String soyadi = rs.getString("soyadi");
                String tc  = rs.getString("tc");
                String tel = rs.getString("tel");
                String tarih=rs.getString("tarih");   
                String doktor_adi=rs.getString("doktor_adi");
                String doktor_soyadi=rs.getString("doktor_soyadi");
                String doktor_bolumu=rs.getString("doktor_bolumu");
                cikti.add(new Hasta(id, adi, soyadi, tc, tel,tarih,doktor_adi,doktor_soyadi,doktor_bolumu));         
            }
            return cikti;     
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;     
        }         
    }
        public ArrayList<Doktor> doktorlariGetir() {
        
        ArrayList<Doktor> cikti = new ArrayList<Doktor>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From doktorlar";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String doktor_adi = rs.getString("adi");
                String doktor_soyadi = rs.getString("soyadi");
                String doktor_bolumu=rs.getString("bolum");
                
                cikti.add(new Doktor(id, doktor_adi, doktor_soyadi,doktor_bolumu));   
            }
            return cikti;    
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
                
    } 
    public void hastaGuncelle(int id,String yeni_adi,String yeni_soyadi,String yeni_tc,String yeni_tel, String yeni_tarih, String yeni_doktor_adi,String yeni_doktor_soyadi, String yeni_doktor_bolumu) {
        String sorgu =  "UPDATE `hastalar` SET `adi`=?,`soyadi`=?,`tc`=?,`tel`=?,`tarih`=?,`doktor_adi`=?,`doktor_soyadi`=?,`doktor_bolumu`=? WHERE `id`=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);   
            preparedStatement.setString(1,yeni_adi);
            preparedStatement.setString(2,yeni_soyadi);   
            preparedStatement.setString(3,yeni_tc);
            preparedStatement.setString(4,yeni_tel);   
            preparedStatement.setInt(9, id);
            preparedStatement.setString(5,yeni_tarih);   
            preparedStatement.setString(6,yeni_doktor_adi);   
            preparedStatement.setString(7,yeni_doktor_soyadi);   
            preparedStatement.setString(8,yeni_doktor_bolumu);   
            preparedStatement.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hastaSil(int id) {
        String sorgu = "Delete from hastalar where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);   
            preparedStatement.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hastaEkle(String adi,String soyadi,String tc,String tel, String tarih,String doktor_adi, String doktor_soyadi, String doktor_bolumu) {
        String sorgu = "Insert Into hastalar (adi,soyadi,tc,tel,tarih,doktor_adi,doktor_soyadi,doktor_bolumu) VALUES(?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);   
            preparedStatement.setString(1, adi);
            preparedStatement.setString(2, soyadi);
            preparedStatement.setString(3, tc);
            preparedStatement.setString(4, tel);
            preparedStatement.setString(5,tarih);   
            preparedStatement.setString(6,doktor_adi);   
            preparedStatement.setString(7,doktor_soyadi);   
            preparedStatement.setString(8,doktor_bolumu);   
            preparedStatement.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void doktorEkle(String doktor_adi,String doktor_soyadi,String doktor_bolumu) {
        String sorgu = "Insert Into doktorlar (adi,soyadi,bolum) VALUES(?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);   
            preparedStatement.setString(1, doktor_adi);
            preparedStatement.setString(2, doktor_soyadi);
            preparedStatement.setString(3, doktor_bolumu);   
            preparedStatement.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean girisYap(String kullanici_adi,String parola) {   
        String sorgu =  "Select * From adminler where username = ? and password = ?";   
        try {
            preparedStatement = con.prepareStatement(sorgu);       
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
    public HastaIslemleri() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
    
}
