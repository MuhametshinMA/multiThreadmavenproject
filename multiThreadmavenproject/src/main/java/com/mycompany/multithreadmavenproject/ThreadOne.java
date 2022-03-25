/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithreadmavenproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Arsenal
 */
public class ThreadOne implements Runnable{
    Thread th;
    String name;

    public ThreadOne(String name) {
        this.name = name;
        th = new Thread(this, this.name);
        //JOptionPane.showMessageDialog(null,  "Doughter Thread created", th.getName(), JOptionPane.DEFAULT_OPTION);
        System.out.println("doughter thread: "+ this.name +" created");
        th.start();

        /*super("demonstrated thread");
        System.out.println("doughter thread: "+ this +" created");
        start();
*/
    }
    
    @Override
    public void run() {
        try { 
            for (int i = 5; i > 0; i--) {
                //JOptionPane.showMessageDialog(null, ""+i, "Дoчepний поток : " + th.getName(), JOptionPane.DEFAULT_OPTION);
                System.out.println("doughter thread: "+ this.name + " " + i);
                Thread.sleep(500) ; 
            }
        } catch(InterruptedException е) { 
            //JOptionPane.showMessageDialog(null, "Doughter thread is overrided");
            System.out.println("doughter thread: overrided");
        }
        //JOptionPane.showMessageDialog(null, "Дoчepний поток завершен . " );
        System.out.println("doughter thread: stopped");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
