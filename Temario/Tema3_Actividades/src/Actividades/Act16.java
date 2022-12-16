/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;
import bpc.daw.consola.*;
import java.awt.*;
/**
 *
 * @author Salva Robles
 */

public class Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String Hola = null;
        // TODO code application logic here
        Consola hola = new Consola(Hola,1000,1000);
        
        int numero10;
        int numero = 20;
        char espacio = ' ';
        
        hola.setTitulo("Juego");
        
        for (int i=1; i<=numero/2; i++){
            numero10=i+10;
            System.out.print(i + ")En clase no se juega.                 ");
            
            hola.getCapaTexto();
            

            
            
            for (int a = 0; a<= i; a++){
                System.out.print(espacio);
            }
            System.out.println(numero10 + ")En clase no se juega.");

        }
    }
}


