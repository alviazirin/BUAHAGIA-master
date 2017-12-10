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
import m.maset;
import v.ingudang;
import v.map;
//cek coba anu

/**
 *
 * @author Farisya
 */
public class gudangc {

    map vmap;
    String username;
    maset maset;
    ingudang vgudang;
    int apel1, apel2, apel3, semangka1, semangka2, semangka3, melon1, melon2, melon3, mangga1, mangga2, mangga3, pisang1, pisang2, pisang3;
    int brownisapel1, brownisapel2, brownisapel3, brownissemangka1, brownissemangka2, brownissemangka3, brownismelon1,
            brownismelon2, brownismelon3, brownismangga1, brownismangga2, brownismangga3, brownispisang1, brownispisang2, brownispisang3;
    int jusapel1, jusapel2, jusapel3, jusmelon1, jusmelon2, jusmelon3, jusmangga1, jusmangga2, jusmangga3, jussemangka1, jussemangka2,
            jussemangka3, juspisang1, juspisang2, juspisang3;
    int kripikapel1, kripikapel2, kripikapel3, kripikpisang1, kripikpisang2, kripikpisang3, kripikmangga1, kripikmangga2, kripikmangga3;
    int esbuah1, esbuah2, esbuah3, salad1, salad2, salad3, sale1, sale2, sale3;
    int mayo, susu, telur, mentega, tepungterigu, tepungberas, sirup, minyak, pengembang, gula;

    public gudangc(String username) throws SQLException {
        this.username = username;
        this.maset = new maset();
        this.vgudang = new ingudang();
        vgudang.setVisible(true);
        setStokProduk();
        setStokBuah();
        setStokBahan();
        vgudang.klikKembali(new acttombolkembali());
        vgudang.klikNexttoBahan(new acttombolnexttoBahan());
        vgudang.klikPreviousBahan(new acttombolprevioustoBahan());
        vgudang.klikNexttoProduk(new acttombolnexttoProduk());
        vgudang.klikPreviousBuah(new acttombolprevioustoBuah());
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                map v = new map();
                mapc c = new mapc(username);
                vgudang.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolnexttoBahan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vgudang.setVisible(false);
            vgudang.showbahan().setVisible(true);
        }
    }

    private class acttombolnexttoProduk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vgudang.showbahan().setVisible(false);
            vgudang.showproduk().setVisible(true);
        }
    }

    private class acttombolprevioustoBuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vgudang.setVisible(true);
            vgudang.showbahan().setVisible(false);
        }
    }

    private class acttombolprevioustoBahan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vgudang.showbahan().setVisible(true);
            vgudang.showproduk().setVisible(false);
        }
    }

    public void setStokBuah() throws SQLException {
        getStokBuah();
        vgudang.setStokBuah1(mangga1, apel1, melon1, semangka1, pisang1);
        vgudang.setStokBuah2(mangga2, apel2, melon2, semangka2, pisang2);
        vgudang.setStokBuah3(mangga3, apel3, melon3, semangka3, pisang3);
    }

    public void setStokBahan() throws SQLException {
        getStokBahan();
        vgudang.setStokBahan(gula, minyak, mayo, mentega, sirup, telur, telur, telur, susu, susu);
    }

    public void setStokProduk() throws SQLException {
        getStokProduk();
        vgudang.setStokProduk1(brownisapel1, brownispisang1, brownissemangka1, brownismelon1,
                brownismangga1, kripikapel1, kripikpisang1, kripikmangga1, juspisang1, jusmangga1,
                jusmelon1, jussemangka1, jusapel1, esbuah1, salad1, sale1);
        vgudang.setStokProduk2(brownisapel2, brownispisang2, brownissemangka2, brownismelon2,
                brownismangga2, kripikapel2, kripikpisang2, kripikmangga2, juspisang2, jusmangga2,
                jusmelon2, jussemangka2, jusapel2, esbuah2, salad2, sale2);
        vgudang.setStokProduk3(brownisapel3, brownispisang3, brownissemangka3, brownismelon3,
                brownismangga3, kripikapel3, kripikpisang3, kripikmangga3, juspisang3, jusmangga3,
                jusmelon3, jussemangka3, jusapel3, esbuah3, salad3, sale3);
    }

    public void getStokBuah() throws SQLException {
        apel1 = maset.getJmlBuah(username, 1, 1);
        apel2 = maset.getJmlBuah(username, 1, 2);
        apel3 = maset.getJmlBuah(username, 1, 3);
        pisang1 = maset.getJmlBuah(username, 2, 1);
        pisang2 = maset.getJmlBuah(username, 2, 2);
        pisang3 = maset.getJmlBuah(username, 2, 3);
        mangga1 = maset.getJmlBuah(username, 3, 1);
        mangga2 = maset.getJmlBuah(username, 3, 2);
        mangga3 = maset.getJmlBuah(username, 3, 3);
        semangka1 = maset.getJmlBuah(username, 4, 1);
        semangka2 = maset.getJmlBuah(username, 4, 2);
        semangka3 = maset.getJmlBuah(username, 4, 3);
        melon1 = maset.getJmlBuah(username, 5, 1);
        melon2 = maset.getJmlBuah(username, 5, 2);
        melon3 = maset.getJmlBuah(username, 5, 3);
    }

    public void getStokBahan() throws SQLException {
        mayo = maset.getJmlBahan(username, 6);
        susu = maset.getJmlBahan(username, 8);
        gula = maset.getJmlBahan(username, 1);
        tepungberas = maset.getJmlBahan(username, 2);
        minyak = maset.getJmlBahan(username, 3);
        mentega = maset.getJmlBahan(username, 4);
        sirup = maset.getJmlBahan(username, 5);
        telur = maset.getJmlBahan(username, 7);
        pengembang = maset.getJmlBahan(username, 9);
        tepungterigu = maset.getJmlBahan(username, 10);

    }

    public void getStokProduk() throws SQLException {
        brownispisang1 = maset.getJmlProduk(username, 9, 1);
        brownispisang2 = maset.getJmlProduk(username, 9, 2);
        brownispisang3 = maset.getJmlProduk(username, 9, 3);
        brownisapel1 = maset.getJmlProduk(username, 10, 1);
        brownisapel2 = maset.getJmlProduk(username, 10, 2);
        brownisapel3 = maset.getJmlProduk(username, 10, 3);
        brownismangga1 = maset.getJmlProduk(username, 13, 1);
        brownismangga2 = maset.getJmlProduk(username, 13, 2);
        brownismangga3 = maset.getJmlProduk(username, 13, 3);
        brownismelon1 = maset.getJmlProduk(username, 11, 1);
        brownismelon2 = maset.getJmlProduk(username, 11, 2);
        brownismelon3 = maset.getJmlProduk(username, 11, 3);
        brownissemangka1 = maset.getJmlProduk(username, 12, 1);
        brownissemangka2 = maset.getJmlProduk(username, 12, 2);
        brownissemangka3 = maset.getJmlProduk(username, 12, 3);
        jusapel1 = maset.getJmlProduk(username, 1, 1);
        jusapel2 = maset.getJmlProduk(username, 1, 2);
        jusapel3 = maset.getJmlProduk(username, 1, 3);
        juspisang1 = maset.getJmlProduk(username, 2, 1);
        juspisang2 = maset.getJmlProduk(username, 2, 2);
        juspisang3 = maset.getJmlProduk(username, 2, 3);
        jusmangga1 = maset.getJmlProduk(username, 3, 1);
        jusmangga2 = maset.getJmlProduk(username, 3, 2);
        jusmangga3 = maset.getJmlProduk(username, 3, 3);
        jusmelon1 = maset.getJmlProduk(username, 4, 1);
        jusmelon2 = maset.getJmlProduk(username, 4, 2);
        jusmelon3 = maset.getJmlProduk(username, 4, 3);
        jussemangka1 = maset.getJmlProduk(username, 5, 1);
        jussemangka2 = maset.getJmlProduk(username, 5, 2);
        jussemangka3 = maset.getJmlProduk(username, 5, 3);
        kripikapel1 = maset.getJmlProduk(username, 6, 1);
        kripikapel2 = maset.getJmlProduk(username, 6, 2);
        kripikapel3 = maset.getJmlProduk(username, 6, 3);
        kripikmangga1 = maset.getJmlProduk(username, 7, 1);
        kripikmangga2 = maset.getJmlProduk(username, 7, 2);
        kripikmangga3 = maset.getJmlProduk(username, 7, 3);
        kripikpisang1 = maset.getJmlProduk(username, 8, 1);
        kripikpisang2 = maset.getJmlProduk(username, 8, 2);
        kripikpisang3 = maset.getJmlProduk(username, 8, 3);
        esbuah1 = maset.getJmlProduk(username, 15, 1);
        esbuah2 = maset.getJmlProduk(username, 15, 2);
        esbuah3 = maset.getJmlProduk(username, 15, 3);
        salad1 = maset.getJmlProduk(username, 16, 1);
        salad2 = maset.getJmlProduk(username, 16, 2);
        salad3 = maset.getJmlProduk(username, 16, 3);
        sale1 = maset.getJmlProduk(username, 14, 1);
        sale2 = maset.getJmlProduk(username, 14, 2);
        sale3 = maset.getJmlProduk(username, 14, 3);
    }
}
