/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import v.login;
import v.mainmenu;
import v.map;
import v.petunjuk;
import v.tentang;

/**
 *
 * @author Farisya
 */
public class cmenu {

    petunjuk vpetunjuk;
    map vmap;
    tentang vtentang;
    mainmenu vmain;
    AudioInputStream audio;
    Clip clip;
    login log;
    boolean petunjuk = false, tentang = false;

    public cmenu(mainmenu v) throws InterruptedException {
        this.vmain = v;
        v.setVisible(true);
        v.kliktombolkeluar(new acttombolkeluar());
        v.kliktombolmain(new acttombolmain());
        v.kliktomboltentang(new acttomboltentang());
        v.kliktombolpetunjuk(new acttombolpetunjuk());
        v.klikvol(new acttombolvolume());
        music();
    }

    public cmenu(petunjuk v) {
        petunjuk = true;
        this.vpetunjuk = v;
       v.setVisible(true);
        v.tombolkembali(new acttombolkembali());
    }

    public cmenu(tentang v) {
        tentang = true;
        this.vtentang = v;
        v.setVisible(true);
        v.tombolkembali(new acttombolkembali());
    }

    public void music() {
        try {
            audio = AudioSystem.getAudioInputStream(new File("src//ui export//ost.wav"));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            Logger.getLogger(cmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//--------------ebutton--------------------
    private class acttombolkeluar implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            int dialog = JOptionPane.YES_NO_OPTION;
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda ingin keluar?", "keluar", dialog);
            if (Pilih == 0) {
                System.exit(0);
            } else {
                vmain.setVisible(true);
            }
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon hovery = new ImageIcon(getClass().getResource("/ui export/ebuttonhover.png"));
            vmain.ebutton.setIcon(hovery);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon bttnn = new ImageIcon(getClass().getResource("/ui export/ebutton.png"));
            vmain.ebutton.setIcon(bttnn);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

//---------------ibutton--------------
    private class acttombolpetunjuk implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            petunjuk vp = new petunjuk();
        cmenu c = new cmenu(vp);
       //     vmain.setVisible(false);

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon hoverz = new ImageIcon(getClass().getResource("/ui export/ibuttonhover.png"));
            vmain.ibutton.setIcon(hoverz);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon btn = new ImageIcon(getClass().getResource("/ui export/ibutton.png"));
            vmain.ibutton.setIcon(btn);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    //--------------------abutton-------------------  
    private class acttomboltentang implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            tentang vt = new tentang();
            cmenu c = new cmenu(vt);
      //      vmain.setVisible(false);

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon hoverx = new ImageIcon(getClass().getResource("/ui export/abuttonhover.png"));
            vmain.abutton.setIcon(hoverx);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon btnn = new ImageIcon(getClass().getResource("/ui export/abutton.png"));
            vmain.abutton.setIcon(btnn);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    //--------------------pbutton-------------------  
    private class acttombolmain implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            try {

                loginc c = new loginc();
             //   vmain.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(cmenu.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("");
            } catch (InterruptedException ex) {
                Logger.getLogger(cmenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon hover = new ImageIcon(getClass().getResource("/ui export/pbuttonhover.png"));
            vmain.pbutton.setIcon(hover);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/pbutton.png"));
            vmain.pbutton.setIcon(awal);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    //--------------------back1-------------------  
    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //  mainmenu v = new mainmenu();
            //  cmenu c = new cmenu(v);
            if (petunjuk) {
                petunjuk = false;
                vpetunjuk.dispose();
            } else if (tentang) {
                tentang = false;
                vtentang.dispose();
            }
        }
    }

    private class acttombolvolume implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (clip.isRunning()) {
                clip.stop();
                vmain.vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mute.png"))); // NOI18N
            } else {
                clip.start();
                vmain.vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/vol.png"))); // NOI18N
            }
        }
    }
}
