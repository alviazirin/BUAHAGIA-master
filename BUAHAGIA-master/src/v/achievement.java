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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Farisya
 */
public class achievement extends javax.swing.JFrame {

    /**
     * Creates new form map
     */
    public achievement() {
        initComponents();
        popupdetail.setLocationRelativeTo(this);
    }

    public void klikTutup(ActionListener a) {
        tutup.addActionListener(a);
    }

    public void klikOke(ActionListener a) {
        close.addActionListener(a);
    }

    public void klikManiakMelon(ActionListener al) {
        dmaniakmelon.addActionListener(al);
    }

    public void klikManiakApel(ActionListener a) {
        dmaniakapel.addActionListener(a);
    }

    public void klikManiakMangga(ActionListener a) {
        dmaniakmangga.addActionListener(a);
    }

    public void klikRameRasanya(ActionListener a) {
        dramerasanya.addActionListener(a);
    }

    public void klikJuraganRoti(ActionListener a) {
        djuraganroti.addActionListener(a);
    }

    public void klikKriuk(ActionListener a) {
        dkriuk.addActionListener(a);
    }

    public void klikLegend(ActionListener a) {
        dlegend.addActionListener(a);
    }

    public void klikPebisnisEsbuah(ActionListener a) {
        dpebisnisesbuah.addActionListener(a);
    }

    public void klikPengusahaSale(ActionListener a) {
        dpengusahasale.addActionListener(a);
    }

    public void klikSaudagar(ActionListener a) {
        dsaudagar.addActionListener(a);
    }

    public void klikSiGembul(ActionListener a) {
        dsigembul.addActionListener(a);
    }

    public void klikSiManis(ActionListener a) {
        dsimanis.addActionListener(a);
    }

    public void klikSiSehat(ActionListener a) {
        dsisehat.addActionListener(a);
    }

    public void klikTukangBlender(ActionListener a) {
        dtukangblender.addActionListener(a);
    }

    public JFrame popup() {
        return popupdetail;
    }

    public JLabel setGambar() {
        return gambar;
    }

    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupdetail = new javax.swing.JFrame();
        close = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();
        tutup = new javax.swing.JButton();
        djuraganroti = new javax.swing.JButton();
        dpebisnisesbuah = new javax.swing.JButton();
        dpengusahasale = new javax.swing.JButton();
        dlegend = new javax.swing.JButton();
        dsaudagar = new javax.swing.JButton();
        dkriuk = new javax.swing.JButton();
        dramerasanya = new javax.swing.JButton();
        dtukangblender = new javax.swing.JButton();
        dsisehat = new javax.swing.JButton();
        dsigembul = new javax.swing.JButton();
        dsimanis = new javax.swing.JButton();
        dmaniakapel = new javax.swing.JButton();
        dmaniakmangga = new javax.swing.JButton();
        dmaniakmelon = new javax.swing.JButton();
        maniakmelon = new javax.swing.JLabel();
        maniakmangga = new javax.swing.JLabel();
        maniakapel = new javax.swing.JLabel();
        simanis = new javax.swing.JLabel();
        saudagar = new javax.swing.JLabel();
        sigembul = new javax.swing.JLabel();
        sisehat = new javax.swing.JLabel();
        tukangblender = new javax.swing.JLabel();
        ramerasanya = new javax.swing.JLabel();
        kriuk = new javax.swing.JLabel();
        legend = new javax.swing.JLabel();
        pengusahasale = new javax.swing.JLabel();
        pebisnisesbuah = new javax.swing.JLabel();
        juraganroti = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        popupdetail.setUndecorated(true);
        popupdetail.setSize(new java.awt.Dimension(811, 690));
        popupdetail.setType(java.awt.Window.Type.POPUP);
        popupdetail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/ok.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popupdetail.getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/detailmaniakapel.png"))); // NOI18N
        popupdetail.getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/exit.png"))); // NOI18N
        tutup.setBorder(null);
        tutup.setBorderPainted(false);
        tutup.setContentAreaFilled(false);
        tutup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupActionPerformed(evt);
            }
        });
        getContentPane().add(tutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 90, 70));

        djuraganroti.setBorder(null);
        djuraganroti.setBorderPainted(false);
        djuraganroti.setContentAreaFilled(false);
        djuraganroti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(djuraganroti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 200, 100));

        dpebisnisesbuah.setBorder(null);
        dpebisnisesbuah.setBorderPainted(false);
        dpebisnisesbuah.setContentAreaFilled(false);
        dpebisnisesbuah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dpebisnisesbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 200, 100));

        dpengusahasale.setBorder(null);
        dpengusahasale.setBorderPainted(false);
        dpengusahasale.setContentAreaFilled(false);
        dpengusahasale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dpengusahasale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, 200, 100));

        dlegend.setBorder(null);
        dlegend.setBorderPainted(false);
        dlegend.setContentAreaFilled(false);
        dlegend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dlegend, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 230, 90));

        dsaudagar.setBorder(null);
        dsaudagar.setBorderPainted(false);
        dsaudagar.setContentAreaFilled(false);
        dsaudagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dsaudagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsaudagarActionPerformed(evt);
            }
        });
        getContentPane().add(dsaudagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 240, 90));

        dkriuk.setBorder(null);
        dkriuk.setBorderPainted(false);
        dkriuk.setContentAreaFilled(false);
        dkriuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dkriuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 190, 90));

        dramerasanya.setBorder(null);
        dramerasanya.setBorderPainted(false);
        dramerasanya.setContentAreaFilled(false);
        dramerasanya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dramerasanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 180, 100));

        dtukangblender.setBorder(null);
        dtukangblender.setBorderPainted(false);
        dtukangblender.setContentAreaFilled(false);
        dtukangblender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dtukangblender, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 180, 100));

        dsisehat.setBorder(null);
        dsisehat.setBorderPainted(false);
        dsisehat.setContentAreaFilled(false);
        dsisehat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dsisehat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 190, 90));

        dsigembul.setBorder(null);
        dsigembul.setBorderPainted(false);
        dsigembul.setContentAreaFilled(false);
        dsigembul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dsigembul, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 190, 100));

        dsimanis.setBorder(null);
        dsimanis.setBorderPainted(false);
        dsimanis.setContentAreaFilled(false);
        dsimanis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dsimanis, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 190, 90));

        dmaniakapel.setBorder(null);
        dmaniakapel.setBorderPainted(false);
        dmaniakapel.setContentAreaFilled(false);
        dmaniakapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dmaniakapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmaniakapelActionPerformed(evt);
            }
        });
        getContentPane().add(dmaniakapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 190, 100));

        dmaniakmangga.setBorder(null);
        dmaniakmangga.setBorderPainted(false);
        dmaniakmangga.setContentAreaFilled(false);
        dmaniakmangga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dmaniakmangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmaniakmanggaActionPerformed(evt);
            }
        });
        getContentPane().add(dmaniakmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 100));

        dmaniakmelon.setBorder(null);
        dmaniakmelon.setBorderPainted(false);
        dmaniakmelon.setContentAreaFilled(false);
        dmaniakmelon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(dmaniakmelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 100));

        maniakmelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(maniakmelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        maniakmangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(maniakmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        maniakapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(maniakapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        simanis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(simanis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        saudagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logosaudagar3.png"))); // NOI18N
        getContentPane().add(saudagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, -1, -1));

        sigembul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(sigembul, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        sisehat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(sisehat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        tukangblender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(tukangblender, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        ramerasanya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(ramerasanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        kriuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(kriuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        legend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logolegend3.png"))); // NOI18N
        getContentPane().add(legend, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 90, 100));

        pengusahasale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(pengusahasale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, -1, -1));

        pebisnisesbuah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(pebisnisesbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, -1, -1));

        juraganroti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/logorank3.png"))); // NOI18N
        getContentPane().add(juraganroti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/achievement.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dmaniakapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmaniakapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmaniakapelActionPerformed

    private void dmaniakmanggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmaniakmanggaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmaniakmanggaActionPerformed

    private void tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutupActionPerformed

    private void dsaudagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsaudagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsaudagarActionPerformed

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
            java.util.logging.Logger.getLogger(achievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(achievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(achievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(achievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new achievement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton djuraganroti;
    private javax.swing.JButton dkriuk;
    private javax.swing.JButton dlegend;
    private javax.swing.JButton dmaniakapel;
    private javax.swing.JButton dmaniakmangga;
    private javax.swing.JButton dmaniakmelon;
    private javax.swing.JButton dpebisnisesbuah;
    private javax.swing.JButton dpengusahasale;
    private javax.swing.JButton dramerasanya;
    private javax.swing.JButton dsaudagar;
    private javax.swing.JButton dsigembul;
    private javax.swing.JButton dsimanis;
    private javax.swing.JButton dsisehat;
    private javax.swing.JButton dtukangblender;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel juraganroti;
    public javax.swing.JLabel kriuk;
    public javax.swing.JLabel legend;
    public javax.swing.JLabel maniakapel;
    public javax.swing.JLabel maniakmangga;
    public javax.swing.JLabel maniakmelon;
    public javax.swing.JLabel pebisnisesbuah;
    public javax.swing.JLabel pengusahasale;
    private javax.swing.JFrame popupdetail;
    public javax.swing.JLabel ramerasanya;
    public javax.swing.JLabel saudagar;
    public javax.swing.JLabel sigembul;
    public javax.swing.JLabel simanis;
    public javax.swing.JLabel sisehat;
    public javax.swing.JLabel tukangblender;
    private javax.swing.JButton tutup;
    // End of variables declaration//GEN-END:variables
}
