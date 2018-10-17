/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

import java.awt.Event;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reyna
 */
public class Nomor3 extends Thread {
    boolean status = true;
    boolean invert;
    static int i = 2;
    
    Nomor3() {
        
    }
    
    Nomor3(int x) {
        if(x==1) {
            invert = true;
        } else if(x==2) {
            status=false;
        }
    }

    void countUp() {
        invert = false;
        while(!invert) {
            System.out.print((i)+" ");
            i+=2;
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
    }
    
    void countDown() {
        i-=1;
        while(invert) {
            System.out.print((i)+" ");
            i-=2;
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
    
    public void run() {
        if(!invert) {
            countUp();
        } else {
            countDown();
        }
    }
    
    public static void main(String[] args) throws Exception {
        Thread t=new Nomor3();
        t.start();
        System.out.println("tekan enter untuk mundur");
        System.in.read();
        t.stop();
        Thread s=new Nomor3(1);
        s.start();
        System.out.println("tekan enter untuk stop");
        System.in.read();
        s.stop();
    }
}
