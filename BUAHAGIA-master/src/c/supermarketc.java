/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import m.maset;
import m.mpembelian;
import m.molah;
import m.mplayer;
import v.insupermarket;
import v.mainmenu;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class supermarketc {

    String username;
    insupermarket supermarket;
    molah molah;
    mpembelian mbelibahan;
    boolean statusGula = false;
    boolean statusTepungT = false;
    boolean statusMayo = false;
    boolean statusSirup = false;
    boolean statusMentega = false;
    boolean statusSusu = false;
    boolean statusMinyak = false;
    boolean statusPengembang = false;
    boolean statusTelur = false;
    boolean statusTepungB = false;
    int uang, jml, legend;
    int gula, minyak, telur, tepungterigu, mayo, sirup, mentega, susu, pengembang, tepungberas;
    AudioInputStream audio;
    Clip clip;
    maset maset;
    ActionListener g, mi, ma, me, si, su, t, tt, tb, p;
    boolean sg1, sg2, sg3, ss1, ss2, ss3, sm1, sm2, sm3;

    public supermarketc(String username) throws SQLException {
        this.username = username;
        supermarket = new insupermarket();
        maset = new maset();
        mbelibahan = new mpembelian();
        molah = new molah();
        supermarket.setVisible(true);
        supermarket.back(new acttombolkembali());
        supermarket.tombolBatal(new actionBatal());
        supermarket.tombolBeli(new actionBeli());
        supermarket.tombolMin(new acttombolMin());
        supermarket.tombolTambah(new acttombolTambah());

        supermarket.btnGula(new acttombolGula());
        supermarket.btnMayo(new acttombolMayonais());
        supermarket.btnMentega(new acttombolMentega());
        supermarket.btnMinyak(new acttombolMinyak());
        supermarket.btnPengembang(new acttombolPengembang());
        supermarket.btnSirup(new acttombolSirup());
        supermarket.btnSusu(new acttombolSusu());
        supermarket.btnTelur(new acttombolTelur());
        supermarket.btnTepungBeras(new acttombolTepungBeras());
        supermarket.btnTepungTerigu(new acttombolTepungTerigu());

        uang = supermarket.setUang(maset.getUang(username));
        jml = supermarket.getTeksJumlah();

        setJmlBahan();
    }

    public void setJmlBahan() throws SQLException {
        getJmlBahan();
        supermarket.setJmlBahan(gula, minyak, mayo, mentega, sirup, telur, tepungterigu, tepungberas, pengembang, susu);
    }

    public void cekStatusPenghargaan() throws SQLException {
        sm1 = maset.cekAchv(username, "simanis", 0);
        sm2 = maset.cekAchv(username, "simanis", 1);
        sm3 = maset.cekAchv(username, "simanis", 2);
        ss3 = maset.cekAchv(username, "sisehat", 2);
        ss2 = maset.cekAchv(username, "sisehat", 1);
        ss1 = maset.cekAchv(username, "sisehat", 0);
        sg1 = maset.cekAchv(username, "sigembul", 0);
        sg2 = maset.cekAchv(username, "sigembul", 1);
        sg3 = maset.cekAchv(username, "sigembul", 2);
        legend = maset.getStatusLegend(username);
    }

    public void getJmlBahan() throws SQLException {
        gula = maset.getJmlBahan(username, 1);
        tepungberas = maset.getJmlBahan(username, 2);
        tepungterigu = maset.getJmlBahan(username, 10);
        pengembang = maset.getJmlBahan(username, 9);
        susu = maset.getJmlBahan(username, 8);
        telur = maset.getJmlBahan(username, 7);
        mentega = maset.getJmlBahan(username, 4);
        mayo = maset.getJmlBahan(username, 6);
        sirup = maset.getJmlBahan(username, 5);
        minyak = maset.getJmlBahan(username, 3);
    }

    public void cekPenghargaanSiGembul() throws SQLException {
        mbelibahan.beliBahan(9, username, jml); //gausa dimasukin sequence
        int bahan = mbelibahan.getBahan(username, 9); //gausa masuk sequence
        if (sg1) {
            if (bahan >= 10) {
                maset.updatePenghargaan(username, "sigembul", 1);
                supermarket.tampilPesan2("SI GEMBUL rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (sg2) {
            if (bahan >= 25) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "sigembul", 2);
                supermarket.tampilPesan2("SI GEMBUL rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (sg3) {
            if (bahan >= 50) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "sigembul", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                supermarket.tampilPesan2("SI GEMBUL rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
    }

    public void cekPenghargaanSiSehat() throws SQLException {
        mbelibahan.beliBahan(8, username, jml);
        int bahan = mbelibahan.getBahan(username, 8); //gausa masuk sequence
        if (ss1) {
            if (bahan >= 250) {
                maset.updatePenghargaan(username, "sisehat", 1);
                supermarket.tampilPesan2("SI SEHAT rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (ss2) {
            if (bahan >= 500) {
                maset.updatePenghargaan(username, "sisehat", 2);
                supermarket.tampilPesan2("SI SEHAT rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (ss3) {
            if (bahan >= 750) {
                maset.updatePenghargaan(username, "sisehat", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                supermarket.tampilPesan2("SI SEHAT rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }

    }

    private void cekPenghargaanSiManis() throws SQLException {
        mbelibahan.beliBahan(1, username, jml);
        int bahan = mbelibahan.getBahan(username, 1); //gausa masuk sequence
        if (sm1) {
            if (bahan >= 1000) {
                maset.updatePenghargaan(username, "simanis", 1);
                supermarket.tampilPesan2("SI MANIS rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (sm2) {
            if (bahan >= 5000) {
                maset.updatePenghargaan(username, "simanis", 2);
                supermarket.tampilPesan2("SI MANIS rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (sm3) {
            if (bahan >= 10000) {
                maset.updatePenghargaan(username, "simanis", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                supermarket.tampilPesan2("SI MANIS rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pasarmap v = new pasarmap();
                pasarc c = new pasarc(username);
                supermarket.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolTepungTerigu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusTepungT = true; //untuk pengecekan di tombol belinya nanti
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/tepung2.png")));
            supermarket.setTeksJumlah("1");
            supermarket.min.setVisible(false);
        }

    }

    private class acttombolTepungBeras implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusTepungB = true; //untuk pengecekan di tombol belinya nanti
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/tepung.png")));
            supermarket.setTeksJumlah("1");
            supermarket.min.setVisible(false);
        }

    }

    private class acttombolGula implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusGula = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/gula.png")));
            supermarket.setTeksJumlah("1");
            supermarket.min.setVisible(false);
        }

    }

    private class acttombolSusu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusSusu = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/susu.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolTelur implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusTelur = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/telur.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolMinyak implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusMinyak = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/minyak.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolMentega implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusMentega = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mentega.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolMayonais implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusMayo = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mayones.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolPengembang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusPengembang = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/vanili.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }

    }

    private class acttombolSirup implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusSirup = true;
            supermarket.popup().setVisible(true);
            supermarket.disable();
            supermarket.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/sirup.png")));
            supermarket.min.setVisible(false);
            supermarket.setTeksJumlah("1");
        }
    }

    private void tepungBerasAction() throws SQLException {
        int id = 2;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 4000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                tepungberas = tepungberas + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(tepungberas, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);

            } else {
                statusTepungB = false;
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void pengembangAction() throws SQLException {
        int id = 9;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 4000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                pengembang = pengembang + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(pengembang, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                cekStatusPenghargaan();
                cekPenghargaanSiGembul();
                supermarket.popup().dispose();
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void telurAction() throws SQLException {
        int id = 7;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 1250;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                telur = telur + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(telur, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void mentegaAction() throws SQLException {
        int id = 4;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 3000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                mentega = mentega + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(mentega, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void sirupAction() throws SQLException {
        int id = 5;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 20000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                sirup = sirup + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(sirup, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void susuAction() throws SQLException {
        int id = 8;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 1200;
        if (uang > (tot)) {
            uang = uang - tot;
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                susu = susu + jml;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(susu, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                cekStatusPenghargaan();
                cekPenghargaanSiSehat();
                supermarket.popup().dispose();
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void gulaAction() throws SQLException {
        int id = 1;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 120;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                gula = gula + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(gula, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                cekStatusPenghargaan();
                cekPenghargaanSiManis();
                supermarket.popup().dispose();
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void mayoAction() throws SQLException {
        int id = 6;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 6000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                mayo = mayo + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(mayo, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void minyakAction() throws SQLException {
        int id = 3;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 11000;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                minyak = minyak + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(minyak, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");
        }
    }

    private void tepungTeriguAction() throws SQLException {
        int id = 10;
        jml = supermarket.getTeksJumlah();
        int tot = jml * 90;
        if (uang > (tot)) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                    + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                tepungterigu = tepungterigu + jml;
                uang = uang - tot;
                maset.updateUang(uang, username);
                mbelibahan.tambahPembelianBahan(tepungterigu, id, username);
                supermarket.tampilPesan2("Transaksi Berhasil");
                supermarket.popup().setVisible(false);
            } else {
                jml = 1;
                supermarket.setTeksJumlah(jml + "");
                supermarket.popup().setVisible(true);
            }
        } else {
            supermarket.tampilPesan("Uang anda tidak cukup!");

        }
    }

    private class acttombolMin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jml <= 2) {
                supermarket.min.setVisible(false);
            }
            int jmlbaru = supermarket.getTeksJumlah();
            jml = jmlbaru - 1;
            supermarket.setTeksJumlah(jml + "");
        }
    }

    private class acttombolTambah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            supermarket.min.setVisible(true);
            int jmlbaru = supermarket.getTeksJumlah();
            jml = jmlbaru + 1;
            supermarket.setTeksJumlah(jml + "");
        }
    }

    private class actionBeli implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                try {
                    audio = AudioSystem.getAudioInputStream(new File("src//ui export//Coin achieve.wav"));
                    clip = AudioSystem.getClip();
                    clip.open(audio);
                    clip.start();
                } catch (Exception ex) {
                    Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (statusTepungT) {
                    try {
                        tepungTeriguAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusGula) {
                    try {
                        gulaAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMinyak) {
                    try {
                        minyakAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusSirup) {
                    try {
                        sirupAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMayo) {
                    try {
                        mayoAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusSusu) {
                    try {
                        susuAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMentega) {
                    try {
                        mentegaAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusPengembang) {
                    try {
                        pengembangAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusTelur) {
                    try {
                        telurAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusTepungB) {
                    try {
                        tepungBerasAction();
                    } catch (SQLException ex) {
                        Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                supermarket.setUang(uang);
                setJmlBahan();
                supermarket.enable();
                supermarket.setVisible(true);
                statusGula = false;
                statusMayo = false;
                statusMentega = false;
                statusMinyak = false;
                statusSirup = false;
                statusSusu = false;
                statusTelur = false;
                statusTepungT = false;
                statusTepungB = false;
                statusPengembang = false;
                jml = 1;
                //   popupbeli.setTeksJumlah(jml + "");
            } catch (SQLException ex) {
                Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class actionBatal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusGula = false;
            statusMayo = false;
            statusMentega = false;
            statusMinyak = false;
            statusSirup = false;
            statusSusu = false;
            statusTelur = false;
            statusTepungT = false;
            statusTepungB = false;
            statusPengembang = false;
            jml = 1;
            supermarket.setTeksJumlah(jml + "");
            supermarket.popup().dispose();
            supermarket.setVisible(true);
            supermarket.enable();
        }

    }
}
