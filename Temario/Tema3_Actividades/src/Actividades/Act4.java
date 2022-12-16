/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        
                boolean terminar = false;
        do {
             System.out.println("Eres mayor de edad?");
             String afirmacion = leer.nextLine();
        
            if ("Si".equals(afirmacion) || "si".equals(afirmacion)) {
                System.out.println("El usuario es mayor de edad");
                terminar =true; 
            } else if ("No".equals(afirmacion) || "No".equals(afirmacion)){
                System.out.println("El suusario es menor de edad");
                terminar = true;
            }
            else {
                System.out.println("No te entendido");
            }   
        } while (!terminar);    
    }

}
