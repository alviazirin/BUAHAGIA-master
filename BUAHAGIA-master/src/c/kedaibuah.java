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
import java.util.Random;
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
import v.inkedaibuah1;
import v.inkedaibuah2;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class kedaibuah {

    boolean kedai1 = false;
    boolean kedai2 = false;
    String username;
    maset maset;
    //   player mplayer;
    mpembelian mbelibuah;
    inkedaibuah1 vkedai1;
    inkedaibuah2 vkedai2;
    molah molah;
    boolean mma1, mma2, mma3, ma1, ma2, ma3, mme1, mme2, mme3;
    boolean statusMelon = false;
    boolean statusMangga = false;
    boolean statusApel = false;
    boolean statusPisang = false;
    boolean statusSemangka = false;
    int mangga, melon, pisang, semangka, apel;
    int uang, jml, kualitas = 1, legend;
    AudioInputStream audio;
    Clip clip;

    public kedaibuah(String username) throws SQLException {
        kedai1 = true;
        this.username = username;
        vkedai1 = new inkedaibuah1();
        //       mplayer = new player();
        molah = new molah();
        maset = new maset();
        mbelibuah = new mpembelian();
        uang = vkedai1.setUang(maset.getUang(username));

        setJmlBuah();
        jml = vkedai1.getTeksJumlah();
        vkedai1.setVisible(true);
        vkedai1.klikKembali(new acttombolkembali());
        vkedai1.btnApel(new acttombolApel());
        vkedai1.btnMangga(new acttombolMangga());
        vkedai1.btnMelon(new acttombolMelon());
        vkedai1.btnPisang(new acttombolPisang());
        vkedai1.btnSemangka(new acttombolSemangka());
        vkedai1.tombolKanan(new acttombolKanan());
        vkedai1.tombolKiri(new acttombolKiri());
        vkedai1.tombolMin(new acttombolMin());
        vkedai1.tombolTambah(new acttombolTambah());
        vkedai1.tombolBeli(new acttombolBeli());
        vkedai1.tombolBatal(new acttombolBatal());

    }

    public kedaibuah(String username, inkedaibuah2 v) throws SQLException {
        kedai2 = true;
        this.username = username;
        maset = new maset();
        mbelibuah = new mpembelian();
        this.vkedai2 = v;
        molah = new molah();

        uang = v.setUang(maset.getUang(username));
        jml = v.getTeksJumlah();
        setJmlBuah();

        v.setVisible(true);
        v.klikKembali(new acttombolkembali());
        v.btnApel(new acttombolApel());
        v.btnMangga(new acttombolMangga());
        v.btnMelon(new acttombolMelon());
        v.btnPisang(new acttombolPisang());
        v.btnSemangka(new acttombolSemangka());
        v.tombolKanan(new acttombolKanan());
        v.tombolKiri(new acttombolKiri());
        v.tombolMin(new acttombolMin());
        v.tombolTambah(new acttombolTambah());
        v.tombolBeli(new acttombolBeli());
        v.tombolBatal(new acttombolBatal());

    }

    public void setJmlBuah() throws SQLException {
        getJmlBuah();
        if (kedai1) {
            vkedai1.setJmlBuah(mangga, semangka, melon, apel, pisang);
        } else if (kedai2) {
            vkedai2.setJmlBuah(mangga, semangka, melon, apel, pisang);
        }
    }

    public void getJmlBuah() throws SQLException {
        apel = maset.getJmlBuahAll(username, 1);
        mangga = maset.getJmlBuahAll(username, 3);
        melon = maset.getJmlBuahAll(username, 5);
        pisang = maset.getJmlBuahAll(username, 2);
        semangka = maset.getJmlBuahAll(username, 4);
    }

    private void cekPenghargaanManiakMelon() throws SQLException {
        int buah = mbelibuah.getBuah(username, 5);
        if (mme1) {
            if (buah >= 25) {
                maset.updatePenghargaan(username, "maniakmelon", 1);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MELON rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MELON rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (mme2) {
            if (buah >= 50) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "maniakmelon", 2);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MELON rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MELON rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (mme3) {
            if (buah >= 100) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "maniakmelon", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);

                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MELON rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MELON rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
    }

    private void cekPenghargaanManiakMangga() throws SQLException {
        int buah = mbelibuah.getBuah(username, 3);
        if (mma1) {
            if (buah >= 25) {
                maset.updatePenghargaan(username, "maniakmangga", 1);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MANGGA rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MANGGA rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (mma2) {
            if (buah >= 50) {
                maset.updatePenghargaan(username, "maniakmangga", 2);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MANGGA rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MANGGA rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (mma3) {
            if (buah >= 100) {
                maset.updatePenghargaan(username, "maniakmangga", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK MANGGA rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK MANGGA rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
    }

    private void cekPenghargaanManiakApel() throws SQLException {
        int buah = mbelibuah.getBuah(username, 1);
        if (ma1) {
            if (buah >= 25) {
                maset.updatePenghargaan(username, "maniakapel", 1);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK APEL rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK APEL rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (ma2) {
            if (buah >= 50) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "maniakapel", 2);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK APEL rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK APEL rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
        if (ma3) {
            if (buah >= 100) {
                System.out.println("yhaaaaaaaaa");
                maset.updatePenghargaan(username, "maniakapel", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                if (kedai1) {
                    vkedai1.tampilPesan(vkedai1, "MANIAK APEL rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                } else if (kedai2) {
                    vkedai2.tampilPesan(vkedai2, "MANIAK APEL rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
                }
            }
        }
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pasarmap v = new pasarmap();
                pasarc c = new pasarc(username);
                if (kedai1) {
                    kedai1 = false;
                    vkedai1.dispose();
                } else if (kedai2) {
                    kedai2 = false;
                    vkedai2.dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusMelon = true; //untuk pengecekan di tombol belinya nanti
            if (kedai1) {
                try {
                    String id = "151";
                    vkedai1.setTeksJumlah("1");
                    vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(id)));
                    vkedai1.setTeksKualitas("Baik");
                    vkedai1.popup().setVisible(true);
                    vkedai1.disable();
                    vkedai1.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
                    vkedai1.min.setVisible(false);
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kedai2) {
                try {
                    System.out.println("melon kedai 2");
                    String id2 = "251";
                    vkedai2.setTeksJumlah("1");
                    vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(id2)));
                    vkedai2.setTeksKualitas("Baik");
                    vkedai2.popup().setVisible(true);
                    vkedai2.disable();
                    vkedai2.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
                    vkedai2.min.setVisible(false);
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    private class acttombolPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusPisang = true; //untuk pengecekan di tombol belinya nanti
            if (kedai1) {
                try {
                    String id = "1P1";
                    vkedai1.setTeksJumlah("1");
                    vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(id)));
                    vkedai1.setTeksKualitas("Baik");
                    vkedai1.popup().setVisible(true);
                    vkedai1.disable();
                    vkedai1.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
                    vkedai1.min.setVisible(false);
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kedai2) {
                try {
                    System.out.println("pisang kedai 2");
                    String id2 = "2P1";
                    vkedai2.setTeksJumlah("1");
                    vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(id2)));
                    vkedai2.setTeksKualitas("Baik");
                    vkedai2.popup().setVisible(true);
                    vkedai2.disable();
                    vkedai2.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
                    vkedai2.min.setVisible(false);
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class acttombolApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusApel = true; //untuk pengecekan di tombol belinya nanti
            if (kedai1) {
                try {
                    System.out.println("Apel kedai 1");
                    String id = "1A1";
                    vkedai1.setTeksJumlah("1");
                    vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(id)));
                    vkedai1.setTeksKualitas("Baik");
                    vkedai1.popup().setVisible(true);
                    vkedai1.disable();
                    vkedai1.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.rightbutton.setVisible(true);
                    vkedai1.min.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kedai2) {
                try {
                    System.out.println("Apel kedai 2");
                    String id2 = "2A1";
                    vkedai2.setTeksJumlah("1");
                    vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(id2)));
                    vkedai2.setTeksKualitas("Baik");
                    vkedai2.popup().setVisible(true);
                    vkedai2.disable();
                    vkedai2.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
                    vkedai2.min.setVisible(false);
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class acttombolMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusMangga = true; //untuk pengecekan di tombol belinya nanti
            if (kedai1) {
                try {
                    String id = "131";
                    vkedai1.setTeksJumlah("1");
                    vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(id)));
                    vkedai1.setTeksKualitas("Baik");
                    vkedai1.popup().setVisible(true);
                    vkedai1.disable();
                    vkedai1.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.rightbutton.setVisible(true);
                    vkedai1.min.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kedai2) {
                try {
                    System.out.println("Mangga  kedai 2");
                    String id2 = "231";
                    vkedai2.setTeksJumlah("1");
                    vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(id2)));
                    vkedai2.setTeksKualitas("Baik");
                    vkedai2.popup().setVisible(true);
                    vkedai2.disable();
                    vkedai2.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
                    vkedai2.min.setVisible(false);
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class acttombolSemangka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            statusSemangka = true; //untuk pengecekan di tombol belinya nanti
            if (kedai1) {
                try {
                    System.out.println("semangka kedai 1");
                    String id = "1S1";
                    vkedai1.setTeksJumlah("1");
                    vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(id)));
                    vkedai1.setTeksKualitas("Baik");
                    vkedai1.popup().setVisible(true);
                    vkedai1.disable();
                    vkedai1.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
                    vkedai1.min.setVisible(false);
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kedai2) {
                try {
                    System.out.println("semangka kedai 2");
                    String id2 = "2S1";
                    vkedai2.setTeksJumlah("1");
                    vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(id2)));
                    vkedai2.setTeksKualitas("Baik");
                    vkedai2.popup().setVisible(true);
                    vkedai2.disable();
                    vkedai2.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
                    vkedai2.min.setVisible(false);
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.rightbutton.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void cekStatusPenghargaan() throws SQLException {
        mma1 = maset.cekAchv(username, "maniakmangga", 0);
        mma2 = maset.cekAchv(username, "maniakmangga", 1);
        mma3 = maset.cekAchv(username, "maniakmangga", 2);
        mme3 = maset.cekAchv(username, "maniakmelon", 2);
        mme2 = maset.cekAchv(username, "maniakmelon", 1);
        mme1 = maset.cekAchv(username, "maniakmelon", 0);
        ma1 = maset.cekAchv(username, "maniakapel", 0);
        ma2 = maset.cekAchv(username, "maniakapel", 1);
        ma3 = maset.cekAchv(username, "maniakapel", 2);
        legend = maset.getStatusLegend(username);
    }

    private void semangkaAction() throws SQLException {
        int id = 4;
        if (kedai1) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai1.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai1.getTeksHarga();
            jml = vkedai1.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    uang = uang - (harga * jml);
                    semangka = semangka + jml;
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai1.tampilPesan(vkedai1.popup(), "Transaksi Berhasil");
                    vkedai1.setUang(maset.getUang(username));
                    vkedai1.setJmlSemangka(semangka);
                    System.out.println("kedai1" + semangka);
                    vkedai1.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai1.setTeksJumlah(jml + "");
                    vkedai1.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai1.tampilPesan(vkedai1, "Uang anda tidak cukup!");
                vkedai1.popup().setAlwaysOnTop(true);

            }
        } else if (kedai2) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai2.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai2.getTeksHarga();
            jml = vkedai2.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    uang = uang - (harga * jml);
                    semangka = semangka + jml;
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai2.tampilPesan(vkedai2.popup(), "Transaksi Berhasil");
                    vkedai2.setUang(maset.getUang(username));
                    vkedai2.setJmlSemangka(semangka);
                    vkedai2.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai2.setTeksJumlah(jml + "");
                    vkedai2.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai2.tampilPesan(vkedai2, "Uang anda tidak cukup!");
                vkedai2.popup().setAlwaysOnTop(true);
            }
        }
    }

    private void melonAction() throws SQLException {
        int id = 5;
        if (kedai1) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai1.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai1.getTeksHarga();
            jml = vkedai1.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    uang = uang - (harga * jml);
                    melon = melon + jml;
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai1.tampilPesan(vkedai1.popup(), "Transaksi Berhasil");
                    vkedai1.setUang(maset.getUang(username));
                    vkedai1.setJmlMelon(melon);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakMelon();
                    vkedai1.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai1.setTeksJumlah(jml + "");
                    vkedai1.popup().setAlwaysOnTop(true);;
                }
            } else {
                vkedai1.tampilPesan(vkedai1, "Uang anda tidak cukup!");
                vkedai1.popup().setAlwaysOnTop(true);
            }
        } else if (kedai2) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai2.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai2.getTeksHarga();
            jml = vkedai2.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    melon = melon + jml;
                    uang = uang - (harga * jml);
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai2.tampilPesan(vkedai2.popup(), "Transaksi Berhasil");
                    vkedai2.setUang(maset.getUang(username));
                    vkedai2.setJmlMelon(melon);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakMelon();
                    vkedai2.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai2.setTeksJumlah(jml + "");
                    vkedai2.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai2.tampilPesan(vkedai2, "Uang anda tidak cukup!");
                vkedai2.popup().setAlwaysOnTop(true);
            }
        }
    }

    private void manggaAction() throws SQLException {
        int id = 3;
        if (kedai1) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai1.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai1.getTeksHarga();
            jml = vkedai1.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    mangga = mangga + jml;
                    uang = uang - (harga * jml);
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai1.tampilPesan(vkedai1.popup(), "Transaksi Berhasil");
                    vkedai1.setUang(maset.getUang(username));
                    vkedai1.setJmlMangga(mangga);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakMangga();
                    vkedai1.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai1.setTeksJumlah(jml + "");
                    vkedai1.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai1.tampilPesan(vkedai1, "Uang anda tidak cukup!");
                vkedai1.popup().setAlwaysOnTop(true);
            }
        } else if (kedai2) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai2.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai2.getTeksHarga();
            jml = vkedai2.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    mangga = mangga + jml;
                    uang = uang - (harga * jml);
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai2.tampilPesan(vkedai2.popup(), "Transaksi Berhasil");
                    vkedai2.setUang(maset.getUang(username));
                    vkedai2.setJmlMangga(mangga);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakMangga();
                    vkedai2.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai2.setTeksJumlah(jml + "");
                    vkedai2.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai2.tampilPesan(vkedai2, "Uang anda tidak cukup!");
                vkedai2.popup().setAlwaysOnTop(true);
            }
        }
    }

    private void apelAction() throws SQLException {
        int id = 1;
        if (kedai1) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai1.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai1.getTeksHarga();
            jml = vkedai1.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    apel = apel + jml;
                    uang = uang - (harga * jml);
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai1.tampilPesan(vkedai1.popup(), "Transaksi Berhasil");
                    vkedai1.setUang(maset.getUang(username));
                    vkedai1.setJmlApel(apel);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakApel();
                    vkedai1.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai1.setTeksJumlah(jml + "");
                    vkedai1.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai1.tampilPesan(vkedai1.popup(), "Uang anda tidak cukup!");
                vkedai1.popup().setAlwaysOnTop(true);
            }
        } else if (kedai2) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai2.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai2.getTeksHarga();
            jml = vkedai2.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    apel = apel + jml;
                    uang = uang - (harga * jml);
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai2.tampilPesan(vkedai2.popup(), "Transaksi Berhasil");
                    vkedai2.setUang(maset.getUang(username));
                    vkedai2.setJmlApel(apel);
                    mbelibuah.beliBuah(id, username, jml);
                    cekStatusPenghargaan();
                    cekPenghargaanManiakApel();
                    vkedai2.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai2.setTeksJumlah(jml + "");
                    vkedai2.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai2.tampilPesan(vkedai2, "Uang anda tidak cukup!");
                vkedai2.popup().setAlwaysOnTop(true);
            }
        }
    }

    private void pisangAction() throws SQLException {
        int id = 2;
        if (kedai1) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai1.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai1.getTeksHarga();
            jml = vkedai1.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    uang = uang - (harga * jml);
                    pisang = pisang + jml;
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai1.tampilPesan(vkedai1.popup(), "Transaksi Berhasil");
                    vkedai1.setUang(maset.getUang(username));
                    vkedai1.setJmlPisang(pisang);
                    vkedai1.popup().dispose();
                } else {
                    jml = 1;
                    vkedai1.setTeksJumlah(jml + "");
                    vkedai1.popup().setAlwaysOnTop(true);
                }
            } else {
                vkedai1.tampilPesan(vkedai1, "Uang anda tidak cukup!");
                vkedai1.popup().setAlwaysOnTop(true);
            }
        } else if (kedai2) {
            int idKualitas = mbelibuah.getIdKualitas(vkedai2.getTeksKualitas());
            int jmlbuah = maset.getJmlBuah(username, id, idKualitas);
            int harga = vkedai2.getTeksHarga();
            jml = vkedai2.getTeksJumlah();
            int tot = jml * harga;
            if (uang > (tot)) {
                int Pilih = JOptionPane.showConfirmDialog(null, "Total: " + tot
                        + "\nAnda jadi membeli?", "Konfirmasi Pembelian", JOptionPane.YES_NO_OPTION);
                if (Pilih == 0) {
                    uang = uang - (harga * jml);
                    pisang = pisang + jml;
                    maset.updateUang(uang, username);
                    mbelibuah.tambahPembelianBuah((jmlbuah + jml), id,
                            idKualitas, username);
                    vkedai2.tampilPesan(vkedai2, "Transaksi Berhasil");
                    vkedai2.setUang(maset.getUang(username));
                    vkedai2.setJmlPisang(pisang);
                    vkedai2.popup().setVisible(false);
                } else {
                    jml = 1;
                    vkedai2.setTeksJumlah(jml + "");
                    vkedai2.popup().setVisible(true);
                }
            } else {
                vkedai2.tampilPesan(vkedai2.popup(), "Uang anda tidak cukup!");

            }
        }
    }

    private class acttombolMin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (kedai1) {
                if (jml <= 2) {
                    vkedai1.min.setVisible(false);
                }
                int jmlbaru = vkedai1.getTeksJumlah();
                jml = jmlbaru - 1;
                vkedai1.setTeksJumlah(jml + "");
            } else if (kedai2) {
                if (jml <= 2) {
                    vkedai2.min.setVisible(false);
                }
                int jmlbaru = vkedai2.getTeksJumlah();
                jml = jmlbaru - 1;
                vkedai2.setTeksJumlah(jml + "");
            }
        }
    }

    private class acttombolTambah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (kedai1) {
                vkedai1.min.setVisible(true);
                int jmlbaru = vkedai1.getTeksJumlah();
                jml = jmlbaru + 1;
                vkedai1.setTeksJumlah(jml + "");
            } else if (kedai2) {
                vkedai2.min.setVisible(true);
                int jmlbaru = vkedai2.getTeksJumlah();
                jml = jmlbaru + 1;
                vkedai2.setTeksJumlah(jml + "");
            }
        }
    }

    private class acttombolKanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (kedai1) {
                vkedai1.leftbutton.setVisible(true);
            } else if (kedai2) {
                vkedai2.leftbutton.setVisible(true);
            }
            kualitas = kualitas + 1;
            if (kualitas == 2) {
                if (kedai1) {
                    vkedai1.setTeksKualitas("Sedang");
                } else if (kedai2) {
                    vkedai2.setTeksKualitas("Sedang");
                }
                if (statusSemangka) {
                    try {
                        if (kedai1) {
                            String ids = "1S2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        } else if (kedai2) {
                            String ids = "2S2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMelon) {
                    try {
                        if (kedai1) {
                            String idme = "152";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        } else if (kedai2) {
                            String idme = "252";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMangga) {
                    try {
                        if (kedai1) {
                            String idma = "132";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        } else if (kedai2) {
                            String idma = "232";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusApel) {
                    try {
                        if (kedai1) {
                            String ida = "1A2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        } else if (kedai2) {
                            String ida = "2A2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusPisang) {
                    try {
                        if (kedai1) {
                            String idp = "1P2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        } else if (kedai2) {
                            String idp = "2P2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (kualitas == 3) {
                if (kedai1) {
                    vkedai1.rightbutton.setVisible(false);
                    vkedai1.setTeksKualitas("Rendah");
                } else if (kedai2) {
                    vkedai2.rightbutton.setVisible(false);
                    vkedai2.setTeksKualitas("Rendah");
                }
                if (statusSemangka) {
                    try {
                        if (kedai1) {
                            String ids = "1S3";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        } else if (kedai2) {
                            String ids = "2S3";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMelon) {
                    try {
                        if (kedai1) {
                            String idme = "153";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        } else if (kedai2) {
                            String idme = "253";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMangga) {
                    try {
                        if (kedai1) {
                            String idma = "133";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        } else if (kedai2) {
                            String idma = "233";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusApel) {
                    try {
                        if (kedai1) {
                            String ida = "1A3";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        } else if (kedai2) {
                            String ida = "2A3";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusPisang) {
                    try {
                        if (kedai1) {
                            String idp = "1P3";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        } else if (kedai2) {
                            String idp = "2P3";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("kanan " + kualitas);
        }
    }

    private class acttombolKiri implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (kedai1) {
                vkedai1.rightbutton.setVisible(true);
            } else if (kedai2) {
                vkedai2.rightbutton.setVisible(true);
            }
            kualitas = kualitas - 1;
            if (kualitas == 1) {
                if (kedai1) {
                    vkedai1.leftbutton.setVisible(false);
                    vkedai1.setTeksKualitas("Baik");
                } else if (kedai2) {
                    vkedai2.leftbutton.setVisible(false);
                    vkedai2.setTeksKualitas("Baik");
                }
                if (statusSemangka) {
                    try {
                        if (kedai1) {
                            String ids = "1S1";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        } else if (kedai2) {
                            String ids = "2S1";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMelon) {
                    try {
                        if (kedai1) {
                            String idme = "151";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        } else if (kedai2) {
                            String idme = "251";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMangga) {
                    try {
                        if (kedai1) {
                            String idma = "131";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        } else if (kedai2) {
                            String idma = "231";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusApel) {
                    try {
                        if (kedai1) {
                            String ida = "1A1";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        } else if (kedai2) {
                            String ida = "2A1";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusPisang) {
                    try {
                        if (kedai1) {
                            String idp = "1P1";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        } else if (kedai2) {
                            String idp = "2P1";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (kualitas == 2) {
                if (kedai1) {
                    vkedai1.setTeksKualitas("Sedang");
                } else if (kedai2) {
                    vkedai2.setTeksKualitas("Sedang");
                }
                if (statusSemangka) {
                    try {
                        if (kedai1) {
                            String ids = "1S2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        } else if (kedai2) {
                            String ids = "2S2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ids)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMelon) {
                    try {
                        if (kedai1) {
                            String idme = "152";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        } else if (kedai2) {
                            String idme = "252";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idme)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusMangga) {
                    try {
                        if (kedai1) {
                            String idma = "132";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        } else if (kedai2) {
                            String idma = "232";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idma)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusApel) {
                    try {
                        if (kedai1) {
                            String ida = "1A2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        } else if (kedai2) {
                            String ida = "2A2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(ida)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (statusPisang) {
                    try {
                        if (kedai1) {
                            String idp = "1P2";
                            vkedai1.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        } else if (kedai2) {
                            String idp = "2P2";
                            vkedai2.setTeksHarga(String.valueOf(mbelibuah.getHarga(idp)));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println(kualitas + " kiri");
        }
    }

    private class acttombolBeli implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                audio = AudioSystem.getAudioInputStream(new File("src//ui export//Coin achieve.wav"));
                clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
            } catch (Exception ex) {
                Logger.getLogger(supermarketc.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statusSemangka) {
                try {
                    semangkaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (statusMelon) {
                try {
                    melonAction();
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (statusMangga) {
                try {
                    manggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (statusApel) {
                try {
                    apelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (statusPisang) {
                try {
                    pisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(kedaibuah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (kedai1) {
                vkedai1.setVisible(true);
                vkedai1.enable();
                vkedai1.setTeksJumlah(jml + "");
            } else if (kedai2) {
                vkedai2.setVisible(true);
                vkedai2.enable();
                vkedai2.setTeksJumlah(jml + "");
            }
            statusMelon = false;
            statusMangga = false;
            statusApel = false;
            statusPisang = false;
            statusSemangka = false;
            kualitas = 1;
            jml = 1;
        }
    }

    private class acttombolBatal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (kedai1) {
                vkedai1.enable();
                vkedai1.setVisible(true);
                vkedai1.setTeksJumlah(jml + "");
                vkedai1.popup().dispose();
            } else if (kedai2) {
                vkedai2.enable();
                vkedai2.setVisible(true);
                vkedai2.setTeksJumlah(jml + "");
                vkedai2.popup().dispose();
            }
            statusMelon = false;
            statusMangga = false;
            statusApel = false;
            statusPisang = false;
            statusSemangka = false;
            kualitas = 1;
            jml = 1;
        }
    }
}
