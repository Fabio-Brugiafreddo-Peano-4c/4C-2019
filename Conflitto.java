/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conflitto;

/**
 *
 * @author brugiafreddo.fabio
 */
public class Conflitto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inc1000 i = new Inc1000();
        Inc10002 i2 = new Inc10002();
        i.start();
        i2.start();
    }
    
}
