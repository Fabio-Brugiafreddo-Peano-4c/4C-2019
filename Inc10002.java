/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conflitto;

import static conflitto.Inc1000.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brugiafreddo.fabio
 */
public class Inc10002 extends Thread {
     @Override
    public synchronized void run(){
        for (count = 0; count < 1000; count++) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);

            }
            System.out.println(count);
        }
    }
}
