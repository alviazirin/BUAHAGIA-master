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
import javafx.geometry.VPos;
import m.maset;
import m.mplayer;
import v.achievement;

/**
 *
 * @author Farisya
 */
public class penghargaanc {

    String username;
    achievement v;
    maset maset;
    mplayer mplayer;
    int legend;
    boolean maniakapel, maniakmangga, maniakmelon, simanis, sigembul, sisehat, tukangblender, kriuk, ramerasanya,
            juraganroti, pebisnisesbuah, pengusahasale, saudagar;
    boolean maniakapel2, maniakmangga2, maniakmelon2, simanis2, sigembul2, sisehat2, tukangblender2, kriuk2, ramerasanya2,
            juraganroti2, pebisnisesbuah2, pengusahasale2, saudagar2;
    boolean maniakapel1, maniakmangga1, maniakmelon1, simanis1, sigembul1, sisehat1, tukangblender1, kriuk1, ramerasanya1,
            juraganroti1, pebisnisesbuah1, pengusahasale1, saudagar1;
    boolean km, ka, kp;

    public penghargaanc(String username) throws SQLException {
        this.username = username;
        this.v = new achievement();
        v.setVisible(true);
        this.maset = new maset();
        this.mplayer = new mplayer();
        cekPenghargaan();
        cekPenghargaanKhusus();
        acctombolDetail();
        v.klikOke(new acttombolOke());
        v.klikTutup(new acttombolTutup());
    }

    private class acttombolTutup implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                new mapc(username);
                v.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(penghargaanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolOke implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().dispose();
            v.setVisible(true);
            v.enable();
        }
    }

    public void getPenghargaan() throws SQLException {
        maniakapel = maset.cekAchv(username, "maniakapel", 1);
        maniakmangga = maset.cekAchv(username, "maniakmangga", 1);
        maniakmelon = maset.cekAchv(username, "maniakmelon", 1);
        simanis = maset.cekAchv(username, "simanis", 1);
        sigembul = maset.cekAchv(username, "sigembul", 1);
        sisehat = maset.cekAchv(username, "sisehat", 1);
        tukangblender = maset.cekAchv(username, "tukangblender", 1);
        kriuk = maset.cekAchv(username, "kriuk", 1);
        ramerasanya = maset.cekAchv(username, "ramerasanya", 1);
        juraganroti = maset.cekAchv(username, "juraganroti", 1);
        pebisnisesbuah = maset.cekAchv(username, "pebisnisesbuah", 1);
        pengusahasale = maset.cekAchv(username, "pengusahasale", 1);
        saudagar = maset.cekAchv(username, "saudagar", 1);

        maniakapel2 = maset.cekAchv(username, "maniakapel", 2);
        maniakmangga2 = maset.cekAchv(username, "maniakmangga", 2);
        maniakmelon2 = maset.cekAchv(username, "maniakmelon", 2);
        simanis2 = maset.cekAchv(username, "simanis", 2);
        sigembul2 = maset.cekAchv(username, "sigembul", 2);
        sisehat2 = maset.cekAchv(username, "sisehat", 2);
        tukangblender2 = maset.cekAchv(username, "tukangblender", 2);
        kriuk2 = maset.cekAchv(username, "kriuk", 2);
        ramerasanya2 = maset.cekAchv(username, "ramerasanya", 2);
        juraganroti2 = maset.cekAchv(username, "juraganroti", 2);
        pebisnisesbuah2 = maset.cekAchv(username, "pebisnisesbuah", 2);
        pengusahasale2 = maset.cekAchv(username, "pengusahasale", 2);
        saudagar2 = maset.cekAchv(username, "saudagar", 2);

        maniakapel1 = maset.cekAchv(username, "maniakapel", 3);
        maniakmangga1 = maset.cekAchv(username, "maniakmangga", 3);
        maniakmelon1 = maset.cekAchv(username, "maniakmelon", 3);
        simanis1 = maset.cekAchv(username, "simanis", 3);
        sigembul1 = maset.cekAchv(username, "sigembul", 3);
        sisehat1 = maset.cekAchv(username, "sisehat", 3);
        tukangblender1 = maset.cekAchv(username, "tukangblender", 3);
        kriuk1 = maset.cekAchv(username, "kriuk", 3);
        ramerasanya1 = maset.cekAchv(username, "ramerasanya", 3);
        juraganroti1 = maset.cekAchv(username, "juraganroti", 3);
        pebisnisesbuah1 = maset.cekAchv(username, "pebisnisesbuah", 3);
        pengusahasale1 = maset.cekAchv(username, "pengusahasale", 3);
        saudagar1 = maset.cekAchv(username, "saudagar", 3);

        legend = maset.getStatusLegend(username);
    }

    public void cekResep() throws SQLException {
        km = maset.cekResep(username, "kripikmangga");
        ka = maset.cekResep(username, "kripikapel");
        kp = maset.cekResep(username, "kripikpisang");
    }

    public void cekPenghargaan() throws SQLException {
        getPenghargaan();
        if (maniakapel) {
            v.maniakapel.setEnabled(true);
        } else if (maniakapel2) {
            v.maniakapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.maniakapel.setEnabled(true);
        } else if (maniakapel1) {
            v.maniakapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.maniakapel.setEnabled(true);
        } else {
            v.maniakapel.setEnabled(false);
        }
        if (maniakmangga) {
            v.maniakmangga.setEnabled(true);
        } else if (maniakmangga2) {
            v.maniakmangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.maniakmangga.setEnabled(true);
        } else if (maniakmangga1) {
            v.maniakmangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.maniakmangga.setEnabled(true);
        } else {
            v.maniakmangga.setEnabled(false);
        }
        if (maniakmelon) {
            v.maniakmelon.setEnabled(true);
        } else if (maniakmelon2) {
            v.maniakmelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.maniakmelon.setEnabled(true);
        } else if (maniakmelon1) {
            v.maniakmelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.maniakmelon.setEnabled(true);
        } else {
            v.maniakmelon.setEnabled(false);
        }
        if (simanis) {
            v.simanis.setEnabled(true);
        } else if (simanis2) {
            v.simanis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.simanis.setEnabled(true);
        } else if (simanis1) {
            v.simanis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.simanis.setEnabled(true);
        } else {
            v.simanis.setEnabled(false);
        }
        if (sigembul) {
            v.sigembul.setEnabled(true);
        } else if (sigembul2) {
            v.sigembul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.sigembul.setEnabled(true);
        } else if (sigembul1) {
            v.sigembul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.sigembul.setEnabled(true);

        } else {
            v.sigembul.setEnabled(false);
        }
        if (sisehat) {
            v.sisehat.setEnabled(true);
        } else if (sisehat2) {
            v.sisehat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.sisehat.setEnabled(true);
        } else if (sisehat1) {
            v.sisehat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.sisehat.setEnabled(true);
        } else {
            v.sisehat.setEnabled(false);
        }
        if (tukangblender) {
            v.tukangblender.setEnabled(true);
        } else if (tukangblender2) {
            v.tukangblender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.tukangblender.setEnabled(true);
        } else if (tukangblender1) {
            v.tukangblender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.tukangblender.setEnabled(true);
        } else {
            v.tukangblender.setEnabled(false);
        }
        if (kriuk) {
            v.kriuk.setEnabled(true);
            cekResep();
        } else if (kriuk2) {
            v.kriuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.kriuk.setEnabled(true);
        } else if (kriuk1) {
            v.kriuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.kriuk.setEnabled(true);
        } else {
            v.kriuk.setEnabled(false);
        }
        if (ramerasanya) {
            v.ramerasanya.setEnabled(true);
        } else if (ramerasanya2) {
            v.ramerasanya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.ramerasanya.setEnabled(true);
        } else if (ramerasanya1) {
            v.ramerasanya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.ramerasanya.setEnabled(true);
        } else {
            v.ramerasanya.setEnabled(false);
        }
        if (pebisnisesbuah) {
            v.pebisnisesbuah.setEnabled(true);
        } else if (pebisnisesbuah2) {
            v.pebisnisesbuah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.pebisnisesbuah.setEnabled(true);
        } else if (pebisnisesbuah1) {
            v.pebisnisesbuah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.pebisnisesbuah.setEnabled(true);

        } else {
            v.pebisnisesbuah.setEnabled(false);
        }
        if (pengusahasale) {
            v.pengusahasale.setEnabled(true);
        } else if (pengusahasale2) {
            v.pengusahasale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.pengusahasale.setEnabled(true);
        } else if (pengusahasale1) {
            v.pengusahasale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.pengusahasale.setEnabled(true);

        } else {
            v.pengusahasale.setEnabled(false);
        }
        if (juraganroti) {
            v.juraganroti.setEnabled(true);
        } else if (juraganroti2) {
            v.juraganroti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank2.png")));
            v.juraganroti.setEnabled(true);
        } else if (juraganroti1) {
            v.juraganroti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank1.png")));
            v.juraganroti.setEnabled(true);
        } else {
            v.juraganroti.setEnabled(false);
        }
        if (saudagar) {
            v.saudagar.setEnabled(true);
        } else if (saudagar2) {
            v.saudagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logosaudagar2.png")));
            v.saudagar.setEnabled(true);
        } else if (saudagar1) {
            v.saudagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logosaudagar1.png")));
            v.saudagar.setEnabled(true);

        } else {
            v.saudagar.setEnabled(false);
        }
    }

    public void cekPenghargaanKhusus() throws SQLException {
        int uang = maset.getUang(username);
        if (legend >= 5) {
            v.legend.setEnabled(true);
            if (legend == 5) {
                maset.updateUang((uang + 1000000), username);
                v.tampilPesan("LEGEND RANK 3 TERBUKA\n ANDA MENDAPATKAN UANG 1.000.000");
                maset.updatePenghargaan(username, "legend", legend + 1);
            }
        } else if (legend >= 9) {
            v.legend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logolegend2.png")));
            v.legend.setEnabled(true);
            if (legend == 9) {
                maset.updateUang((uang + 1500000), username);
                maset.updatePenghargaan(username, "legend", legend + 1);
                v.tampilPesan("LEGEND RANK 2 TERBUKA\n ANDA MENDAPATKAN UANG 1.500.000");
            }
        } else if (legend >= 14) {
            v.legend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logolegend1.png")));
            v.legend.setEnabled(true);
            if (legend == 14) {
                maset.updatePenghargaan(username, "legend", legend + 1);
                v.popup().setVisible(true);
                v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/legend.png")));
            }
        } else {
            v.legend.setEnabled(false);
        }
    }

    private class acttombolManiakApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailmaniakapel.png")));
        }
    }

    private class acttombolManiakMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailmaniakmangga.png")));
        }
    }

    private class acttombolManiakMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailmaniakmelon.png")));
        }
    }

    private class acttombolSiManis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailsimanis.png")));
        }
    }

    private class acttombolSiGembul implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailsigembul.png")));
        }
    }

    private class acttombolSiSehat implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailsisehat.png")));
        }
    }

    private class acttombolTukangBlender implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailtukangblender.png")));
        }
    }

    private class acttombolRameRasanya implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailramerasanya.png")));
        }
    }

    private class acttombolKriuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailkriuk.png")));
        }
    }

    private class acttombolJuraganRoti implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailjuraganroti.png")));
        }
    }

    private class acttombolPebisnisEsBuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailpebisnisesbuah.png")));
        }
    }

    private class acttombolPengusahaSale implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailpengusahasale.png")));
        }
    }

    private class acttombolSaudagar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/saudagar.png")));
        }
    }

    private class acttombolLegend implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            v.popup().setVisible(true);
            v.disable();
            v.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/legend.png")));
        }
    }

    public void acctombolDetail() {
        v.klikJuraganRoti(new acttombolJuraganRoti());
        v.klikKriuk(new acttombolKriuk());
        v.klikLegend(new acttombolLegend());
        v.klikManiakApel(new acttombolManiakApel());
        v.klikManiakMangga(new acttombolManiakMangga());
        v.klikManiakMelon(new acttombolManiakMelon());
        v.klikRameRasanya(new acttombolRameRasanya());
        v.klikPebisnisEsbuah(new acttombolPebisnisEsBuah());
        v.klikPengusahaSale(new acttombolPengusahaSale());
        v.klikSaudagar(new acttombolSaudagar());
        v.klikSiGembul(new acttombolSiGembul());
        v.klikSiManis(new acttombolSiManis());
        v.klikSiSehat(new acttombolSiSehat());
        v.klikTukangBlender(new acttombolTukangBlender());
    }
}
