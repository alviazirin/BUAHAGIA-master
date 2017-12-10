/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import c.cmenu;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.*;

/**
 *
 * @author Farisya
 */
public class mainmenu extends javax.swing.JFrame {

    AudioInputStream audio;
    Clip clip;

    /**
     * Creates new form PPLAGRO
     */
    public mainmenu() throws InterruptedException {
        initComponents();
    }

    public void loading() throws InterruptedException {
        loadbar.setVisible(true);
        disablemenu();
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(125); //milisecond
            loadnum.setText(Integer.toString(i) + "%");
            loadbar.setValue(i);
            if (i == 100) {
                loadbar.setVisible(false);
                loadnum.setVisible(false);
                enablemenu();
            }
        }
    }

    public void kliktombolpetunjuk(MouseListener a) {
        ibutton.addMouseListener(a);
    }

    public void kliktomboltentang(MouseListener a) {
        abutton.addMouseListener(a);
    }

    public void kliktombolmain(MouseListener a) {
        pbutton.addMouseListener(a);
    }

    public void kliktombolkeluar(MouseListener a) {
        ebutton.addMouseListener(a);
    }

    public void klikvol(ActionListener a) {
        vol.addActionListener(a);
    }

    public void disablemenu() {
        abutton.setVisible(false);
        ebutton.setVisible(false);
        pbutton.setVisible(false);
        ibutton.setVisible(false);
        vol.setVisible(false);
    }

    public void enablemenu() {
        abutton.setVisible(true);
        ebutton.setVisible(true);
        pbutton.setVisible(true);
        ibutton.setVisible(true);
        vol.setVisible(true);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        loadnum = new javax.swing.JLabel();
        loadbar = new javax.swing.JProgressBar();
        pbutton = new javax.swing.JLabel();
        ibutton = new javax.swing.JLabel();
        abutton = new javax.swing.JLabel();
        ebutton = new javax.swing.JLabel();
        vol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/vol.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadnum.setFont(new java.awt.Font("DFPOP1-W9", 1, 24)); // NOI18N
        loadnum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(loadnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 90, 70));

        loadbar.setBackground(new java.awt.Color(129, 66, 45));
        loadbar.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        loadbar.setForeground(new java.awt.Color(94, 33, 13));
        loadbar.setBorderPainted(false);
        loadbar.setString("loading...");
        getContentPane().add(loadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 450, 50));
        loadbar.setVisible(false);

        pbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pbutton.png"))); // NOI18N
        pbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pbuttonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pbuttonMouseReleased(evt);
            }
        });
        getContentPane().add(pbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, -1, -1));

        ibutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/ibutton.png"))); // NOI18N
        ibutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ibutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ibuttonMouseExited(evt);
            }
        });
        getContentPane().add(ibutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, -1, -1));

        abutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/abutton.png"))); // NOI18N
        abutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abuttonMouseExited(evt);
            }
        });
        getContentPane().add(abutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, -1, -1));

        ebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/ebutton.png"))); // NOI18N
        ebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ebuttonMouseExited(evt);
            }
        });
        getContentPane().add(ebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/vol.png"))); // NOI18N
        vol.setBorder(null);
        vol.setContentAreaFilled(false);
        vol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });
        getContentPane().add(vol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 670, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/1..png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ibuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibuttonMouseEntered
    }//GEN-LAST:event_ibuttonMouseEntered

    private void ibuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibuttonMouseExited
    }//GEN-LAST:event_ibuttonMouseExited

    private void abuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abuttonMouseEntered
    }//GEN-LAST:event_abuttonMouseEntered

    private void abuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abuttonMouseExited
    }//GEN-LAST:event_abuttonMouseExited

    private void ebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebuttonMouseEntered
    }//GEN-LAST:event_ebuttonMouseEntered

    private void ebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebuttonMouseExited
    }//GEN-LAST:event_ebuttonMouseExited

    private void ebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebuttonMouseClicked
    }//GEN-LAST:event_ebuttonMouseClicked

    private void pbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbuttonMouseReleased
    }//GEN-LAST:event_pbuttonMouseReleased

    private void pbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbuttonMouseExited
    }//GEN-LAST:event_pbuttonMouseExited

    private void pbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbuttonMouseEntered
    }//GEN-LAST:event_pbuttonMouseEntered

    private void pbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbuttonMouseClicked
    }//GEN-LAST:event_pbuttonMouseClicked

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed

    }//GEN-LAST:event_volActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainmenu().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(mainmenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel abutton;
    public javax.swing.JLabel ebutton;
    public javax.swing.JLabel ibutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar loadbar;
    private javax.swing.JLabel loadnum;
    public javax.swing.JLabel pbutton;
    public javax.swing.JButton vol;
    // End of variables declaration//GEN-END:variables
}
