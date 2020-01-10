/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciaohihello;

/**
 *
 * @author tancau.andrei
 */
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say say1 = new Say("Hi");
        Say say2 = new Say("Hello");
        Say say3 = new Say("Ciao");
        say1.start();
        say2.start();
        say3.start();
    }
    
}
