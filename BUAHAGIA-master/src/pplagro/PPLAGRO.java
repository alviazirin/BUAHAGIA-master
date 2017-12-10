/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplagro;

import v.mainmenu;
import c.cmenu;

/**
 *
 * @author Farisya
 */
public class PPLAGRO {

    mainmenu awal;
  
    public static void main(String[] args) throws InterruptedException {
        mainmenu v = new mainmenu();
        cmenu c = new cmenu(v);
        // v.loading();
      //  c.music();
    }
}
