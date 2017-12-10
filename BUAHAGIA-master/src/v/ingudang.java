/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Farisya
 */
public class ingudang extends javax.swing.JFrame {

    /**
     * Creates new form ingudang
     */
    public ingudang() {
        initComponents();
    }

    public void klikNexttoBahan(ActionListener a) {
        next.addActionListener(a);
    }

    public void klikNexttoProduk(ActionListener a) {
        nextproduk.addActionListener(a);
    }

    public void klikPreviousBahan(ActionListener a) {
        previous.addActionListener(a);
    }

    public void klikPreviousBuah(ActionListener a) {
        prevbuah.addActionListener(a);
    }

    public void klikKembali(ActionListener a) {
        back.addActionListener(a);
    }

    public JFrame showproduk() {
        return nextgudang;
    }

    public JFrame showbahan() {
        return vbahan;
    }

    public void setStokBuah1(int mangga, int apel, int melon, int semangka, int pisang) {
        setJmlMangga1(mangga);
        setJmlApel1(apel);
        setJmlMelon1(melon);
        setJmlSemangka1(semangka);
        setJmlPisang1(pisang);
    }

    public void setStokBuah2(int mangga, int apel, int melon, int semangka, int pisang) {
        setJmlMangga2(mangga);
        setJmlApel2(apel);
        setJmlMelon2(melon);
        setJmlSemangka2(semangka);
        setJmlPisang2(pisang);
    }

    public void setStokBuah3(int mangga, int apel, int melon, int semangka, int pisang) {
        setJmlMangga3(mangga);
        setJmlApel3(apel);
        setJmlMelon3(melon);
        setJmlSemangka3(semangka);
        setJmlPisang3(pisang);
    }

    public void setStokProduk1(int ba, int bp, int bs, int bme, int bma,
            int ka, int kp, int km, int jp, int jma, int jme, int js, int ja,
            int es, int sb, int sale) {
        setJmlBrownisA1(ba);
        setJmlBrownisMangga1(bma);
        setJmlBrownisMelon1(bme);
        setJmlBrownisPisang1(bp);
        setJmlBrownisSemangka1(bs);
        setJmlJusApel1(ja);
        setJmlJusMangga1(jma);
        setJmlJusMelon1(jme);
        setJmlJusPisang1(jp);
        setJmlJusSemangka1(js);
        setJmlKripikApel1(ka);
        setJmlKripikMangga1(km);
        setJmlKripikPisang1(kp);
        setJmlEsbuah1(es);
        setJmlSaladbuah1(sb);
        setJmlSale1(sale);
    }

    public void setStokProduk2(int ba, int bp, int bs, int bme, int bma,
            int ka, int kp, int km, int jp, int jma, int jme, int js, int ja,
            int es, int sb, int sale) {
        setJmlBrownisA2(ba);
        setJmlBrownisMangga2(bma);
        setJmlBrownisMelon2(bme);
        setJmlBrownisPisang2(bp);
        setJmlBrownisSemangka2(bs);
        setJmlJusApel2(ja);
        setJmlJusMangga2(jma);
        setJmlJusMelon2(jme);
        setJmlJusPisang2(jp);
        setJmlJusSemangka2(js);
        setJmlKripikApel2(ka);
        setJmlKripikMangga2(km);
        setJmlKripikPisang2(kp);
        setJmlEsbuah2(es);
        setJmlSaladbuah2(sb);
        setJmlSale2(sale);
    }
    public void setStokProduk3(int ba, int bp, int bs, int bme, int bma,
            int ka, int kp, int km, int jp, int jma, int jme, int js, int ja,
            int es, int sb, int sale) {
        setJmlBrownisA3(ba);
        setJmlBrownisMangga3(bma);
        setJmlBrownisMelon3(bme);
        setJmlBrownisPisang3(bp);
        setJmlBrownisSemangka3(bs);
        setJmlJusApel3(ja);
        setJmlJusMangga3(jma);
        setJmlJusMelon3(jme);
        setJmlJusPisang3(jp);
        setJmlJusSemangka3(js);
        setJmlKripikApel3(ka);
        setJmlKripikMangga3(km);
        setJmlKripikPisang3(kp);
        setJmlEsbuah3(es);
        setJmlSaladbuah3(sb);
        setJmlSale3(sale);
    }

    public void setStokBahan(int gula, int minyak, int mayo, int mentega, int sirup, int telur,
            int tepungt, int tepungb, int sp, int susu) {
        setJmlGula(gula);
        setJmlMinyak(minyak);
        setJmlTelur(telur);
        setJmlSusu(susu);
        setJmlSirup(sirup);
        setJmlPengembang(sp);
        setJmlMentega(mentega);
        setJmlMayo(mayo);
        setJmlTepungT(tepungt);
        setJmlTepungB(tepungb);
    }

    public int setJmlApel1(int t) {
        apel1.setText(t + "");
        return t;
    }

    public int setJmlApel2(int t) {
        apel2.setText(t + "");
        return t;
    }

    public int setJmlApel3(int t) {
        apel3.setText(t + "");
        return t;
    }

    public int setJmlMangga1(int t) {
        mangga1.setText(t + "");
        return t;
    }

    public int setJmlMangga2(int t) {
        mangga2.setText(t + "");
        return t;
    }

    public int setJmlMangga3(int t) {
        mangga3.setText(t + "");
        return t;
    }

    public int setJmlMelon1(int t) {
        melon1.setText(t + "");
        return t;
    }

    public int setJmlMelon2(int t) {
        melon2.setText(t + "");
        return t;
    }

    public int setJmlMelon3(int t) {
        melon3.setText(t + "");
        return t;
    }

    public int setJmlPisang1(int t) {
        pisang1.setText(t + "");
        return t;
    }

    public int setJmlPisang2(int t) {
        pisang2.setText(t + "");
        return t;
    }

    public int setJmlPisang3(int t) {
        pisang3.setText(t + "");
        return t;
    }

    public int setJmlSemangka1(int t) {
        semangka1.setText(t + "");
        return t;
    }

    public int setJmlSemangka2(int t) {
        semangka2.setText(t + "");
        return t;
    }

    public int setJmlSemangka3(int t) {
        semangka3.setText(t + "");
        return t;
    }

    public int setJmlBrownisA1(int t) {
        ba1.setText(t + "");
        return t;
    }

    public int setJmlBrownisA2(int t) {
        ba2.setText(t + "");
        return t;
    }

    public int setJmlBrownisA3(int t) {
        ba3.setText(t + "");
        return t;
    }

    public int setJmlBrownisMelon1(int t) {
        bme1.setText(t + "");
        return t;
    }

    public int setJmlBrownisMelon2(int t) {
        bme2.setText(t + "");
        return t;
    }

    public int setJmlBrownisMelon3(int t) {
        bme3.setText(t + "");
        return t;
    }

    public int setJmlBrownisMangga1(int t) {
        bma1.setText(t + "");
        return t;
    }

    public int setJmlBrownisMangga2(int t) {
        bma2.setText(t + "");
        return t;
    }

    public int setJmlBrownisMangga3(int t) {
        bma3.setText(t + "");
        return t;
    }

    public int setJmlBrownisPisang1(int t) {
        bp1.setText(t + "");
        return t;
    }

    public int setJmlBrownisPisang2(int t) {
        bp2.setText(t + "");
        return t;
    }

    public int setJmlBrownisPisang3(int t) {
        bp3.setText(t + "");
        return t;
    }

    public int setJmlBrownisSemangka1(int t) {
        bs1.setText(t + "");
        return t;
    }

    public int setJmlBrownisSemangka2(int t) {
        bs2.setText(t + "");
        return t;
    }

    public int setJmlBrownisSemangka3(int t) {
        bs3.setText(t + "");
        return t;
    }

    public int setJmlJusSemangka1(int t) {
        js1.setText(t + "");
        return t;
    }

    public int setJmlJusSemangka2(int t) {
        js2.setText(t + "");
        return t;
    }

    public int setJmlJusSemangka3(int t) {
        js3.setText(t + "");
        return t;
    }

    public int setJmlJusApel1(int t) {
        ja1.setText(t + "");
        return t;
    }

    public int setJmlJusApel2(int t) {
        ja2.setText(t + "");
        return t;
    }

    public int setJmlJusApel3(int t) {
        ja3.setText(t + "");
        return t;
    }

    public int setJmlJusMelon1(int t) {
        jme1.setText(t + "");
        return t;
    }

    public int setJmlJusMelon2(int t) {
        jme2.setText(t + "");
        return t;
    }

    public int setJmlJusMelon3(int t) {
        jme3.setText(t + "");
        return t;
    }

    public int setJmlJusMangga1(int t) {
        jma1.setText(t + "");
        return t;
    }

    public int setJmlJusMangga2(int t) {
        jma2.setText(t + "");
        return t;
    }

    public int setJmlJusMangga3(int t) {
        jma3.setText(t + "");
        return t;
    }

    public int setJmlJusPisang1(int t) {
        jp1.setText(t + "");
        return t;
    }

    public int setJmlJusPisang2(int t) {
        jp2.setText(t + "");
        return t;
    }

    public int setJmlJusPisang3(int t) {
        jp3.setText(t + "");
        return t;
    }

    public int setJmlEsbuah1(int t) {
        es1.setText(t + "");
        return t;
    }

    public int setJmlEsbuah2(int t) {
        es2.setText(t + "");
        return t;
    }

    public int setJmlEsbuah3(int t) {
        es3.setText(t + "");
        return t;
    }

    public int setJmlSaladbuah1(int t) {
        salad1.setText(t + "");
        return t;
    }

    public int setJmlSaladbuah2(int t) {
        salad2.setText(t + "");
        return t;
    }

    public int setJmlSaladbuah3(int t) {
        salad3.setText(t + "");
        return t;
    }

    public int setJmlSale1(int t) {
        sale1.setText(t + "");
        return t;
    }

    public int setJmlSale2(int t) {
        sale2.setText(t + "");
        return t;
    }

    public int setJmlSale3(int t) {
        sale3.setText(t + "");
        return t;
    }

    public int setJmlKripikPisang1(int t) {
        kp1.setText(t + "");
        return t;
    }

    public int setJmlKripikPisang2(int t) {
        kp2.setText(t + "");
        return t;
    }

    public int setJmlKripikPisang3(int t) {
        kp3.setText(t + "");
        return t;
    }

    public int setJmlKripikMangga1(int t) {
        km1.setText(t + "");
        return t;
    }

    public int setJmlKripikMangga2(int t) {
        km2.setText(t + "");
        return t;
    }

    public int setJmlKripikMangga3(int t) {
        km3.setText(t + "");
        return t;
    }

    public int setJmlKripikApel1(int t) {
        ka1.setText(t + "");
        return t;
    }

    public int setJmlKripikApel2(int t) {
        ka2.setText(t + "");
        return t;
    }

    public int setJmlKripikApel3(int t) {
        ka3.setText(t + "");
        return t;
    }

    public int setJmlMayo(int t) {
        mayo.setText(t + "");
        return t;
    }

    public int setJmlMentega(int t) {
        mentega.setText(t + "");
        return t;
    }

    public int setJmlPengembang(int t) {
        sp.setText(t + "");
        return t;
    }

    public int setJmlTepungB(int t) {
        tb.setText(t + "");
        return t;
    }

    public int setJmlTepungT(int t) {
        tt.setText(t + "");
        return t;
    }

    public int setJmlSusu(int t) {
        susu.setText(t + "");
        return t;
    }

    public int setJmlSirup(int t) {
        sirup.setText(t + "");
        return t;
    }

    public int setJmlMinyak(int t) {
        minyak.setText(t + "");
        return t;
    }

    public int setJmlGula(int t) {
        gula.setText(t + "");
        return t;
    }

    public int setJmlTelur(int t) {
        telur.setText(t + "");
        return t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextgudang = new javax.swing.JFrame();
        previous = new javax.swing.JButton();
        sale1 = new javax.swing.JLabel();
        bme1 = new javax.swing.JLabel();
        bme2 = new javax.swing.JLabel();
        bme3 = new javax.swing.JLabel();
        ba1 = new javax.swing.JLabel();
        ba3 = new javax.swing.JLabel();
        ba2 = new javax.swing.JLabel();
        bma1 = new javax.swing.JLabel();
        bma2 = new javax.swing.JLabel();
        bma3 = new javax.swing.JLabel();
        bs1 = new javax.swing.JLabel();
        bs2 = new javax.swing.JLabel();
        bs3 = new javax.swing.JLabel();
        bp1 = new javax.swing.JLabel();
        bp2 = new javax.swing.JLabel();
        bp3 = new javax.swing.JLabel();
        es1 = new javax.swing.JLabel();
        es2 = new javax.swing.JLabel();
        es3 = new javax.swing.JLabel();
        salad1 = new javax.swing.JLabel();
        salad2 = new javax.swing.JLabel();
        salad3 = new javax.swing.JLabel();
        ka1 = new javax.swing.JLabel();
        ka2 = new javax.swing.JLabel();
        ka3 = new javax.swing.JLabel();
        km1 = new javax.swing.JLabel();
        km2 = new javax.swing.JLabel();
        km3 = new javax.swing.JLabel();
        ja1 = new javax.swing.JLabel();
        ja2 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        jma1 = new javax.swing.JLabel();
        jma2 = new javax.swing.JLabel();
        jma3 = new javax.swing.JLabel();
        jme3 = new javax.swing.JLabel();
        jme2 = new javax.swing.JLabel();
        jme1 = new javax.swing.JLabel();
        jp1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JLabel();
        js3 = new javax.swing.JLabel();
        js2 = new javax.swing.JLabel();
        js1 = new javax.swing.JLabel();
        sale2 = new javax.swing.JLabel();
        sale3 = new javax.swing.JLabel();
        kp1 = new javax.swing.JLabel();
        kp2 = new javax.swing.JLabel();
        kp3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        vbahan = new javax.swing.JFrame();
        tb = new javax.swing.JLabel();
        gula = new javax.swing.JLabel();
        susu = new javax.swing.JLabel();
        mayo = new javax.swing.JLabel();
        sirup = new javax.swing.JLabel();
        minyak = new javax.swing.JLabel();
        telur = new javax.swing.JLabel();
        sp = new javax.swing.JLabel();
        mentega = new javax.swing.JLabel();
        tt = new javax.swing.JLabel();
        prevbuah = new javax.swing.JButton();
        nextproduk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        apel1 = new javax.swing.JLabel();
        apel2 = new javax.swing.JLabel();
        apel3 = new javax.swing.JLabel();
        mangga1 = new javax.swing.JLabel();
        mangga2 = new javax.swing.JLabel();
        mangga3 = new javax.swing.JLabel();
        melon1 = new javax.swing.JLabel();
        melon2 = new javax.swing.JLabel();
        melon3 = new javax.swing.JLabel();
        semangka1 = new javax.swing.JLabel();
        semangka2 = new javax.swing.JLabel();
        semangka3 = new javax.swing.JLabel();
        pisang1 = new javax.swing.JLabel();
        pisang2 = new javax.swing.JLabel();
        pisang3 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        nextgudang.setUndecorated(true);
        nextgudang.setPreferredSize(new java.awt.Dimension(1366, 768));
        nextgudang.setSize(new java.awt.Dimension(1366, 768));
        nextgudang.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous.setBorder(null);
        previous.setBorderPainted(false);
        previous.setContentAreaFilled(false);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextgudang.getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 70));

        sale1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        sale1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale1.setText("0");
        nextgudang.getContentPane().add(sale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 119, -1, 30));

        bme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme1.setText("0");
        nextgudang.getContentPane().add(bme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        bme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme2.setText("0");
        nextgudang.getContentPane().add(bme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 30));

        bme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme3.setText("0");
        nextgudang.getContentPane().add(bme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        ba1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ba1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba1.setText("0");
        nextgudang.getContentPane().add(ba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        ba3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ba3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba3.setText("0");
        nextgudang.getContentPane().add(ba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        ba2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ba2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba2.setText("0");
        nextgudang.getContentPane().add(ba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 189, -1, 30));

        bma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma1.setText("0");
        nextgudang.getContentPane().add(bma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        bma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma2.setText("0");
        nextgudang.getContentPane().add(bma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 10, 30));

        bma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma3.setText("0");
        nextgudang.getContentPane().add(bma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 10, 20));

        bs1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs1.setText("0");
        nextgudang.getContentPane().add(bs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        bs2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs2.setText("0");
        nextgudang.getContentPane().add(bs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 10, 30));

        bs3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bs3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs3.setText("0");
        nextgudang.getContentPane().add(bs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        bp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp1.setText("0");
        nextgudang.getContentPane().add(bp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        bp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp2.setText("0");
        nextgudang.getContentPane().add(bp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, -1, -1));

        bp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        bp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp3.setText("0");
        nextgudang.getContentPane().add(bp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        es1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        es1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es1.setText("0");
        nextgudang.getContentPane().add(es1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));

        es2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        es2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es2.setText("0");
        nextgudang.getContentPane().add(es2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 189, -1, 30));

        es3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        es3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es3.setText("0");
        nextgudang.getContentPane().add(es3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 259, 30, 30));

        salad1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        salad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad1.setText("0");
        nextgudang.getContentPane().add(salad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, -1, -1));

        salad2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        salad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad2.setText("0");
        nextgudang.getContentPane().add(salad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 189, -1, 30));

        salad3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        salad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad3.setText("0");
        nextgudang.getContentPane().add(salad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 260, -1, -1));

        ka1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ka1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka1.setText("0");
        nextgudang.getContentPane().add(ka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 500, 20, 30));

        ka2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ka2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka2.setText("0");
        nextgudang.getContentPane().add(ka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 580, 20, 30));

        ka3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ka3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka3.setText("0");
        nextgudang.getContentPane().add(ka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 660, 20, 30));

        km1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        km1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km1.setText("0");
        nextgudang.getContentPane().add(km1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 20, 30));

        km2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        km2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km2.setText("0");
        nextgudang.getContentPane().add(km2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 20, 30));

        km3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        km3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km3.setText("0");
        nextgudang.getContentPane().add(km3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, 20, 30));

        ja1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja1.setText("0");
        nextgudang.getContentPane().add(ja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 20, 30));

        ja2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja2.setText("0");
        nextgudang.getContentPane().add(ja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 579, 20, 30));

        ja3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        ja3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja3.setText("0");
        nextgudang.getContentPane().add(ja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 20, 30));

        jma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma1.setText("0");
        nextgudang.getContentPane().add(jma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 499, 30, 30));

        jma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma2.setText("0");
        nextgudang.getContentPane().add(jma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 579, 30, 30));

        jma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma3.setText("0");
        nextgudang.getContentPane().add(jma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 659, 30, 30));

        jme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme3.setText("0");
        nextgudang.getContentPane().add(jme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 659, 20, 30));

        jme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme2.setText("0");
        nextgudang.getContentPane().add(jme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 20, 20));

        jme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme1.setText("0");
        nextgudang.getContentPane().add(jme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 499, 20, 30));

        jp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp1.setText("0");
        nextgudang.getContentPane().add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 499, 20, 30));

        jp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp2.setText("0");
        nextgudang.getContentPane().add(jp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 20, 30));

        jp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp3.setText("0");
        nextgudang.getContentPane().add(jp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 659, 20, 30));

        js3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        js3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js3.setText("0");
        nextgudang.getContentPane().add(js3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 659, 20, 30));

        js2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        js2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js2.setText("0");
        nextgudang.getContentPane().add(js2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 579, 20, 30));

        js1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        js1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js1.setText("0");
        nextgudang.getContentPane().add(js1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 499, 20, 30));

        sale2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        sale2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale2.setText("0");
        nextgudang.getContentPane().add(sale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 190, -1, -1));

        sale3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        sale3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale3.setText("0");
        nextgudang.getContentPane().add(sale3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 260, -1, -1));

        kp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        kp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp1.setText("0");
        nextgudang.getContentPane().add(kp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1279, 499, 20, 30));

        kp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        kp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp2.setText("0");
        nextgudang.getContentPane().add(kp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 580, 20, 30));

        kp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        kp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp3.setText("0");
        nextgudang.getContentPane().add(kp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 660, 20, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/stokproduk.png"))); // NOI18N
        bg.setText("jLabel2");
        bg.setPreferredSize(new java.awt.Dimension(1366, 768));
        nextgudang.getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        vbahan.setUndecorated(true);
        vbahan.setSize(new java.awt.Dimension(1366, 768));
        vbahan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        tb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tb.setText("0");
        vbahan.getContentPane().add(tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        gula.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        gula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula.setText("0");
        vbahan.getContentPane().add(gula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 389, 40, 30));

        susu.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        susu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu.setText("0");
        vbahan.getContentPane().add(susu, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 30, 30));

        mayo.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        mayo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayo.setText("0");
        vbahan.getContentPane().add(mayo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 20, 30));

        sirup.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        sirup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sirup.setText("0");
        vbahan.getContentPane().add(sirup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 609, 30, 30));

        minyak.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        minyak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minyak.setText("0");
        vbahan.getContentPane().add(minyak, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 50, 30));

        telur.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        telur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur.setText("0");
        vbahan.getContentPane().add(telur, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 389, 30, 30));

        sp.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        sp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp.setText("0");
        vbahan.getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, 40, 30));

        mentega.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        mentega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mentega.setText("0");
        vbahan.getContentPane().add(mentega, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 389, 40, 30));

        tt.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        tt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt.setText("0");
        vbahan.getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 610, 40, 30));

        prevbuah.setBorder(null);
        prevbuah.setBorderPainted(false);
        prevbuah.setContentAreaFilled(false);
        prevbuah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vbahan.getContentPane().add(prevbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 60, 70));

        nextproduk.setBorder(null);
        nextproduk.setBorderPainted(false);
        nextproduk.setContentAreaFilled(false);
        nextproduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vbahan.getContentPane().add(nextproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 383, 70, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/stokbahan.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        vbahan.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apel1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        apel1.setText("0");
        getContentPane().add(apel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        apel2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        apel2.setText("0");
        getContentPane().add(apel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        apel3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        apel3.setText("0");
        getContentPane().add(apel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        mangga1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        mangga1.setText("0");
        getContentPane().add(mangga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        mangga2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        mangga2.setText("0");
        getContentPane().add(mangga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        mangga3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        mangga3.setText("0");
        getContentPane().add(mangga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, -1, -1));

        melon1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        melon1.setText("0");
        getContentPane().add(melon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        melon2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        melon2.setText("0");
        getContentPane().add(melon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        melon3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        melon3.setText("0");
        getContentPane().add(melon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        semangka1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        semangka1.setText("0");
        getContentPane().add(semangka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, -1, -1));

        semangka2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        semangka2.setText("0");
        getContentPane().add(semangka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, -1, -1));

        semangka3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        semangka3.setText("0");
        getContentPane().add(semangka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, -1, -1));

        pisang1.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        pisang1.setText("0");
        getContentPane().add(pisang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 360, -1, -1));

        pisang2.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        pisang2.setText("0");
        getContentPane().add(pisang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 470, -1, -1));

        pisang3.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        pisang3.setText("0");
        getContentPane().add(pisang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 570, -1, -1));

        next.setBorder(null);
        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 373, 70, 70));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/back.png"))); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/stokbuah.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/backhover.png"));
        back.setIcon(awal);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/back.png"));
        back.setIcon(awal);
    }//GEN-LAST:event_backMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ingudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingudang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apel1;
    private javax.swing.JLabel apel2;
    private javax.swing.JLabel apel3;
    private javax.swing.JLabel ba1;
    private javax.swing.JLabel ba2;
    private javax.swing.JLabel ba3;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bma1;
    private javax.swing.JLabel bma2;
    private javax.swing.JLabel bma3;
    private javax.swing.JLabel bme1;
    private javax.swing.JLabel bme2;
    private javax.swing.JLabel bme3;
    private javax.swing.JLabel bp1;
    private javax.swing.JLabel bp2;
    private javax.swing.JLabel bp3;
    private javax.swing.JLabel bs1;
    private javax.swing.JLabel bs2;
    private javax.swing.JLabel bs3;
    private javax.swing.JLabel es1;
    private javax.swing.JLabel es2;
    private javax.swing.JLabel es3;
    private javax.swing.JLabel gula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel jma1;
    private javax.swing.JLabel jma2;
    private javax.swing.JLabel jma3;
    private javax.swing.JLabel jme1;
    private javax.swing.JLabel jme2;
    private javax.swing.JLabel jme3;
    private javax.swing.JLabel jp1;
    private javax.swing.JLabel jp2;
    private javax.swing.JLabel jp3;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js2;
    private javax.swing.JLabel js3;
    private javax.swing.JLabel ka1;
    private javax.swing.JLabel ka2;
    private javax.swing.JLabel ka3;
    private javax.swing.JLabel km1;
    private javax.swing.JLabel km2;
    private javax.swing.JLabel km3;
    private javax.swing.JLabel kp1;
    private javax.swing.JLabel kp2;
    private javax.swing.JLabel kp3;
    private javax.swing.JLabel mangga1;
    private javax.swing.JLabel mangga2;
    private javax.swing.JLabel mangga3;
    private javax.swing.JLabel mayo;
    private javax.swing.JLabel melon1;
    private javax.swing.JLabel melon2;
    private javax.swing.JLabel melon3;
    private javax.swing.JLabel mentega;
    private javax.swing.JLabel minyak;
    private javax.swing.JButton next;
    private javax.swing.JFrame nextgudang;
    private javax.swing.JButton nextproduk;
    private javax.swing.JLabel pisang1;
    private javax.swing.JLabel pisang2;
    private javax.swing.JLabel pisang3;
    private javax.swing.JButton prevbuah;
    private javax.swing.JButton previous;
    private javax.swing.JLabel salad1;
    private javax.swing.JLabel salad2;
    private javax.swing.JLabel salad3;
    private javax.swing.JLabel sale1;
    private javax.swing.JLabel sale2;
    private javax.swing.JLabel sale3;
    private javax.swing.JLabel semangka1;
    private javax.swing.JLabel semangka2;
    private javax.swing.JLabel semangka3;
    private javax.swing.JLabel sirup;
    private javax.swing.JLabel sp;
    private javax.swing.JLabel susu;
    private javax.swing.JLabel tb;
    private javax.swing.JLabel telur;
    private javax.swing.JLabel tt;
    private javax.swing.JFrame vbahan;
    // End of variables declaration//GEN-END:variables
}
