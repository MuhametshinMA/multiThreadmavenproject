/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithreadmavenproject;

/**
 *
 * @author Arsenal
 */
public class CallMe {
    synchronized public void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " interrupted");
        }
        System.out.println(" ]");
    }
}
