/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hihello;

import javax.swing.JOptionPane;

/**
 *
 * @author brugiafreddo.fabio
 */
public class Hi extends Thread{
    private final String hi = "hi";

    public Hi() {
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
             System.out.println(hi);
            
        }
       
    }
}
