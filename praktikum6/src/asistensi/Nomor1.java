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
public class Nomor1 extends Thread {
    int[] data = new int[6];
    static int[] hasil = new int[6];
    int ind;
    
    public Nomor1(int[] data, int ind) {
        this.ind=ind;
        System.arraycopy(data, 0, this.data, 0, data.length);
    }
    
    Nomor1() {
        ind = 6;
    }
    
    @Override
    public void run() {
        if(ind==6) {
            int total=0;
            System.out.print("Penjumlahan Total = ");
            for(int i=0; i<data.length; i++) {
                total+=hasil[i];
            }
            System.out.print(total+"\n\n");
        } else {
            System.out.println("Penjumlahan index ke-"+ind);
            hasil[ind] = data[0]+data[1]+data[2];
            System.out.println(data[0]+" + "+data[1]+" + "+data[2]+" = "
            +hasil[ind]+"\n");
        }
    }
    
    public static void main(String[] args) throws Exception {
        int[] data1 = {6,9,1,2,3,5};
        int[] data2 = {7,11,6,4,3,1};
        int[] data3 = {5,4,3,2,1,12};
        int[] temp = new int[3];
        for(int i=0; i<data1.length; i++) {
            temp[0] = data1[i];
            temp[1] = data2[i];
            temp[2] = data3[i];
            Nomor1 obj = new Nomor1(temp, i);
            obj.start();
            obj.join();
        }
        Nomor1 total = new Nomor1();
        total.start();
    }
}
