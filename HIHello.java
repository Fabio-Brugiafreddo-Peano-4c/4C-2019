/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hihello;

/**
 *
 * @author brugiafreddo.fabio
 */
public class HIHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Hi h = new Hi();
          Hello h2 = new Hello();
          Say s = new Say();
          h.start();
          h2.start();
          s.start();
    }
    
}
