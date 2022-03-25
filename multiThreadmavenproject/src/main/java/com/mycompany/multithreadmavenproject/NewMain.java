/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multithreadmavenproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Arsenal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ThreadOne("first");
        new ThreadOne("second");
        new ThreadOne("third");
        
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("main thread: " + i);
                //JOptionPane.showMessageDialog(null, "" + i , "main thread: " + Thread.currentThread().getName(), JOptionPane.DEFAULT_OPTION);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("main thread: interrupted");
            //JOptionPane.showMessageDialog(null, "interrupted", "main thread: " + Thread.currentThread().getName(), JOptionPane.CLOSED_OPTION);
        }
        System.out.println("main thread: stoped");
        //JOptionPane.showMessageDialog(null, "stoped", "main thread: " + Thread.currentThread().getName(), JOptionPane.CLOSED_OPTION);
        
    }
    
}
