/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conflitto;

import static conflitto.Inc1000.count;

/**
 *
 * @author brugiafreddo.fabio
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Inc1000 i = new Inc1000();
        Inc1000 i2 = new Inc1000();
        i.start();
        i.join();
        i2.start();
        i2.join();
        System.out.println(count);
    }
    
}
