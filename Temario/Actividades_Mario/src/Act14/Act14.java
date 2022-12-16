/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act14;

import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduce una frase");
        String frase = leer.nextLine();
        
        System.out.println("La letra es: " + frase.charAt(frase.length()/2));
    }
}