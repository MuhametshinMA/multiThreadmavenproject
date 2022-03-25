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
        CallMe call = new CallMe();
        ThreadOne th1 = new ThreadOne(call, "Wellcome");
        ThreadOne th2 = new ThreadOne(call, "to syncronyzed");
        ThreadOne th3 = new ThreadOne(call, "world");
        System.out.println("Thread "+ th1.toString() + " " + th1.th.isAlive());   
        System.out.println("Thread "+ th2.toString() + " " + th2.th.isAlive());
        System.out.println("Thread "+ th3.toString() + " " + th3.th.isAlive());
        try {
            System.out.println("Whaiting for interrupt threads");
            th1.th.join();
            th2.th.join();
            th3.th.join();
        } catch(InterruptedException e) {
            System.out.println("main thread: interrupted");
            //JOptionPane.showMessageDialog(null, "interrupted", "main thread: " + Thread.currentThread().getName(), JOptionPane.CLOSED_OPTION);
        }
        System.out.println("Thread "+ th1.toString() + " " + th1.th.isAlive());   
        System.out.println("Thread "+ th2.toString() + " " + th2.th.isAlive());
        System.out.println("Thread "+ th3.toString() + " " + th3.th.isAlive());
        System.out.println("main thread: stoped");
        //JOptionPane.showMessageDialog(null, "stoped", "main thread: " + Thread.currentThread().getName(), JOptionPane.CLOSED_OPTION);
        
    }
    
}
