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
public class Say extends Thread{
    String cosaDire;
    public Say(String cosaDire) {
        this.cosaDire=cosaDire;
    }
    
    public void start(){
        for (int i = 0; i < 10; i++) {
            System.out.println(cosaDire);       
        }
    }
}
