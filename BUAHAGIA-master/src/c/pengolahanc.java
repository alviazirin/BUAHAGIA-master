/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import m.maset;
import m.mpembelian;
import m.molah;
import v.inpengolahan;
import v.map;

/**
 *
 * @author Farisya
 */
public class pengolahanc {

    String username;
    maset maset;
    inpengolahan vpengolahan;
    mpembelian mbeli;
    molah molah;
    int kualitas = 1;
    int jml = 1, jmlproduk = 1, legend;
    int apel, pisang, melon, semangka, mangga;
    int susu, minyak, gula, mayo, mentega, sirup, tepungt, tepungb, pengembang, telur;
    boolean jus, brownis, salepisang, salad, es, kripikm, kripika, kripikp;
    boolean stjusmelon = false, stjusmangga = false, stjusapel = false, stjussemangka = false, stjuspisang = false;
    boolean stkripikapel = false, stkripikpisang = false, stkripikmangga = false;
    boolean stbrownismelon = false, stbrownisapel = false, stbrownismangga = false, stbrownispisang = false, stbrownissemangka = false;
    boolean stesbuah = false, stsaladbuah = false, stsale = false;
    int jusmelon, jusmangga, jusapel, juspisang, jussemangka, kripikapel, kripikpisang, kripikmangga;
    int brownismelon, brownisapel, brownismangga, brownispisang, brownissemangka, esbuah, saladbuah, sale;
    boolean tb1, tb2, tb3, rr1, rr2, rr3, k1, k2, k3;

    public pengolahanc(String username) throws SQLException {
        this.username = username;
        this.vpengolahan = new inpengolahan();
        this.maset = new maset();
        this.molah = new molah();
        vpengolahan.setVisible(true);

        vpengolahan.klikKembali(new acttombolkembali());
        vpengolahan.klikNext(new acttombolnext());
        vpengolahan.klikPrevious(new acttombolprevious());
        vpengolahan.klikBatal(new acttombolbatal());
        vpengolahan.klikKanan(new acttombolKanan());
        vpengolahan.klikKiri(new acttombolKiri());
        vpengolahan.klikOlah(new acttombolOlah());

        vpengolahan.klikJusMelon(new acttombolJusMelon());
        vpengolahan.klikJusApel(new acttombolJusApel());
        vpengolahan.klikJusMangga(new acttombolJusMangga());
        vpengolahan.klikJusSemangka(new acttombolJusSemangka());
        vpengolahan.klikJusPisang(new acttombolJusPisang());
        vpengolahan.klikBrownisApel(new acttombolBrownisApel());
        vpengolahan.klikBrownisMangga(new acttombolBrownisMangga());
        vpengolahan.klikBrownisMelon(new acttombolBrownisMelon());
        vpengolahan.klikBrownisPisang(new acttombolBrownisPisang());
        vpengolahan.klikBrownisSemangka(new acttombolBrownisSemangka());
        vpengolahan.klikKripikApel(new acttombolKripikApel());
        vpengolahan.klikKripikMangga(new acttombolKripikMangga());
        vpengolahan.klikKripikPisang(new acttombolKripikPisang());
        vpengolahan.klikEsBuah(new acttombolEsbuah());
        vpengolahan.klikSaladBuah(new acttombolSaladBuah());
        vpengolahan.klikSalePisang(new acttombolSalePisang());

        vpengolahan.klikBeliSaladBuah(new acttombolBeliSalad());
        vpengolahan.klikBeliKripikPisang(new acttombolBeliKripikPisang());
        vpengolahan.klikBeliEsBuah(new acttombolBeliEsBuah());
        vpengolahan.klikBeliKripikApel(new acttombolBeliKripikApel());
        vpengolahan.klikBeliKripikMangga(new acttombolBeliKripikMangga());
        
        setJmlBuah();
        setJmlBahan();
        cekkomposisi();
    }

    public void setJmlBahan() throws SQLException {
        getJmlBahan();
        vpengolahan.setJmlBahan(gula, minyak, mayo, mentega, sirup, telur, tepungt, tepungb, pengembang, susu);

    }

    public void setJmlBuah() throws SQLException {
        getJmlBuah();
        vpengolahan.setJmlBuah(mangga, apel, melon, semangka, pisang);
    }

    public void getJmlBuah() throws SQLException {
        apel = maset.getJmlBuahAll(username, 1);
        mangga = maset.getJmlBuahAll(username, 3);
        melon = maset.getJmlBuahAll(username, 5);
        pisang = maset.getJmlBuahAll(username, 2);
        semangka = maset.getJmlBuahAll(username, 4);
    }

    public void getJmlBahan() throws SQLException {
        gula = maset.getJmlBahan(username, 1);
        tepungb = maset.getJmlBahan(username, 2);
        tepungt = maset.getJmlBahan(username, 10);
        pengembang = maset.getJmlBahan(username, 9);
        susu = maset.getJmlBahan(username, 8);
        telur = maset.getJmlBahan(username, 7);
        mentega = maset.getJmlBahan(username, 4);
        mayo = maset.getJmlBahan(username, 6);
        sirup = maset.getJmlBahan(username, 5);
        minyak = maset.getJmlBahan(username, 3);

    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                map v = new map();
                mapc c = new mapc(username);
                vpengolahan.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolnext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.setVisible(false);
            vpengolahan.nextpengolahan().setVisible(true);
        }
    }

    private class acttombolprevious implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.setVisible(true);
            vpengolahan.nextpengolahan().setVisible(false);
        }
    }

    public void getResep() throws SQLException {

        kripikm = maset.cekResep(username, "kripikmangga");
        kripika = maset.cekResep(username, "kripikapel");
        kripikp = maset.cekResep(username, "kripikpisang");
        es = maset.cekResep(username, "esbuah");
        salad = maset.cekResep(username, "salad");
        salepisang = maset.cekResep(username, "sale");
    }

    public void cekStatusPenghargaan() throws SQLException {
        k1 = maset.cekAchv(username, "kriuk", 0);
        k2 = maset.cekAchv(username, "kriuk", 1);
        k3 = maset.cekAchv(username, "kriuk", 2);
        tb3 = maset.cekAchv(username, "tukangblender", 2);
        tb2 = maset.cekAchv(username, "tukangblender", 1);
        tb1 = maset.cekAchv(username, "tukangblender", 0);
        rr1 = maset.cekAchv(username, "ramerasanya", 0);
        rr2 = maset.cekAchv(username, "ramerasanya", 1);
        rr3 = maset.cekAchv(username, "ramerasanya", 2);
        legend = maset.getStatusLegend(username);
    }

    private void cekPenghargaanKriuk() throws SQLException {
        int produk = molah.getProduk(username, 6, 7, 8, 0, 0); //gausa masuk sequence
        if (k1) {
            if (produk >= 60) {
                maset.updatePenghargaan(username, "kriuk", 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "KRIUK rank 3!!\nAnda berhasil mendapatkan penghargaan ini!\n"
                        + "Resep kripik lainnya telah terbuka!");
                if (kripikp) {
                    maset.insertResep(username, "kripikmangga");
                    maset.insertResep(username, "kripikapel");
                } else if (kripikm) {
                    maset.insertResep(username, "kripikpisang");
                    maset.insertResep(username, "kripikapel");
                } else if (kripika) {
                    maset.insertResep(username, "kripikmangga");
                    maset.insertResep(username, "kripikpisang");
                }
            }
        }
        if (k2) {
            if (produk >= 120) {
                maset.updatePenghargaan(username, "kriuk", 2);
                vpengolahan.tampilPesan(vpengolahan.popup(), "KRIUK rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (k3) {
            if (produk >= 360) {
                maset.updatePenghargaan(username, "kriuk", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "KRIUK rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
    }

    public void cekPenghargaanRameRasanya() throws SQLException {
        int produk = molah.getProduk(username, 16, 0, 0, 0, 0); //gausa masuk sequence
        if (rr1) {
            if (produk >= 250) {
                maset.updatePenghargaan(username, "ramerasanya", 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "RAME RASANYA rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (rr2) {
            if (produk >= 500) {
                maset.updatePenghargaan(username, "ramerasanya", 2);
                vpengolahan.tampilPesan(vpengolahan.popup(), "RAME RASANYA rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (rr3) {
            if (produk >= 1000) {
                maset.updatePenghargaan(username, "ramerasanya", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "RAME RASANYA rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
    }

    public void cekPenghargaanTukangBlender() throws SQLException {
        int produk = molah.getProduk(username, 1, 2, 3, 4, 5); //gausa masuk sequence
        if (tb1) {
            if (produk >= 250) {
                maset.updatePenghargaan(username, "tukangblender", 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "TUKANG BLENDER rank 3!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (tb2) {
            if (produk >= 500) {
                maset.updatePenghargaan(username, "tukangblender", 2);
                vpengolahan.tampilPesan(vpengolahan.popup(), "TUKANG BLENDER rank 2!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
        if (tb3) {
            if (produk >= 1000) {
                maset.updatePenghargaan(username, "tukangblender", 3);
                maset.updatePenghargaan(username, "legend", legend + 1);
                vpengolahan.tampilPesan(vpengolahan.popup(), "TUKANG BLENDER rank 1!!\nAnda berhasil mendapatkan penghargaan ini!");
            }
        }
    }

    public void cekResep() throws SQLException {
        getResep();
        if (kripika) {
            vpengolahan.btnkripikapel.setVisible(true);
            vpengolahan.belikripikapel.setVisible(false);
        } else {
            vpengolahan.btnkripikapel.setVisible(false);
            if (kripikm || kripikp) {
                vpengolahan.belikripikapel.setVisible(false);
            }
        }
        if (kripikm) {
            vpengolahan.btnkripikmangga.setVisible(true);
            vpengolahan.belikripikmangga.setVisible(false);
        } else {
            vpengolahan.btnkripikmangga.setVisible(false);
            if (kripikp || kripika) {
                vpengolahan.belikripikmangga.setVisible(false);
            }
        }
        if (kripikp) {
            vpengolahan.btnkripikpisang.setVisible(true);
            vpengolahan.belikripikpisang.setVisible(false);
        } else {
            vpengolahan.btnkripikpisang.setVisible(false);
            if (kripikp || kripika) {
                vpengolahan.belikripikpisang.setVisible(false);
            }
        }
        if (salad) {
            vpengolahan.btnsaladbuah.setVisible(true);
            vpengolahan.beliresepsalad.setVisible(false);
        } else {
            vpengolahan.btnsaladbuah.setVisible(false);
        }
        if (es) {
            vpengolahan.btnesbuah.setVisible(true);
            vpengolahan.beliresepes.setVisible(false);
        } else {
            vpengolahan.btnesbuah.setVisible(false);
        }
        if (salepisang) {
            vpengolahan.btnsalepisang.setVisible(true);
            vpengolahan.beliresepsale.setVisible(false);
        } else {
            vpengolahan.btnsalepisang.setVisible(false);
        }
    }

    public void cekkomposisi() throws SQLException {
        cekResep();
        System.out.println("salad" + salad);
        if (melon < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownismelon.setEnabled(false);
        } else if (melon >= 1 && gula >= 30 && mentega >= 6 && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownismelon.setEnabled(true);
        }
        if (semangka < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownissemangka.setEnabled(false);
        } else if (semangka >= 1 && gula >= 30 && mentega >= 6 && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownissemangka.setEnabled(true);
        }
        if (pisang < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownispisang.setEnabled(false);
        } else if (pisang >= 1 && gula >= 30 && mentega >= 6 && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownispisang.setEnabled(true);
        }
        if (apel < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownisapel.setEnabled(false);
        } else if (apel >= 1 && gula >= 30 && mentega >= 6 && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownisapel.setEnabled(true);
        }
        if (mangga < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownismangga.setEnabled(false);
        } else if (mangga >= 1 && gula >= 30 && mentega >= 6 && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownismangga.setEnabled(true);
        }
        if (melon < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusmelon.setEnabled(false);
        } else if (melon >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusmelon.setEnabled(true);
        }
        if (pisang < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjuspisang.setEnabled(false);
        } else if (pisang >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjuspisang.setEnabled(true);
        }
        if (semangka < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjussemangka.setEnabled(false);
        } else if (semangka >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjussemangka.setEnabled(true);
        }
        if (apel < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusapel.setEnabled(false);
        } else if (apel >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusapel.setEnabled(true);
        }
        if (mangga < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusmangga.setEnabled(false);
        } else if (mangga >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusmangga.setEnabled(true);
        }
        if (apel < 1 || minyak < 3 || gula < 10) {
            vpengolahan.btnkripikapel.setEnabled(false);
        } else if (apel >= 1 && minyak >= 1 && gula >= 10) {
            vpengolahan.btnkripikapel.setEnabled(true);
        }
        if (pisang < 1 || minyak < 3 || gula < 10) {
            vpengolahan.btnkripikpisang.setEnabled(false);
        } else if (pisang >= 1 && minyak >= 1 && gula >= 10) {
            vpengolahan.btnkripikpisang.setEnabled(true);
        }
        if (mangga < 1 || minyak < 3 || gula < 10) {
            vpengolahan.btnkripikmangga.setEnabled(false);
        } else if (mangga >= 1 && minyak >= 1 && gula >= 10) {
            vpengolahan.btnkripikmangga.setEnabled(true);
        }
        if (pisang < 1 || minyak < 5 || mentega < 1 || tepungb < 1 || tepungt < 12 || gula < 25) {
            vpengolahan.btnsalepisang.setEnabled(false);
        } else if (pisang >= 1 && minyak >= 5 && mentega >= 1 && tepungb >= 1 && tepungt >= 12 && gula >= 25) {
            vpengolahan.btnsalepisang.setEnabled(true);
        }
        if (apel < 1 || melon < 1 || mangga < 1 || semangka < 1 || susu < 25 || mayo < 13) {
            vpengolahan.btnsaladbuah.setEnabled(false);
        } else if (apel >= 1 && melon >= 1 && mangga >= 1 && semangka >= 1 && susu >= 25 && mayo >= 13) {
            vpengolahan.btnsaladbuah.setEnabled(true);
        }
        if (apel < 1 || melon < 1 || mangga < 1 || semangka < 1 || sirup < 1) {
            vpengolahan.btnesbuah.setEnabled(false);
        } else if (apel >= 1 && melon >= 1 && mangga >= 1 && semangka >= 1 && sirup >= 1) {
            vpengolahan.btnesbuah.setEnabled(true);

        }
    }

    private class acttombolBeliSalad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 500000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 500000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "salad");
                        cekResep();
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolBeliSale implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 350000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 350000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "sale");
                        cekResep();
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolBeliEsBuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 500000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 500000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "esbuah");
                        cekResep();
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolBeliKripikPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 350000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 350000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "kripikpisang");
                        cekResep();
                        // vpengolahan.belikripikapel.setVisible(false);
                        // vpengolahan.belikripikmangga.setVisible(false);
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolBeliKripikMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 350000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 350000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "kripikmangga");
                        cekResep();
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolBeliKripikApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int uang = maset.getUang(username);
                if (uang >= 350000) {
                    int pilih = JOptionPane.showConfirmDialog(vpengolahan, "Yakin Membeli?",
                            "Konfirmasi Pembelian Resep", JOptionPane.YES_NO_OPTION);
                    if (pilih == 0) {
                        uang = uang - 350000;
                        maset.updateUang(uang, username);
                        maset.insertResep(username, "kripikapel");
                        cekResep();
                    }
                } else {
                    vpengolahan.tampilPesan(vpengolahan, "uang anda tidak cukup");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolJusMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("POP UP PENGOLAHAN");
            stjusmelon = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);

        }
    }

    private class acttombolJusMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjusmangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjusapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusSemangka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjussemangka = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjuspisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikpisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikmangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownismangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownisapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownispisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisSemangka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownissemangka = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownismelon = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolSalePisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stsale = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolSaladBuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stsaladbuah = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/saladbuah.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolEsbuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stesbuah = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/esbuah.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private void JusMelonAction() throws SQLException, InterruptedException {
        int idbuah = 5;
        int idproduk = 4;
        int jus = maset.getJus(username);
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int melonku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(username, idbuah, getIdKualitas, melonku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 5));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlMelon(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 5);
                cekStatusPenghargaan();
                cekPenghargaanTukangBlender();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 1;
        int jus = maset.getJus(username);
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int apelku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(username, idbuah, getIdKualitas, apelku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlApel(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 10);
                cekStatusPenghargaan();
                cekPenghargaanTukangBlender();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusSemangkaAction() throws SQLException, InterruptedException {
        int idbuah = 4;
        int idproduk = 5;
        int jus = maset.getJus(username);
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int semangkaku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(username, idbuah, getIdKualitas, semangkaku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlSemangka(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 4);
                cekStatusPenghargaan();
                cekPenghargaanTukangBlender();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 2;
        int jus = maset.getJus(username);
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int pisangku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(username, idbuah, getIdKualitas, pisangku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
//                vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlPisang(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 10);
                cekStatusPenghargaan();
                cekPenghargaanTukangBlender();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 3;
        int jus = maset.getJus(username);
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int manggaku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(username, idbuah, getIdKualitas, manggaku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 7));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 10);
                cekStatusPenghargaan();
                cekPenghargaanTukangBlender();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 13;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int manggaku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(username, idbuah, getIdKualitas, manggaku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 9, pengembang);
                molah.updateStokBahan(username, 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());

        }
    }

    private void BrownisMelonAction() throws SQLException, InterruptedException {
        int idbuah = 5;
        int idproduk = 11;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int melonku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(username, idbuah, getIdKualitas, melonku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 9, pengembang);
                molah.updateStokBahan(username, 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlMelon(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisSemangkaAction() throws SQLException, InterruptedException {
        int idbuah = 4;
        int idproduk = 12;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int semangkaku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(username, idbuah, getIdKualitas, semangkaku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 9, pengembang);
                molah.updateStokBahan(username, 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlSemangka(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 9;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int pisangku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(username, idbuah, getIdKualitas, pisangku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 9, pengembang);
                molah.updateStokBahan(username, 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlPisang(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 10;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int apelku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(username, idbuah, getIdKualitas, apelku);
                molah.updateStokBahan(username, 1, gula);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 9, pengembang);
                molah.updateStokBahan(username, 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlApel(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 6;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int apelku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                minyak = minyak - 3;
                gula = gula - 10;
                molah.updateStokBuah(username, idbuah, getIdKualitas, apelku);
                molah.updateStokBahan(username, 3, minyak);
                molah.updateStokBahan(username, 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlApel(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 3);
                cekStatusPenghargaan();
                cekPenghargaanKriuk();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 8;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int pisangku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                minyak = minyak - 3;
                gula = gula - 10;
                molah.updateStokBuah(username, idbuah, getIdKualitas, pisangku);
                molah.updateStokBahan(username, 3, minyak);
                molah.updateStokBahan(username, 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //   vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlPisang(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 3);
                cekStatusPenghargaan();
                cekPenghargaanKriuk();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 7;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int manggaku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                minyak = minyak - 3;
                gula = gula - 10;
                molah.updateStokBuah(username, idbuah, getIdKualitas, manggaku);
                molah.updateStokBahan(username, 3, minyak);
                molah.updateStokBahan(username, 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                molah.olahProduk(idproduk, username, 3);
                cekStatusPenghargaan();
                cekPenghargaanKriuk();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void SalePisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 14;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int pisangku = (maset.getJmlBuah(username, idbuah, getIdKualitas)) - 1;
                minyak = minyak - 5;
                mentega = mentega - 1;
                tepungb = tepungb - 1;
                tepungt = tepungt - 12;
                gula = gula - 25;
                molah.updateStokBuah(username, idbuah, getIdKualitas, pisangku);
                molah.updateStokBahan(username, 3, minyak);
                molah.updateStokBahan(username, 10, tepungt);
                molah.updateStokBahan(username, 2, tepungb);
                molah.updateStokBahan(username, 4, mentega);
                molah.updateStokBahan(username, 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlPisang(maset.getJmlBuahAll(username, idbuah));
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungB(tepungb);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void EsBuahAction() throws SQLException, InterruptedException {
        int idproduk = 15;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int kualitasapel = maset.getKualitasBuah(username, 1, getIdKualitas);
        int kualitasmangga = maset.getKualitasBuah(username, 3, getIdKualitas);
        int kualitassemangka = maset.getKualitasBuah(username, 4, getIdKualitas);
        int kualitasmelon = maset.getKualitasBuah(username, 5, getIdKualitas);
        if (kualitasapel >= 1 && kualitasmangga >= 1 && kualitassemangka >= 1 && kualitasmelon >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int melonku = (maset.getJmlBuah(username, 5, getIdKualitas)) - 1;
                int manggaku = (maset.getJmlBuah(username, 3, getIdKualitas)) - 1;
                int apelku = (maset.getJmlBuah(username, 1, getIdKualitas)) - 1;
                int semangkaku = (maset.getJmlBuah(username, 4, getIdKualitas)) - 1;
                sirup = sirup - 1;
                molah.updateStokBuah(username, 1, getIdKualitas, apelku);
                molah.updateStokBuah(username, 3, getIdKualitas, manggaku);
                molah.updateStokBuah(username, 4, getIdKualitas, semangkaku);
                molah.updateStokBuah(username, 5, getIdKualitas, melonku);
                molah.updateStokBahan(username, 5, sirup);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 50));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlApel(maset.getJmlBuahAll(username, 1));
                vpengolahan.setJmlSemangka(maset.getJmlBuahAll(username, 4));
                vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, 3));
                vpengolahan.setJmlMelon(maset.getJmlBuahAll(username, 5));
                vpengolahan.setJmlSirup(sirup);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else if (kualitasapel < 1 && kualitasmangga < 1 && kualitassemangka < 1 && kualitasmelon < 1) {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki beberapa buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void SaladBuahAction() throws SQLException, InterruptedException {
        int idproduk = 16;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int kualitasapel = maset.getKualitasBuah(username, 1, getIdKualitas);
        int kualitasmangga = maset.getKualitasBuah(username, 3, getIdKualitas);
        int kualitassemangka = maset.getKualitasBuah(username, 4, getIdKualitas);
        int kualitasmelon = maset.getKualitasBuah(username, 5, getIdKualitas);
        if (kualitasapel >= 1 && kualitasmangga >= 1 && kualitassemangka >= 1 && kualitasmelon >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                int melonku = (maset.getJmlBuah(username, 5, getIdKualitas)) - 1;
                int manggaku = (maset.getJmlBuah(username, 3, getIdKualitas)) - 1;
                int apelku = (maset.getJmlBuah(username, 1, getIdKualitas)) - 1;
                int semangkaku = (maset.getJmlBuah(username, 4, getIdKualitas)) - 1;
                susu = susu - 25;
                mayo = mayo - 13;
                molah.updateStokBuah(username, 1, getIdKualitas, apelku);
                molah.updateStokBuah(username, 3, getIdKualitas, manggaku);
                molah.updateStokBuah(username, 4, getIdKualitas, semangkaku);
                molah.updateStokBuah(username, 5, getIdKualitas, melonku);
                molah.updateStokBahan(username, 8, susu);
                molah.updateStokBahan(username, 6, mayo);
                molah.tambahProduk(idproduk, getIdKualitas, username,
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 25));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan(vpengolahan.popup(), "Pengolahan Berhasil");
                vpengolahan.setJmlApel(maset.getJmlBuahAll(username, 1));
                vpengolahan.setJmlSemangka(maset.getJmlBuahAll(username, 4));
                vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, 3));
                vpengolahan.setJmlMelon(maset.getJmlBuahAll(username, 5));
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlMayo(mayo);
                molah.olahProduk(idproduk, username, 25); //GAUSA JG
                cekStatusPenghargaan();
                cekPenghargaanRameRasanya();
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else if (kualitasapel < 1 && kualitasmangga < 1 && kualitassemangka < 1 && kualitasmelon < 1) {
            vpengolahan.tampilPesan(vpengolahan.popup(), "Anda tidak memiliki beberapa buah dengan kualitas " + vpengolahan.getTeksKualitas());

        }
    }

    private class acttombolKanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kualitas = kualitas + 1;
            if (kualitas == 2) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(true);
                vpengolahan.setTeksKualitas("Sedang");
            } else if (kualitas == 3) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(false);
                vpengolahan.setTeksKualitas("Rendah");
            }
        }
    }

    private class acttombolKiri implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kualitas = kualitas - 1;
            if (kualitas == 1) {
                vpengolahan.left.setVisible(false);
                vpengolahan.setTeksKualitas("Baik");
            } else if (kualitas == 2) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(true);
                vpengolahan.setTeksKualitas("Sedang");
            }
        }
    }

    private class acttombolOlah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (stjusmelon) {
                try {
                    JusMelonAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjusapel) {
                try {
                    JusApelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjusmangga) {
                try {
                    JusManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjussemangka) {
                try {
                    JusSemangkaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjuspisang) {
                try {
                    JusPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikapel) {
                try {
                    KripikApelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikmangga) {
                try {
                    KripikManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikpisang) {
                try {
                    KripikPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownismangga) {
                try {
                    BrownisManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownismelon) {
                try {
                    BrownisMelonAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownispisang) {
                try {
                    BrownisPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownissemangka) {
                try {
                    BrownisSemangkaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownisapel) {
                try {
                    BrownisApelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stsale) {
                try {
                    SalePisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stsaladbuah) {
                try {
                    SaladBuahAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stesbuah) {
                try {
                    EsBuahAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                cekkomposisi();
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolbatal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.enable();
            vpengolahan.popup().dispose();
            stjusmelon = false;
            stjusmangga = false;
            stjusapel = false;
            stjussemangka = false;
            stjuspisang = false;
            stkripikapel = false;
            stkripikpisang = false;
            stkripikmangga = false;
            stbrownismelon = false;
            stbrownisapel = false;
            stbrownismangga = false;
            stbrownispisang = false;
            stbrownissemangka = false;
            stesbuah = false;
            stsaladbuah = false;
            stsale = false;
            kualitas = 1;
            jml = 1;
        }
    }
}
