/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author reyna
 */
public class Nomor4Server  {
    public static final int SERVICE_PORT = 14;
    int client = 1;
    
    public void run() {
        try {
            ServerSocket server = new ServerSocket(SERVICE_PORT);
            System.out.println("Server Started");
            for(;;) {
                Socket nextClient = server.accept();
                System.out.println("Client Connect : "
                        + nextClient.getInetAddress() + " on port "
                        + nextClient.getPort());
                OutputStream out = nextClient.getOutputStream();
                PrintStream pout = new PrintStream(out);
                pout.print("Terima kasih telah datang, Anda client ke-"+client);
                client++;
                out.flush();
                out.close();
                nextClient.close();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Nomor4Server obj = new Nomor4Server();
        obj.run();
    }
}
