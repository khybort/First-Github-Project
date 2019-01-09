package com;




import com.entities.Doktor;
import com.entities.Hasta;
import com.daouygulama.HastaIslemleri;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public final class HastaEkrani extends javax.swing.JDialog {
    DefaultTableModel model1;
    DefaultTableModel model2;
    HastaIslemleri islemler =  new HastaIslemleri();
    
    
    
    public HastaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();       
        hideTextField();
        model1 = (DefaultTableModel) hasta_tablosu.getModel();
        hastaGoruntule();
        model2=(DefaultTableModel) doktor_tablosu.getModel();
        doktorGoruntule();
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hasta_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        tc_alani = new javax.swing.JTextField();
        tel_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        hastaekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tarih_alani = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        doktor_tablosu = new javax.swing.JTable();
        doktor_adi = new javax.swing.JTextField();
        doktor_soyadi = new javax.swing.JTextField();
        doktor_bolumu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hasta_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "TC", "Tel", "Tarih", "Doktor Adı", "Doktor Soyadı", "Doktor Bölümü"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hasta_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hasta_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hasta_tablosu);
        if (hasta_tablosu.getColumnModel().getColumnCount() > 0) {
            hasta_tablosu.getColumnModel().getColumn(0).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(1).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(2).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(3).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(4).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(5).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(6).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(7).setResizable(false);
            hasta_tablosu.getColumnModel().getColumn(8).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad     :");

        jLabel2.setText("Soyad:");

        jLabel3.setText("T.C.   :");

        jLabel4.setText("Tel     :");

        tc_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc_alaniActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));

        hastaekle.setText("Yeni Hasta Ekle");
        hastaekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaekleActionPerformed(evt);
            }
        });

        guncelle.setText("Hasta Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Hasta Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarih :");

        doktor_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "isim", "Soyisim", "Bölüm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doktor_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doktor_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(doktor_tablosu);
        if (doktor_tablosu.getColumnModel().getColumnCount() > 0) {
            doktor_tablosu.getColumnModel().getColumn(0).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(1).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(2).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setText("Dinamik Arama:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arama_cubugu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(soyad_alani)
                                        .addGap(2, 2, 2))
                                    .addComponent(ad_alani)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel_alani)
                                    .addComponent(tc_alani))
                                .addGap(2, 2, 2)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(doktor_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktor_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktor_bolumu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(347, 347, 347))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(tarih_alani)
                        .addGap(513, 513, 513))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaekle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(doktor_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(doktor_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tc_alani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(doktor_bolumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tel_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(hastaekle)
                        .addGap(10, 10, 10)
                        .addComponent(guncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr1 = new TableRowSorter<DefaultTableModel>(model1);
        TableRowSorter<DefaultTableModel> tr2 = new TableRowSorter<DefaultTableModel>(model2);
        
        
        hasta_tablosu.setRowSorter(tr1);
        doktor_tablosu.setRowSorter(tr2);
        
        
        tr1.setRowFilter(RowFilter.regexFilter(ara));
        tr2.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
        
        
    }//GEN-LAST:event_arama_cubuguKeyReleased
    private void hastaekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaekleActionPerformed
        mesaj_yazisi.setText("");
        
        String adi  =  ad_alani.getText();
        String soyadi = soyad_alani.getText();
        String tc =  tc_alani.getText();
        String tel = tel_alani.getText();
        String tarih=tarih_alani.getText();
        String doktoradi = doktor_adi.getText();
        String doktorsoyadi = doktor_soyadi.getText();
        String doktorbolumu = doktor_bolumu.getText();
        
        islemler.hastaEkle(adi,soyadi,tc,tel,tarih,doktoradi,doktorsoyadi,doktorbolumu);
        
        hastaGoruntule();
        
        mesaj_yazisi.setText("Yeni Hasta Başarıyla Eklendi...");
    }//GEN-LAST:event_hastaekleActionPerformed

    private void hasta_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasta_tablosuMouseClicked
      
        int selectedrow = hasta_tablosu.getSelectedRow();
        ad_alani.setText(model1.getValueAt(selectedrow,1).toString());
        soyad_alani.setText(model1.getValueAt(selectedrow,2).toString());
        tc_alani.setText(model1.getValueAt(selectedrow,3).toString());
        tel_alani.setText(model1.getValueAt(selectedrow,4).toString());
        tarih_alani.setText(model1.getValueAt(selectedrow,5).toString());
        doktor_adi.setText(model1.getValueAt(selectedrow,6).toString());
        doktor_soyadi.setText(model1.getValueAt(selectedrow,7).toString());
        doktor_bolumu.setText(model1.getValueAt(selectedrow,8).toString());        
    }//GEN-LAST:event_hasta_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        
        
        String adi = ad_alani.getText();
        String soyadi = soyad_alani.getText();
        String tc = tc_alani.getText();
        String tel = tel_alani.getText();
        String tarih =tarih_alani.getText();
        String doktoradi=doktor_adi.getText();
        String doktorsoyadi=doktor_soyadi.getText();
        String doktorbolumu=doktor_bolumu.getText();
        
        int selectedrow = hasta_tablosu.getSelectedRow();
        if (selectedrow == -1) {
            if (model1.getRowCount() == 0) {
                mesaj_yazisi.setText("Hasta Tablosu şu anda boş. ");
            }
            else {
                mesaj_yazisi.setText("Lütfen güncellenecek bir hasta seçin.");
            }
        }
        else {
            int id = (int)model1.getValueAt(selectedrow,0);
            islemler.hastaGuncelle(id,adi,soyadi,tc,tel,tarih,doktoradi,doktorsoyadi,doktorbolumu);
            hastaGoruntule();
            mesaj_yazisi.setText("Hasta başarıyla güncellendi...");
        }
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
       mesaj_yazisi.setText("");
       int selectedrow = hasta_tablosu.getSelectedRow();
       if (selectedrow == -1) {
           if (model1.getRowCount() == 0 ) {
               mesaj_yazisi.setText("Hasta tablosu şu anda boş...");
           }
           else {
               mesaj_yazisi.setText("Lütfen silinecek bir hasta seçin...");
           }
       }
       else {
           int id = (int)model1.getValueAt(selectedrow,0);
           
           islemler.hastaSil(id);
           
           hastaGoruntule();
           
           mesaj_yazisi.setText("Hasta başarıyla silindi...");
       }
    }//GEN-LAST:event_silActionPerformed

    private void tc_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tc_alaniActionPerformed

    private void doktor_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktor_tablosuMouseClicked
        // TODO add your handling code here:
        
        int selectedrow = doktor_tablosu.getSelectedRow();
        doktor_adi.setText(model2.getValueAt(selectedrow,1).toString());
        doktor_soyadi.setText(model2.getValueAt(selectedrow,2).toString());
        doktor_bolumu.setText(model2.getValueAt(selectedrow,3).toString());
        
    }//GEN-LAST:event_doktor_tablosuMouseClicked

    public void hastaGoruntule() {
        
        model1.setRowCount(0);
        
        ArrayList<Hasta> hastalar = new ArrayList<Hasta>();
        hastalar = islemler.hastalariGetir();
        if (hastalar != null ) {
            for (Hasta hasta : hastalar) {
                Object[] eklenecek = {hasta.getId(),hasta.getAdi(),hasta.getSoyadi(),hasta.getTc(),hasta.getTel(),hasta.getTarih(),hasta.getDoktor_adi(),hasta.getDoktor_soyadi(),hasta.getDoktor_bolumu()};
                model1.addRow(eklenecek);
            }
        }
    }
        public void hideTextField(){
        doktor_adi.setVisible(false);
        doktor_soyadi.setVisible(false);
        doktor_bolumu.setVisible(false);
    }
    public void doktorGoruntule() {
        
        model2.setRowCount(0);
        
        ArrayList<Doktor> doktorlar = new ArrayList<Doktor>();
        
        
        doktorlar = islemler.doktorlariGetir();
        
        if (doktorlar != null ) {
            
            for (Doktor doktor : doktorlar) {
                Object[] eklenecek = {doktor.getId(),doktor.getAdi(),doktor.getSoyadi(),doktor.getBolum()};
                model2.addRow(eklenecek);
            }
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HastaEkrani dialog = new HastaEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTextField doktor_adi;
    private javax.swing.JTextField doktor_bolumu;
    private javax.swing.JTextField doktor_soyadi;
    private javax.swing.JTable doktor_tablosu;
    private javax.swing.JButton guncelle;
    private javax.swing.JTable hasta_tablosu;
    private javax.swing.JButton hastaekle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JTextField tarih_alani;
    private javax.swing.JTextField tc_alani;
    private javax.swing.JTextField tel_alani;
    // End of variables declaration//GEN-END:variables
}
