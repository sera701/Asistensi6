/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

/**
 *
 * @author reyna
 */
public class Perawat extends Thread {
    public void run() {
        System.out.println();
        for(int i=1; i<=5; i++) {
            System.out.println("Pasien "+i+" dirawat oleh perawat 1");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println();
        for(int i=6; i<=10; i++) {
            System.out.println("Pasien "+i+" dirawat oleh perawat 2");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
