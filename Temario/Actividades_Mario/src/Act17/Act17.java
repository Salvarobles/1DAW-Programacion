/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act17;
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
    
    System.out.println("Cual es tu nombre?");
    String Nombre = leer.nextLine();
    
    System.out.println("Cual es tu dominio?");
    String Dominio = leer.nextLine();
    
    if ("gmail.es".equals(Dominio) || "gmail.com".equals(Dominio) ){
        
        System.out.println("Tu correo es: " + Nombre + "@"+ Dominio);
        
    }
    else {
        System.out.println("Fallo en el dominio");
    }
    }
}
