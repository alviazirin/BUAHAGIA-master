/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import c.pasarc;
import c.supermarketc;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Farisya
 */
public class map extends javax.swing.JFrame {

    /**
     * Creates new form map
     */
    public map() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().width;
        int y = (int) tk.getScreenSize().height;
        this.setSize(x, y);
    }

    public void klikLanjut(ActionListener a) {
        lanjut.addActionListener(a);
    }

    public void klikPermainanBaru(ActionListener a) {
        newgame.addActionListener(a);
    }
    public void klikPenghargaan(ActionListener a) {
        achievementbtn.addActionListener(a);
    }

    public void klikPasar(MouseListener a) {
        pasar.addMouseListener(a);
    }

    public void klikGudang(MouseListener a) {
        gudang.addMouseListener(a);
    }

    public void klikPabrik(MouseListener a) {
        pabrik.addMouseListener(a);
    }

    public void klikKembali(ActionListener action) {
        back.addActionListener(action);
    }

    public void setUang(String text) {
        this.labeluang.setText(text);
    }

    public void setNama(String t) {
        this.user.setText(t);
    }

       public void invisibleTombol() {
        lanjut.setVisible(false);
        newgame.setVisible(false);
    }

    public void disabledAll() {
        gudang.setEnabled(false);
        pasar.setEnabled(false);
        pabrik.setEnabled(false);
        bg.setEnabled(false);
        user.setEnabled(false);
        namagudang.setEnabled(false);
        namapasar.setEnabled(false);
        namapengolahan.setEnabled(false);
        achievementbtn.setEnabled(false);
    }

    public void enabledAll() {
        gudang.setEnabled(true);
        pasar.setEnabled(true);
        pabrik.setEnabled(true);
        bg.setEnabled(true);
        user.setEnabled(true);
        namagudang.setEnabled(true);
        namapasar.setEnabled(true);
        namapengolahan.setEnabled(true);
        achievementbtn.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lanjut = new javax.swing.JButton();
        newgame = new javax.swing.JButton();
        namapasar = new javax.swing.JLabel();
        namagudang = new javax.swing.JLabel();
        namapengolahan = new javax.swing.JLabel();
        gudang = new javax.swing.JLabel();
        pabrik = new javax.swing.JLabel();
        pasar = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        labeluang = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        achievementbtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/buttoncontinue.png"))); // NOI18N
        lanjut.setBorder(null);
        lanjut.setBorderPainted(false);
        lanjut.setContentAreaFilled(false);
        lanjut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanjutActionPerformed(evt);
            }
        });
        getContentPane().add(lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/buttonnewgame.png"))); // NOI18N
        newgame.setBorder(null);
        newgame.setBorderPainted(false);
        newgame.setContentAreaFilled(false);
        newgame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(newgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, -1, -1));

        namapasar.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        namapasar.setText("PASAR");
        getContentPane().add(namapasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, -1, -1));

        namagudang.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        namagudang.setText("GUDANG");
        getContentPane().add(namagudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        namapengolahan.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        namapengolahan.setText("PENGOLAHAN");
        getContentPane().add(namapengolahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, -1, -1));

        gudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 280, 440));

        pabrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pabrik, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, 380));

        pasar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 380, 350));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        labeluang.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        labeluang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeluang.setToolTipText("");
        getContentPane().add(labeluang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 160, 50));

        user.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 40));

        achievementbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logoacv.png"))); // NOI18N
        achievementbtn.setBorder(null);
        achievementbtn.setBorderPainted(false);
        achievementbtn.setContentAreaFilled(false);
        achievementbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(achievementbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/map.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/backhover.png"));
        back.setIcon(awal);        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/back.png"));
        back.setIcon(awal);
    }//GEN-LAST:event_backMouseExited

    private void lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanjutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanjutActionPerformed

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
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achievementbtn;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    public javax.swing.JLabel gudang;
    private javax.swing.JLabel labeluang;
    private javax.swing.JButton lanjut;
    private javax.swing.JLabel namagudang;
    private javax.swing.JLabel namapasar;
    private javax.swing.JLabel namapengolahan;
    private javax.swing.JButton newgame;
    public javax.swing.JLabel pabrik;
    public javax.swing.JLabel pasar;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
