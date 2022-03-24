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
        Thread th = Thread.currentThread();
        JOptionPane.showMessageDialog(null, th, "Thread name: " + th.getName(), JOptionPane.DEFAULT_OPTION);
        try {
            for (int i = 0; i < 5; i++){
                JOptionPane.showMessageDialog(null, i, "Test", JOptionPane.DEFAULT_OPTION);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            JOptionPane.showMessageDialog(null, "", "Stop", JOptionPane.CLOSED_OPTION);
        }
        
    }
    
}
