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
import m.mpembelian;
import v.inkedaibuah2;
import v.insupermarket;
import v.mainmenu;
import v.map;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class pasarc {

    pasarmap vpasar;
    String username;
    maset maset;
    public pasarc(String username) throws SQLException {
        this.vpasar = new pasarmap();
        this.maset = new maset();
        vpasar.setVisible(true);
        vpasar.klikKembali(new acttombolkembali());
        vpasar.klikSupermarket(new acttombolSupermarket());
        vpasar.klikKedai1(new acttombolKedai1());
        vpasar.klikKedai2(new acttombolKedai2());
        vpasar.klikToko(new acttombolToko());
        this.username = username;
        vpasar.setUang(maset.getUang(username) + "");
    }
     private class acttombolkembali implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                map v = new map();
                mapc c = new mapc(username);
                vpasar.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pasarc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class acttombolSupermarket implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                new supermarketc(username);
                System.out.println("y");
                vpasar.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pasarc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class acttombolToko implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                new penjualanc(username);
                vpasar.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pasarc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class acttombolKedai1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                new kedaibuah(username);
                System.out.println("y");
                vpasar.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pasarc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class acttombolKedai2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                System.out.println("go to kedai2");
                inkedaibuah2 v = new inkedaibuah2();
                kedaibuah c= new kedaibuah(username, v);
                System.out.println(username);
                System.out.println("y");
                vpasar.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pasarc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
