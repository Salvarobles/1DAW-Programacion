/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act18;

import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Cual es tu correo electronico?");
    String Correo = leer.nextLine();
    
    int Num = Correo.indexOf("@");
    
    String Nombre = Correo.substring(0,Num);
    String Dominio = Correo.substring(Num + 1);
    
    System.out.println("Tu nombre de usuaio es: " + Nombre);
    System.out.println("Tu nombre de usuaio es: " + Dominio);
    }
}
