/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Farisya
 */
public class buahagiashop extends javax.swing.JFrame {

    /**
     * Creates new form buahagiashop
     */
    public buahagiashop() {
        initComponents();
        popup.setLocationRelativeTo(this);
    }

    public JFrame detail1() {
        return detail1;
    }

    public JFrame detail2() {
        return detail2;
    }

    public void klikKembali(ActionListener a) {
        back.addActionListener(a);
    }

    public void klikDetail1(ActionListener a) {
        detil.addActionListener(a);
    }

    public void klikDetail2(ActionListener a) {
        detail.addActionListener(a);
    }

    public void klikClose(ActionListener a) {
        close.addActionListener(a);
        tutup.addActionListener(a);
    }

    public void klikNext(ActionListener a) {
        next.addActionListener(a);
    }

    public void klikPrevious(ActionListener a) {
        previous.addActionListener(a);
    }

    public void klikBatal(ActionListener a) {
        batal.addActionListener(a);
    }

    public void klikJual(ActionListener a) {
        jual.addActionListener(a);
    }

    public void klikKanan(ActionListener a) {
        right.addActionListener(a);
    }

    public void klikKiri(ActionListener a) {
        left.addActionListener(a);
    }

    public void klikTambah(ActionListener a) {
        add.addActionListener(a);
    }

    public void klikMin(ActionListener a) {
        min.addActionListener(a);
    }

    public void klikSaladBuah(ActionListener a) {
        btn_salad.addActionListener(a);
    }

    public void klikEsBuah(ActionListener a) {
        btn_es.addActionListener(a);
    }

    public void klikBrownisPisang(ActionListener a) {
        btn_bp.addActionListener(a);
    }

    public void klikBrownisSemangka(ActionListener a) {
        btn_bs.addActionListener(a);
    }

    public void klikBrownisMangga(ActionListener a) {
        btn_bma.addActionListener(a);
    }

    public void klikBrownisMelon(ActionListener a) {
        btn_bme.addActionListener(a);
    }

    public void klikBrownisApel(ActionListener a) {
        btn_ba.addActionListener(a);
    }

    public void klikJusApel(ActionListener a) {
        btn_ja.addActionListener(a);
    }

    public void klikJusPisang(ActionListener a) {
        btn_jp.addActionListener(a);
    }

    public void klikJusSemangka(ActionListener a) {
        btn_js.addActionListener(a);
    }

    public void klikJusMangga(ActionListener a) {
        btn_jma.addActionListener(a);
    }

    public void klikJusMelon(ActionListener a) {
        btn_jme.addActionListener(a);
    }

    public void klikKripikMangga(ActionListener a) {
        btn_km.addActionListener(a);
    }

    public void klikKripikPisang(ActionListener a) {
        btn_kp.addActionListener(a);
    }

    public void klikKripikApel(ActionListener a) {
        btn_ka.addActionListener(a);
    }

    public void klikSale(ActionListener a) {
        btn_sale.addActionListener(a);
    }

    public JLabel setGambar() {
        return gbr;
    }

    public int setJmlUang(int text) {
        this.uang.setText(text + "");
        this.aset.setText(text + ""); 
        return text;
    }

    public void setStokProduk(int ba,int bp, int bs, int bme,int bma, 
            int ka,int kp, int km, int jp, int jma, int jme, int js, int ja,
            int es,int sb, int sale) {
        setJmlBrownisApel(ba);
        setJmlBrownisMangga(bma);
        setJmlBrownisMelon(bme);
        setJmlBrownisPisang(bp);
        setJmlBrownisSemangka(bs);
        setJmlJusApel(ja);
        setJmlJusMangga(jma);
        setJmlJusMelon(jme);
        setJmlJusPisang(jp);
        setJmlJusSemangka(js);
        setJmlKripikApel(ka);
        setJmlKripikMangga(km);
        setJmlKripikPisang(kp);
        setJmlEs(es);
        setJmlSalad(sb);
        setJmlSale(sale);
    }

    public int setJmlKripikApel(int text) {
        this.jml_ka.setText(text + "");
        return text;
    }

    public int setJmlKripikMangga(int text) {
        this.jml_km.setText(text + "");
        return text;
    }

    public int setJmlKripikPisang(int text) {
        this.jml_kp.setText(text + "");
        return text;
    }

    public int setJmlBrownisApel(int text) {
        this.jml_ba.setText(text + "");
        return text;
    }

    public int setJmlBrownisMangga(int text) {
        this.jml_bma.setText(text + "");
        return text;
    }

    public int setJmlBrownisMelon(int text) {
        this.jml_bme.setText(text + "");
        return text;
    }

    public int setJmlBrownisPisang(int text) {
        this.jml_bp.setText(text + "");
        return text;
    }

    public int setJmlBrownisSemangka(int text) {
        this.jml_bs.setText(text + "");
        return text;
    }

    public int setJmlJusApel(int text) {
        this.jml_ja.setText(text + "");
        return text;
    }

    public int setJmlJusMelon(int text) {
        this.jml_jme.setText(text + "");
        return text;
    }

    public int setJmlJusSemangka(int text) {
        this.jml_js.setText(text + "");
        return text;
    }

    public int setJmlJusPisang(int text) {
        this.jml_jp.setText(text + "");
        return text;
    }

    public int setJmlJusMangga(int text) {
        this.jml_jma.setText(text + "");
        return text;
    }

    public int setJmlSale(int text) {
        this.jml_sale.setText(text + "");
        return text;
    }

    public int setJmlSalad(int text) {
        this.jml_salad.setText(text + "");
        return text;
    }

    public int setJmlEs(int text) {
        this.jml_es.setText(text + "");
        return text;
    }

    public int setBrownisMe1Terjual(int text) {
        this.bme1.setText(text + "");
        return text;
    }

    public int setBrownisMe2Terjual(int text) {
        this.bme2.setText(text + "");
        return text;
    }

    public int setBrownisMe3Terjual(int text) {
        this.bme3.setText(text + "");
        return text;
    }

    public int setBrownisMa1Terjual(int text) {
        this.bma1.setText(text + "");
        return text;
    }

    public int setBrownisMa2Terjual(int text) {
        this.bma2.setText(text + "");
        return text;
    }

    public int setBrownisMa3Terjual(int text) {
        this.bma3.setText(text + "");
        return text;
    }

    public int setBrownisA1Terjual(int text) {
        this.ba1.setText(text + "");
        return text;
    }

    public int setBrownisA2Terjual(int text) {
        this.ba2.setText(text + "");
        return text;
    }

    public int setBrownisA3Terjual(int text) {
        this.ba3.setText(text + "");
        return text;
    }

    public int setBrownisS1Terjual(int text) {
        this.bs1.setText(text + "");
        return text;
    }

    public int setBrownisS2Terjual(int text) {
        this.bs2.setText(text + "");
        return text;
    }

    public int setBrownisS3Terjual(int text) {
        this.bs3.setText(text + "");
        return text;
    }

    public int setBrownisP1Terjual(int text) {
        this.bp1.setText(text + "");
        return text;
    }

    public int setBrownisP2Terjual(int text) {
        this.bp2.setText(text + "");
        return text;
    }

    public int setBrownisP3Terjual(int text) {
        this.bp3.setText(text + "");
        return text;
    }

    public int setJusA1Terjual(int text) {
        this.ja1.setText(text + "");
        return text;
    }

    public int setJusA2Terjual(int text) {
        this.ja2.setText(text + "");
        return text;
    }

    public int setJusA3Terjual(int text) {
        this.ja3.setText(text + "");
        return text;
    }

    public int setJusP1Terjual(int text) {
        this.jp1.setText(text + "");
        return text;
    }

    public int setJusP2Terjual(int text) {
        this.jp2.setText(text + "");
        return text;
    }

    public int setJusP3Terjual(int text) {
        this.jp3.setText(text + "");
        return text;
    }

    public int setJusS1Terjual(int text) {
        this.js1.setText(text + "");
        return text;
    }

    public int setJusS2Terjual(int text) {
        this.js2.setText(text + "");
        return text;
    }

    public int setJusS3Terjual(int text) {
        this.js3.setText(text + "");
        return text;
    }

    public int setJusMe1Terjual(int text) {
        this.jme1.setText(text + "");
        return text;
    }

    public int setJusMe2Terjual(int text) {
        this.jme2.setText(text + "");
        return text;
    }

    public int setJusMe3Terjual(int text) {
        this.jme3.setText(text + "");
        return text;
    }

    public int setJusMa1Terjual(int text) {
        this.jma1.setText(text + "");
        return text;
    }

    public int setJusMa2Terjual(int text) {
        this.jma2.setText(text + "");
        return text;
    }

    public int setJusMa3Terjual(int text) {
        this.jma3.setText(text + "");
        return text;
    }

    public int setKripikA1Terjual(int text) {
        this.ka1.setText(text + "");
        return text;
    }

    public int setKripikA2Terjual(int text) {
        this.ka2.setText(text + "");
        return text;
    }

    public int setKripikA3Terjual(int text) {
        this.ka3.setText(text + "");
        return text;
    }

    public int setKripikP1Terjual(int text) {
        this.kp1.setText(text + "");
        return text;
    }

    public int setKripikP2Terjual(int text) {
        this.kp2.setText(text + "");
        return text;
    }

    public int setKripikP3Terjual(int text) {
        this.kp3.setText(text + "");
        return text;
    }

    public int setKripikM1Terjual(int text) {
        this.km1.setText(text + "");
        return text;
    }

    public int setKripikM2Terjual(int text) {
        this.km2.setText(text + "");
        return text;
    }

    public int setKripikM3Terjual(int text) {
        this.km3.setText(text + "");
        return text;
    }

    public int setEsBuah1Terjual(int text) {
        this.es1.setText(text + "");
        return text;
    }

    public int setEsBuah2Terjual(int text) {
        this.es2.setText(text + "");
        return text;
    }

    public int setEsBuah3Terjual(int text) {
        this.es3.setText(text + "");
        return text;
    }

    public int setSalad1Terjual(int text) {
        this.salad1.setText(text + "");
        return text;
    }

    public int setSalad2Terjual(int text) {
        this.salad2.setText(text + "");
        return text;
    }

    public int setSalad3Terjual(int text) {
        this.salad3.setText(text + "");
        return text;
    }

    public int setSale1Terjual(int text) {
        this.sale1.setText(text + "");
        return text;
    }

    public int setSale2Terjual(int text) {
        this.sale2.setText(text + "");
        return text;
    }

    public int setSale3Terjual(int text) {
        this.sale3.setText(text + "");
        return text;
    }

    public int setTotBrownisMe1() {
        String cb = bme1.getText();
        int tot = Integer.valueOf(cb) * 18000;
        this.totbme1.setText(tot + "");
        return tot;
    }

    public int setTotBrownisMe2() {
        String cb = bme2.getText();
        int tot = Integer.valueOf(cb) * 15000;
        this.totbme2.setText(tot + "");
        return tot;
    }

    public int setTotBrownisMe3() {
        String cb = bme3.getText();
        int tot = Integer.valueOf(cb) * 13000;
        this.totbme3.setText(tot + "");
        return tot;
    }

    public int setTotBrownisMa1() {
        String cb = bma1.getText();
        int tot = Integer.valueOf(cb) * 20000;
        this.totbma1.setText(tot + "");
        return tot;
    }

    public int setTotBrownisMa2() {
        String cb = bma2.getText();
        int tot = Integer.valueOf(cb) * 18000;
        this.totbma2.setText(tot + "");
        return tot;
    }

    public int setTotBrownisMa3() {
        String cb = bma3.getText();
        int tot = Integer.valueOf(cb) * 17000;
        this.totbma3.setText(tot + "");
        return tot;
    }

    public int setTotBrownisP1() {
        String cb = bp1.getText();
        int tot = Integer.valueOf(cb) * 32000;
        this.totbp1.setText(tot + "");
        return tot;
    }

    public int setTotBrownisP2() {
        String cb = bp2.getText();
        int tot = Integer.valueOf(cb) * 26000;
        this.totbp2.setText(tot + "");
        return tot;
    }

    public int setTotBrownisP3() {
        String cb = bp3.getText();
        int tot = Integer.valueOf(cb) * 20000;
        this.totbp3.setText(tot + "");
        return tot;
    }

    public int setTotBrownisS1() {
        String cb = bs1.getText();
        int tot = Integer.valueOf(cb) * 17000;
        this.totbs1.setText(tot + "");
        return tot;
    }

    public int setTotBrownisS2() {
        String cb = bs2.getText();
        int tot = Integer.valueOf(cb) * 15000;
        this.totbs2.setText(tot + "");
        return tot;
    }

    public int setTotBrownisS3() {
        String cb = bs3.getText();
        int tot = Integer.valueOf(cb) * 13000;
        this.totbs3.setText(tot + "");
        return tot;
    }

    public int setTotBrownisA1() {
        String cb = ba1.getText();
        int tot = Integer.valueOf(cb) * 30000;
        this.totba1.setText(tot + "");
        return tot;
    }

    public int setTotBrownisA2() {
        String cb = ba2.getText();
        int tot = Integer.valueOf(cb) * 27000;
        this.totba2.setText(tot + "");
        return tot;
    }

    public int setTotBrownisA3() {
        String cb = ba3.getText();
        int tot = Integer.valueOf(cb) * 25000;
        this.totba3.setText(tot + "");
        return tot;
    }

    public int setTotJusA1() {
        String cb = ja1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totja1.setText(tot + "");
        return tot;
    }

    public int setTotJusA2() {
        String cb = ja2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totja2.setText(tot + "");
        return tot;
    }

    public int setTotJusA3() {
        String cb = ja3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totja3.setText(tot + "");
        return tot;
    }

    public int setTotJusMe1() {
        String cb = jme1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totjme1.setText(tot + "");
        return tot;
    }

    public int setTotJusMe2() {
        String cb = jme2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totjme2.setText(tot + "");
        return tot;
    }

    public int setTotJusMe3() {
        String cb = jme3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totjme3.setText(tot + "");
        return tot;
    }

    public int setTotJusMa1() {
        String cb = jma1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totjma1.setText(tot + "");
        return tot;
    }

    public int setTotJusMa2() {
        String cb = jma2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totjma2.setText(tot + "");
        return tot;
    }

    public int setTotJusMa3() {
        String cb = jma3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totjma3.setText(tot + "");
        return tot;
    }

    public int setTotJusS1() {
        String cb = js1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totjs1.setText(tot + "");
        return tot;
    }

    public int setTotJusS2() {
        String cb = js2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totjs2.setText(tot + "");
        return tot;
    }

    public int setTotJusS3() {
        String cb = js3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totjs3.setText(tot + "");
        return tot;
    }

    public int setTotJusP1() {
        String cb = jp1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totjp1.setText(tot + "");
        return tot;
    }

    public int setTotJusP2() {
        String cb = jp2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totjp2.setText(tot + "");
        return tot;
    }

    public int setTotJusP3() {
        String cb = jp3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totjp3.setText(tot + "");
        return tot;
    }

    public int setTotKripikP1() {
        String cb = kp1.getText();
        int tot = Integer.valueOf(cb) * 32000;
        this.totkp1.setText(tot + "");
        return tot;
    }

    public int setTotKripikP2() {
        String cb = kp2.getText();
        int tot = Integer.valueOf(cb) * 26000;
        this.totkp2.setText(tot + "");
        return tot;
    }

    public int setTotKripikP3() {
        String cb = kp3.getText();
        int tot = Integer.valueOf(cb) * 20000;
        this.totkp3.setText(tot + "");
        return tot;
    }

    public int setTotKripikA1() {
        String cb = ka1.getText();
        int tot = Integer.valueOf(cb) * 35000;
        this.totka1.setText(tot + "");
        return tot;
    }

    public int setTotKripikA2() {
        String cb = ka2.getText();
        int tot = Integer.valueOf(cb) * 30000;
        this.totka2.setText(tot + "");
        return tot;
    }

    public int setTotKripikA3() {
        String cb = ka3.getText();
        int tot = Integer.valueOf(cb) * 25000;
        this.totka3.setText(tot + "");
        return tot;
    }

    public int setTotKripikM1() {
        String cb = km1.getText();
        int tot = Integer.valueOf(cb) * 30000;
        this.totkm1.setText(tot + "");
        return tot;
    }

    public int setTotKripikM2() {
        String cb = km2.getText();
        int tot = Integer.valueOf(cb) * 25000;
        this.totkm2.setText(tot + "");
        return tot;
    }

    public int setTotKripikM3() {
        String cb = km3.getText();
        int tot = Integer.valueOf(cb) * 20000;
        this.totkm3.setText(tot + "");
        return tot;
    }

    public int setTotEs1() {
        String cb = es1.getText();
        int tot = Integer.valueOf(cb) * 6000;
        this.totes1.setText(tot + "");
        return tot;
    }

    public int setTotEs2() {
        String cb = es2.getText();
        int tot = Integer.valueOf(cb) * 5000;
        this.totes2.setText(tot + "");
        return tot;
    }

    public int setTotEs3() {
        String cb = es3.getText();
        int tot = Integer.valueOf(cb) * 4000;
        this.totes3.setText(tot + "");
        return tot;
    }

    public int setTotSalad1() {
        String cb = salad1.getText();
        int tot = Integer.valueOf(cb) * 10000;
        this.totsalad1.setText(tot + "");
        return tot;
    }

    public int setTotSalad2() {
        String cb = salad2.getText();
        int tot = Integer.valueOf(cb) * 9000;
        this.totsalad2.setText(tot + "");
        return tot;
    }

    public int setTotSalad3() {
        String cb = salad3.getText();
        int tot = Integer.valueOf(cb) * 8000;
        this.totsalad3.setText(tot + "");
        return tot;
    }

    public int setTotSale1() {
        String cb = sale1.getText();
        int tot = Integer.valueOf(cb) * 45000;
        this.totsale1.setText(tot + "");
        return tot;
    }

    public int setTotSale2() {
        String cb = sale2.getText();
        int tot = Integer.valueOf(cb) * 43000;
        this.totsale2.setText(tot + "");
        return tot;
    }

    public int setTotSale3() {
        String cb = sale3.getText();
        int tot = Integer.valueOf(cb) * 40000;
        this.totsale3.setText(tot + "");
        return tot;
    }

    public void setHarga(String text) {
        this.harga.setText(text + "");
    }

    public void setKualitas(String text) {
        this.kualitas.setText(text + "");
    }

    public void setJumlah(String text) {
        this.jml.setText(text + "");
    }

    public int setStok(int text) {
        this.stok.setText("Stok : " + text);
        return text;
    }

    public int getTeksJumlah() {
        String hasil = jml.getText();
        return Integer.valueOf(hasil);
    }

    public int getTeksHarga() {
        String hasil = harga.getText();
        return Integer.valueOf(hasil);
    }

    public String getKualitas() {
        return kualitas.getText();
    }

    public String getJmlUang() {
        String a = this.uang.getText();
        String b = this.aset.getText();
        String get[] = {a, b};
        String hasil = null;
        for (int i = 0; i < 2; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public JFrame shop2() {
        return this.nextshop;
    }

    public JFrame popup() {
        return this.popup;
    }

    public void tampilPesan(Component c, String pesan) {
        JOptionPane.showMessageDialog(popup, pesan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextshop = new javax.swing.JFrame();
        btn_jp = new javax.swing.JButton();
        btn_jme = new javax.swing.JButton();
        btn_ja = new javax.swing.JButton();
        btn_km = new javax.swing.JButton();
        btn_ka = new javax.swing.JButton();
        btn_jma = new javax.swing.JButton();
        btn_js = new javax.swing.JButton();
        btn_kp = new javax.swing.JButton();
        aset = new javax.swing.JLabel();
        jml_js = new javax.swing.JLabel();
        jml_jme = new javax.swing.JLabel();
        jml_ja = new javax.swing.JLabel();
        jml_km = new javax.swing.JLabel();
        jml_kp = new javax.swing.JLabel();
        jml_jma = new javax.swing.JLabel();
        jml_jp = new javax.swing.JLabel();
        jml_ka = new javax.swing.JLabel();
        previous = new javax.swing.JButton();
        detail = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        popup = new javax.swing.JFrame();
        gbr = new javax.swing.JLabel();
        jml = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        min = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jual = new javax.swing.JButton();
        kualitas = new javax.swing.JLabel();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        harga = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        detail1 = new javax.swing.JFrame();
        bp1 = new javax.swing.JLabel();
        bp2 = new javax.swing.JLabel();
        bp3 = new javax.swing.JLabel();
        bme3 = new javax.swing.JLabel();
        bme2 = new javax.swing.JLabel();
        bme1 = new javax.swing.JLabel();
        bs1 = new javax.swing.JLabel();
        bs2 = new javax.swing.JLabel();
        bs3 = new javax.swing.JLabel();
        bma1 = new javax.swing.JLabel();
        bma2 = new javax.swing.JLabel();
        bma3 = new javax.swing.JLabel();
        salad1 = new javax.swing.JLabel();
        salad2 = new javax.swing.JLabel();
        salad3 = new javax.swing.JLabel();
        sale3 = new javax.swing.JLabel();
        sale2 = new javax.swing.JLabel();
        sale1 = new javax.swing.JLabel();
        es3 = new javax.swing.JLabel();
        es2 = new javax.swing.JLabel();
        es1 = new javax.swing.JLabel();
        ba3 = new javax.swing.JLabel();
        ba2 = new javax.swing.JLabel();
        ba1 = new javax.swing.JLabel();
        totba1 = new javax.swing.JLabel();
        totba2 = new javax.swing.JLabel();
        totba3 = new javax.swing.JLabel();
        totes3 = new javax.swing.JLabel();
        totes2 = new javax.swing.JLabel();
        totes1 = new javax.swing.JLabel();
        totbme3 = new javax.swing.JLabel();
        totbme2 = new javax.swing.JLabel();
        totbme1 = new javax.swing.JLabel();
        totbp1 = new javax.swing.JLabel();
        totbp2 = new javax.swing.JLabel();
        totbp3 = new javax.swing.JLabel();
        totsale3 = new javax.swing.JLabel();
        totsale2 = new javax.swing.JLabel();
        totsale1 = new javax.swing.JLabel();
        totbs3 = new javax.swing.JLabel();
        totbs2 = new javax.swing.JLabel();
        totbs1 = new javax.swing.JLabel();
        totsalad3 = new javax.swing.JLabel();
        totsalad2 = new javax.swing.JLabel();
        totsalad1 = new javax.swing.JLabel();
        totbma3 = new javax.swing.JLabel();
        totbma2 = new javax.swing.JLabel();
        totbma1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        detail2 = new javax.swing.JFrame();
        tutup = new javax.swing.JButton();
        jp1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JLabel();
        totjp3 = new javax.swing.JLabel();
        totjp2 = new javax.swing.JLabel();
        totjp1 = new javax.swing.JLabel();
        jme1 = new javax.swing.JLabel();
        jme2 = new javax.swing.JLabel();
        jme3 = new javax.swing.JLabel();
        totjme3 = new javax.swing.JLabel();
        totjme2 = new javax.swing.JLabel();
        totjme1 = new javax.swing.JLabel();
        js1 = new javax.swing.JLabel();
        js2 = new javax.swing.JLabel();
        js3 = new javax.swing.JLabel();
        totjs1 = new javax.swing.JLabel();
        totjs2 = new javax.swing.JLabel();
        totjs3 = new javax.swing.JLabel();
        totkm1 = new javax.swing.JLabel();
        totkm2 = new javax.swing.JLabel();
        totkm3 = new javax.swing.JLabel();
        km3 = new javax.swing.JLabel();
        km2 = new javax.swing.JLabel();
        km1 = new javax.swing.JLabel();
        totka3 = new javax.swing.JLabel();
        totka2 = new javax.swing.JLabel();
        totka1 = new javax.swing.JLabel();
        ka1 = new javax.swing.JLabel();
        ka2 = new javax.swing.JLabel();
        ka3 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        ja2 = new javax.swing.JLabel();
        ja1 = new javax.swing.JLabel();
        totja1 = new javax.swing.JLabel();
        totja2 = new javax.swing.JLabel();
        totja3 = new javax.swing.JLabel();
        totkp3 = new javax.swing.JLabel();
        totkp2 = new javax.swing.JLabel();
        totkp1 = new javax.swing.JLabel();
        kp1 = new javax.swing.JLabel();
        kp2 = new javax.swing.JLabel();
        kp3 = new javax.swing.JLabel();
        totjma3 = new javax.swing.JLabel();
        totjma2 = new javax.swing.JLabel();
        totjma1 = new javax.swing.JLabel();
        jma1 = new javax.swing.JLabel();
        jma2 = new javax.swing.JLabel();
        jma3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_bp = new javax.swing.JButton();
        btn_bs = new javax.swing.JButton();
        btn_bme = new javax.swing.JButton();
        btn_sale = new javax.swing.JButton();
        btn_es = new javax.swing.JButton();
        btn_bma = new javax.swing.JButton();
        btn_ba = new javax.swing.JButton();
        btn_salad = new javax.swing.JButton();
        uang = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jml_bp = new javax.swing.JLabel();
        jml_bme = new javax.swing.JLabel();
        jml_bs = new javax.swing.JLabel();
        jml_ba = new javax.swing.JLabel();
        jml_bma = new javax.swing.JLabel();
        jml_salad = new javax.swing.JLabel();
        jml_sale = new javax.swing.JLabel();
        jml_es = new javax.swing.JLabel();
        detil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        nextshop.setUndecorated(true);
        nextshop.setSize(new java.awt.Dimension(1366, 768));
        nextshop.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_jp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/juspisang.png"))); // NOI18N
        btn_jp.setBorder(null);
        btn_jp.setBorderPainted(false);
        btn_jp.setContentAreaFilled(false);
        btn_jp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 140));
        btn_jp.setEnabled(true);

        btn_jme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusmelon.png"))); // NOI18N
        btn_jme.setBorder(null);
        btn_jme.setBorderPainted(false);
        btn_jme.setContentAreaFilled(false);
        btn_jme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jme.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_jme, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 161, 160, 130));
        btn_jme.setEnabled(true);

        btn_ja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusapel.png"))); // NOI18N
        btn_ja.setBorder(null);
        btn_ja.setBorderPainted(false);
        btn_ja.setContentAreaFilled(false);
        btn_ja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ja.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_ja, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 160, 130));
        btn_ja.setEnabled(true);

        btn_km.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikmangga.png"))); // NOI18N
        btn_km.setBorder(null);
        btn_km.setBorderPainted(false);
        btn_km.setContentAreaFilled(false);
        btn_km.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_km.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_km.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 150, 140));
        btn_km.setEnabled(true);

        btn_ka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikapel.png"))); // NOI18N
        btn_ka.setBorder(null);
        btn_ka.setBorderPainted(false);
        btn_ka.setContentAreaFilled(false);
        btn_ka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ka.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ka.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_ka, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 160, 140));
        btn_ka.setEnabled(true);

        btn_jma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusmangga.png"))); // NOI18N
        btn_jma.setBorder(null);
        btn_jma.setBorderPainted(false);
        btn_jma.setContentAreaFilled(false);
        btn_jma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jma.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_jma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 395, 160, 130));
        btn_jma.setEnabled(true);

        btn_js.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jussemangka.png"))); // NOI18N
        btn_js.setBorder(null);
        btn_js.setBorderPainted(false);
        btn_js.setContentAreaFilled(false);
        btn_js.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_js.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_js.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_js, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 160, 130));
        btn_js.setEnabled(true);

        btn_kp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikpisang.png"))); // NOI18N
        btn_kp.setBorder(null);
        btn_kp.setBorderPainted(false);
        btn_kp.setContentAreaFilled(false);
        btn_kp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_kp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextshop.getContentPane().add(btn_kp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 389, 160, 140));
        btn_kp.setEnabled(true);

        aset.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        aset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextshop.getContentPane().add(aset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 160, 210, 40));

        jml_js.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_js.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_js.setText("0");
        nextshop.getContentPane().add(jml_js, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 30, -1));

        jml_jme.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_jme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_jme.setText("0");
        nextshop.getContentPane().add(jml_jme, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 390, 30, -1));

        jml_ja.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_ja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_ja.setText("0");
        nextshop.getContentPane().add(jml_ja, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 470, 30, -1));

        jml_km.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_km.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_km.setText("0");
        nextshop.getContentPane().add(jml_km, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 30, -1));

        jml_kp.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_kp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_kp.setText("0");
        nextshop.getContentPane().add(jml_kp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 390, 30, -1));

        jml_jma.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_jma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_jma.setText("0");
        nextshop.getContentPane().add(jml_jma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 310, 30, -1));

        jml_jp.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_jp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_jp.setText("0");
        nextshop.getContentPane().add(jml_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 550, 30, -1));

        jml_ka.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jml_ka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_ka.setText("0");
        nextshop.getContentPane().add(jml_ka, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 550, 30, -1));

        previous.setBorder(null);
        previous.setBorderPainted(false);
        previous.setContentAreaFilled(false);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextshop.getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 100, 80));

        detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/simboldetail.png"))); // NOI18N
        detail.setBorder(null);
        detail.setBorderPainted(false);
        detail.setContentAreaFilled(false);
        detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextshop.getContentPane().add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 650, 80, -1));

        jLabel5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detail Penjualan");
        nextshop.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 720, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/shop2.png"))); // NOI18N
        nextshop.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        popup.setUndecorated(true);
        popup.setSize(new java.awt.Dimension(587, 629));
        popup.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gbr.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        popup.getContentPane().add(gbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, 130));

        jml.setBackground(new java.awt.Color(255, 255, 204));
        jml.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        jml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jml.setText("1");
        jml.setBorder(null);
        jml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlActionPerformed(evt);
            }
        });
        popup.getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 281, 230, 90));

        add.setBorder(null);
        add.setBorderPainted(false);
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 293, 60, 70));

        min.setBorder(null);
        min.setBorderPainted(false);
        min.setContentAreaFilled(false);
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 293, 70, 70));

        batal.setBorder(null);
        batal.setBorderPainted(false);
        batal.setContentAreaFilled(false);
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 503, 160, 60));

        jual.setBorder(null);
        jual.setBorderPainted(false);
        jual.setContentAreaFilled(false);
        jual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 503, 160, 60));

        kualitas.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        kualitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kualitas.setText("jLabel4");
        popup.getContentPane().add(kualitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 80, 70, -1));

        left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/left.png"))); // NOI18N
        left.setBorder(null);
        left.setBorderPainted(false);
        left.setContentAreaFilled(false);
        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/right.png"))); // NOI18N
        right.setBorder(null);
        right.setBorderPainted(false);
        right.setContentAreaFilled(false);
        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        harga.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        harga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        harga.setText("jLabel4");
        popup.getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        stok.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        stok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        popup.getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 20));
        popup.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/popupjual.png"))); // NOI18N
        popup.getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        detail1.setUndecorated(true);
        detail1.setSize(new java.awt.Dimension(1366, 768));
        detail1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp1.setText("0");
        detail1.getContentPane().add(bp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 40, 20));

        bp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp2.setText("0");
        detail1.getContentPane().add(bp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 312, 40, 20));

        bp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bp3.setText("0");
        detail1.getContentPane().add(bp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 372, 40, 20));

        bme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme3.setText("0");
        detail1.getContentPane().add(bme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 372, 40, 20));

        bme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme2.setText("0");
        detail1.getContentPane().add(bme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 312, 40, 20));

        bme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bme1.setText("0");
        detail1.getContentPane().add(bme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 40, 20));

        bs1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs1.setText("0");
        detail1.getContentPane().add(bs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 50, 20));

        bs2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs2.setText("0");
        detail1.getContentPane().add(bs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 50, 20));

        bs3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bs3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bs3.setText("0");
        detail1.getContentPane().add(bs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 50, 20));

        bma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma1.setText("0");
        detail1.getContentPane().add(bma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 50, 20));

        bma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma2.setText("0");
        detail1.getContentPane().add(bma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 312, 50, 20));

        bma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        bma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bma3.setText("0");
        detail1.getContentPane().add(bma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 372, 50, 20));

        salad1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        salad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad1.setText("0");
        detail1.getContentPane().add(salad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, 50, 20));

        salad2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        salad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad2.setText("0");
        detail1.getContentPane().add(salad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 622, 50, 20));

        salad3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        salad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salad3.setText("0");
        detail1.getContentPane().add(salad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 680, 50, 20));

        sale3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        sale3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale3.setText("0");
        detail1.getContentPane().add(sale3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 682, 50, 20));

        sale2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        sale2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale2.setText("0");
        detail1.getContentPane().add(sale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 50, 20));

        sale1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        sale1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale1.setText("0");
        detail1.getContentPane().add(sale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 40, 20));

        es3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        es3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es3.setText("0");
        detail1.getContentPane().add(es3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 682, 40, 20));

        es2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        es2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es2.setText("0");
        detail1.getContentPane().add(es2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 40, 20));

        es1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        es1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es1.setText("0");
        detail1.getContentPane().add(es1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 40, 20));

        ba3.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        ba3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba3.setText("0");
        detail1.getContentPane().add(ba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 50, 20));

        ba2.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        ba2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba2.setText("0");
        detail1.getContentPane().add(ba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 50, 20));

        ba1.setFont(new java.awt.Font("DFPOP1-W9", 0, 11)); // NOI18N
        ba1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ba1.setText("0");
        detail1.getContentPane().add(ba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 50, 20));

        totba1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totba1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totba1.setText("0");
        detail1.getContentPane().add(totba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 562, 120, 20));

        totba2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totba2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totba2.setText("0");
        detail1.getContentPane().add(totba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 622, 100, 20));

        totba3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totba3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totba3.setText("0");
        detail1.getContentPane().add(totba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 100, 20));

        totes3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totes3.setText("0");
        detail1.getContentPane().add(totes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 682, 110, 20));

        totes2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totes2.setText("0");
        detail1.getContentPane().add(totes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 110, 20));

        totes1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totes1.setText("0");
        detail1.getContentPane().add(totes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 110, 20));

        totbme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbme3.setText("0");
        detail1.getContentPane().add(totbme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 372, 110, 20));

        totbme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbme2.setText("0");
        detail1.getContentPane().add(totbme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 312, 110, 20));

        totbme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbme1.setText("0");
        detail1.getContentPane().add(totbme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 110, 20));

        totbp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbp1.setText("0");
        detail1.getContentPane().add(totbp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 250, 110, 20));

        totbp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbp2.setText("0");
        detail1.getContentPane().add(totbp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 313, 100, 20));

        totbp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbp3.setText("0");
        detail1.getContentPane().add(totbp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 100, 20));

        totsale3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsale3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsale3.setText("0");
        detail1.getContentPane().add(totsale3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 110, 20));

        totsale2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsale2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsale2.setText("0");
        detail1.getContentPane().add(totsale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 110, 20));

        totsale1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsale1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsale1.setText("0");
        detail1.getContentPane().add(totsale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 110, 20));

        totbs3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbs3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbs3.setText("0");
        detail1.getContentPane().add(totbs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 110, 20));

        totbs2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbs2.setText("0");
        detail1.getContentPane().add(totbs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 313, 110, 20));

        totbs1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbs1.setText("0");
        detail1.getContentPane().add(totbs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 110, 20));

        totsalad3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsalad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsalad3.setText("0");
        detail1.getContentPane().add(totsalad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 683, 100, 20));

        totsalad2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsalad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsalad2.setText("0");
        detail1.getContentPane().add(totsalad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 620, 100, 20));

        totsalad1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totsalad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totsalad1.setText("0");
        detail1.getContentPane().add(totsalad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 100, 20));

        totbma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbma3.setText("0");
        detail1.getContentPane().add(totbma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 373, 100, 20));

        totbma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbma2.setText("0");
        detail1.getContentPane().add(totbma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 310, 100, 20));

        totbma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totbma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totbma1.setText("0");
        detail1.getContentPane().add(totbma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 253, 110, 20));

        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detail1.getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1243, 33, 80, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailpenjualan1.png"))); // NOI18N
        detail1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        detail2.setUndecorated(true);
        detail2.setSize(new java.awt.Dimension(1366, 768));
        detail2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tutup.setBorder(null);
        tutup.setBorderPainted(false);
        tutup.setContentAreaFilled(false);
        tutup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detail2.getContentPane().add(tutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1251, 33, 70, 60));

        jp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp1.setText("0");
        detail2.getContentPane().add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 20));

        jp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp2.setText("0");
        detail2.getContentPane().add(jp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, 20));

        jp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jp3.setText("0");
        detail2.getContentPane().add(jp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 40, 20));

        totjp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjp3.setText("0");
        detail2.getContentPane().add(totjp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 100, 20));

        totjp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjp2.setText("0");
        detail2.getContentPane().add(totjp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 100, 20));

        totjp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjp1.setText("0");
        detail2.getContentPane().add(totjp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 100, 20));

        jme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme1.setText("0");
        detail2.getContentPane().add(jme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 40, 20));

        jme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme2.setText("0");
        detail2.getContentPane().add(jme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 40, 20));

        jme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jme3.setText("0");
        detail2.getContentPane().add(jme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 40, 20));

        totjme3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjme3.setText("0");
        detail2.getContentPane().add(totjme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 110, 20));

        totjme2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjme2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjme2.setText("0");
        detail2.getContentPane().add(totjme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 110, 20));

        totjme1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjme1.setText("0");
        detail2.getContentPane().add(totjme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 110, 20));

        js1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        js1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js1.setText("0");
        detail2.getContentPane().add(js1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 253, 50, 20));

        js2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        js2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js2.setText("0");
        detail2.getContentPane().add(js2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 313, 50, 20));

        js3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        js3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        js3.setText("0");
        detail2.getContentPane().add(js3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 373, 50, 20));

        totjs1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjs1.setText("0");
        detail2.getContentPane().add(totjs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 110, 20));

        totjs2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjs2.setText("0");
        detail2.getContentPane().add(totjs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 110, 20));

        totjs3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjs3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjs3.setText("0");
        detail2.getContentPane().add(totjs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 110, 20));

        totkm1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkm1.setText("0");
        detail2.getContentPane().add(totkm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 110, 20));

        totkm2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkm2.setText("0");
        detail2.getContentPane().add(totkm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 110, 20));

        totkm3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkm3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkm3.setText("0");
        detail2.getContentPane().add(totkm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 110, 20));

        km3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        km3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km3.setText("0");
        detail2.getContentPane().add(km3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, 50, 20));

        km2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        km2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km2.setText("0");
        detail2.getContentPane().add(km2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 50, 20));

        km1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        km1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        km1.setText("0");
        detail2.getContentPane().add(km1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 50, 20));

        totka3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totka3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totka3.setText("0");
        detail2.getContentPane().add(totka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 100, 20));

        totka2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totka2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totka2.setText("0");
        detail2.getContentPane().add(totka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 100, 20));

        totka1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totka1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totka1.setText("0");
        detail2.getContentPane().add(totka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 100, 20));

        ka1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ka1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka1.setText("0");
        detail2.getContentPane().add(ka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 40, 20));

        ka2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ka2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka2.setText("0");
        detail2.getContentPane().add(ka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 40, 20));

        ka3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ka3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ka3.setText("0");
        detail2.getContentPane().add(ka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 40, 20));

        ja3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ja3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja3.setText("0");
        detail2.getContentPane().add(ja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 50, 20));

        ja2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja2.setText("0");
        detail2.getContentPane().add(ja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 50, 20));

        ja1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        ja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ja1.setText("0");
        detail2.getContentPane().add(ja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 50, 20));

        totja1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totja1.setText("0");
        detail2.getContentPane().add(totja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 100, 20));

        totja2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totja2.setText("0");
        detail2.getContentPane().add(totja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 100, 20));

        totja3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totja3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totja3.setText("0");
        detail2.getContentPane().add(totja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 100, 20));

        totkp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkp3.setText("0");
        detail2.getContentPane().add(totkp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 680, 110, 20));

        totkp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkp2.setText("0");
        detail2.getContentPane().add(totkp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 620, 110, 20));

        totkp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totkp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totkp1.setText("0");
        detail2.getContentPane().add(totkp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 110, 20));

        kp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        kp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp1.setText("0");
        detail2.getContentPane().add(kp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, 50, 20));

        kp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        kp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp2.setText("0");
        detail2.getContentPane().add(kp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, 50, 20));

        kp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        kp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kp3.setText("0");
        detail2.getContentPane().add(kp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 680, 50, 20));

        totjma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjma3.setText("0");
        detail2.getContentPane().add(totjma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 373, 120, 20));

        totjma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjma2.setText("0");
        detail2.getContentPane().add(totjma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 313, 120, 20));

        totjma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 13)); // NOI18N
        totjma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totjma1.setText("0");
        detail2.getContentPane().add(totjma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 250, 120, 20));

        jma1.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma1.setText("0");
        detail2.getContentPane().add(jma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 40, 20));

        jma2.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma2.setText("0");
        detail2.getContentPane().add(jma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 40, 20));

        jma3.setFont(new java.awt.Font("DFPOP1-W9", 0, 12)); // NOI18N
        jma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jma3.setText("0");
        detail2.getContentPane().add(jma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailpenjualan2.png"))); // NOI18N
        detail2.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownispisang.png"))); // NOI18N
        btn_bp.setBorder(null);
        btn_bp.setBorderPainted(false);
        btn_bp.setContentAreaFilled(false);
        btn_bp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bp.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_bp.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, 130));
        btn_bp.setEnabled(true);

        btn_bs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownissemangka.png"))); // NOI18N
        btn_bs.setBorder(null);
        btn_bs.setBorderPainted(false);
        btn_bs.setContentAreaFilled(false);
        btn_bs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bs.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 130));
        btn_bs.setEnabled(true);

        btn_bme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownismelon.png"))); // NOI18N
        btn_bme.setBorder(null);
        btn_bme.setBorderPainted(false);
        btn_bme.setContentAreaFilled(false);
        btn_bme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bme.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_bme, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 170, 140));
        btn_bme.setEnabled(true);

        btn_sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/salepisang.png"))); // NOI18N
        btn_sale.setBorder(null);
        btn_sale.setBorderPainted(false);
        btn_sale.setContentAreaFilled(false);
        btn_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sale.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 160, 140));
        btn_sale.setEnabled(true);

        btn_es.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/esbuah.png"))); // NOI18N
        btn_es.setBorder(null);
        btn_es.setBorderPainted(false);
        btn_es.setContentAreaFilled(false);
        btn_es.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_es.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_es, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 383, 180, 140));
        btn_es.setEnabled(true);

        btn_bma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownismangga.png"))); // NOI18N
        btn_bma.setBorder(null);
        btn_bma.setBorderPainted(false);
        btn_bma.setContentAreaFilled(false);
        btn_bma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bma.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_bma, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 170, 130));
        btn_bma.setEnabled(true);

        btn_ba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownisapel.png"))); // NOI18N
        btn_ba.setBorder(null);
        btn_ba.setBorderPainted(false);
        btn_ba.setContentAreaFilled(false);
        btn_ba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ba.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 160, 160, 130));
        btn_ba.setEnabled(true);

        btn_salad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/saladbuah.png"))); // NOI18N
        btn_salad.setBorder(null);
        btn_salad.setBorderPainted(false);
        btn_salad.setContentAreaFilled(false);
        btn_salad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_salad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 383, 170, 140));
        btn_salad.setEnabled(true);

        uang.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        uang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 154, 230, 50));

        next.setBorder(null);
        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 100, 80));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        jml_bp.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_bp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_bp.setText("0");
        getContentPane().add(jml_bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 300, 30, 30));

        jml_bme.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_bme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_bme.setText("0");
        getContentPane().add(jml_bme, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 379, 30, 30));

        jml_bs.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_bs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_bs.setText("0");
        getContentPane().add(jml_bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 460, 30, 30));

        jml_ba.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_ba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_ba.setText("0");
        getContentPane().add(jml_ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 539, 30, 30));

        jml_bma.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_bma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_bma.setText("0");
        getContentPane().add(jml_bma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 539, 30, 30));

        jml_salad.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_salad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_salad.setText("0");
        getContentPane().add(jml_salad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 300, 30, 30));

        jml_sale.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_sale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_sale.setText("0");
        getContentPane().add(jml_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 379, 30, 30));

        jml_es.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        jml_es.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jml_es.setText("0");
        getContentPane().add(jml_es, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 460, 30, 30));

        detil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/simboldetail.png"))); // NOI18N
        detil.setBorder(null);
        detil.setBorderPainted(false);
        detil.setContentAreaFilled(false);
        detil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(detil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 630, 80, -1));

        jLabel4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Detail Penjualan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1132, 700, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/shop1.png"))); // NOI18N
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

    private void jmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlActionPerformed

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
            java.util.logging.Logger.getLogger(buahagiashop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buahagiashop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buahagiashop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buahagiashop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buahagiashop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JLabel aset;
    private javax.swing.JLabel ba1;
    private javax.swing.JLabel ba2;
    private javax.swing.JLabel ba3;
    private javax.swing.JButton back;
    private javax.swing.JButton batal;
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
    public javax.swing.JButton btn_ba;
    public javax.swing.JButton btn_bma;
    public javax.swing.JButton btn_bme;
    public javax.swing.JButton btn_bp;
    public javax.swing.JButton btn_bs;
    public javax.swing.JButton btn_es;
    public javax.swing.JButton btn_ja;
    public javax.swing.JButton btn_jma;
    public javax.swing.JButton btn_jme;
    public javax.swing.JButton btn_jp;
    public javax.swing.JButton btn_js;
    public javax.swing.JButton btn_ka;
    public javax.swing.JButton btn_km;
    public javax.swing.JButton btn_kp;
    public javax.swing.JButton btn_salad;
    public javax.swing.JButton btn_sale;
    private javax.swing.JButton close;
    private javax.swing.JButton detail;
    private javax.swing.JFrame detail1;
    private javax.swing.JFrame detail2;
    private javax.swing.JButton detil;
    private javax.swing.JLabel es1;
    private javax.swing.JLabel es2;
    private javax.swing.JLabel es3;
    private javax.swing.JLabel gbr;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel jma1;
    private javax.swing.JLabel jma2;
    private javax.swing.JLabel jma3;
    private javax.swing.JLabel jme1;
    private javax.swing.JLabel jme2;
    private javax.swing.JLabel jme3;
    private javax.swing.JTextField jml;
    private javax.swing.JLabel jml_ba;
    private javax.swing.JLabel jml_bma;
    private javax.swing.JLabel jml_bme;
    private javax.swing.JLabel jml_bp;
    private javax.swing.JLabel jml_bs;
    private javax.swing.JLabel jml_es;
    private javax.swing.JLabel jml_ja;
    private javax.swing.JLabel jml_jma;
    private javax.swing.JLabel jml_jme;
    private javax.swing.JLabel jml_jp;
    private javax.swing.JLabel jml_js;
    private javax.swing.JLabel jml_ka;
    private javax.swing.JLabel jml_km;
    private javax.swing.JLabel jml_kp;
    private javax.swing.JLabel jml_salad;
    private javax.swing.JLabel jml_sale;
    private javax.swing.JLabel jp1;
    private javax.swing.JLabel jp2;
    private javax.swing.JLabel jp3;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js2;
    private javax.swing.JLabel js3;
    private javax.swing.JButton jual;
    private javax.swing.JLabel ka1;
    private javax.swing.JLabel ka2;
    private javax.swing.JLabel ka3;
    private javax.swing.JLabel km1;
    private javax.swing.JLabel km2;
    private javax.swing.JLabel km3;
    private javax.swing.JLabel kp1;
    private javax.swing.JLabel kp2;
    private javax.swing.JLabel kp3;
    private javax.swing.JLabel kualitas;
    public javax.swing.JButton left;
    public javax.swing.JButton min;
    private javax.swing.JButton next;
    private javax.swing.JFrame nextshop;
    private javax.swing.JFrame popup;
    private javax.swing.JButton previous;
    public javax.swing.JButton right;
    private javax.swing.JLabel salad1;
    private javax.swing.JLabel salad2;
    private javax.swing.JLabel salad3;
    private javax.swing.JLabel sale1;
    private javax.swing.JLabel sale2;
    private javax.swing.JLabel sale3;
    private javax.swing.JLabel stok;
    private javax.swing.JLabel totba1;
    private javax.swing.JLabel totba2;
    private javax.swing.JLabel totba3;
    private javax.swing.JLabel totbma1;
    private javax.swing.JLabel totbma2;
    private javax.swing.JLabel totbma3;
    private javax.swing.JLabel totbme1;
    private javax.swing.JLabel totbme2;
    private javax.swing.JLabel totbme3;
    private javax.swing.JLabel totbp1;
    private javax.swing.JLabel totbp2;
    private javax.swing.JLabel totbp3;
    private javax.swing.JLabel totbs1;
    private javax.swing.JLabel totbs2;
    private javax.swing.JLabel totbs3;
    private javax.swing.JLabel totes1;
    private javax.swing.JLabel totes2;
    private javax.swing.JLabel totes3;
    private javax.swing.JLabel totja1;
    private javax.swing.JLabel totja2;
    private javax.swing.JLabel totja3;
    private javax.swing.JLabel totjma1;
    private javax.swing.JLabel totjma2;
    private javax.swing.JLabel totjma3;
    private javax.swing.JLabel totjme1;
    private javax.swing.JLabel totjme2;
    private javax.swing.JLabel totjme3;
    private javax.swing.JLabel totjp1;
    private javax.swing.JLabel totjp2;
    private javax.swing.JLabel totjp3;
    private javax.swing.JLabel totjs1;
    private javax.swing.JLabel totjs2;
    private javax.swing.JLabel totjs3;
    private javax.swing.JLabel totka1;
    private javax.swing.JLabel totka2;
    private javax.swing.JLabel totka3;
    private javax.swing.JLabel totkm1;
    private javax.swing.JLabel totkm2;
    private javax.swing.JLabel totkm3;
    private javax.swing.JLabel totkp1;
    private javax.swing.JLabel totkp2;
    private javax.swing.JLabel totkp3;
    private javax.swing.JLabel totsalad1;
    private javax.swing.JLabel totsalad2;
    private javax.swing.JLabel totsalad3;
    private javax.swing.JLabel totsale1;
    private javax.swing.JLabel totsale2;
    private javax.swing.JLabel totsale3;
    private javax.swing.JButton tutup;
    private javax.swing.JLabel uang;
    // End of variables declaration//GEN-END:variables
}
