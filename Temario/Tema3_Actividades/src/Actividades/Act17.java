/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        try{

            // Obtenemos el objeto InetAddress y lo probamos con www.google.es
            InetAddress host = InetAddress.getByName("www.google.es");
            
            // Obtenemos el Host
            System.out.println("Host: "+host);
            
             // Obtenemos la IP
            System.out.println("IP: "+ host.getHostAddress());
            
             // Obtenemos el nombre
            System.out.println("Nombre: "+host.getHostName());
            
            
        } catch( UnknownHostException uhe){
            System.out.println("Host Exception");
            System.out.println(uhe.toString());
            
        }
    }
}
