/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author reyna
 */
public class Nomor4Client 
{
    public static final int SERVICE_PORT = 14;
    public static void main(String[] args) 
    {
        try 
        {
            String hostname = "localhost";
            
            Socket daytime = new Socket(hostname, SERVICE_PORT);
            daytime.setSoTimeout(2000);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
            System.out.println(reader.readLine());
            
            daytime.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
