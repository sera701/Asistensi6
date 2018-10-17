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
public class Nomor2 {
    
    
    public static void main(String[] args) throws Exception {
        Thread d = new Docter();
        Thread p = new Perawat();
        Thread k = new Kasir();
        
        d.start(); 
        d.join();
        
        p.start();
        p.join();
        
        k.start();
        k.join();
    }
}
