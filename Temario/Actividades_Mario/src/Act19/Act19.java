/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act19;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Introduzca una ruta: ");
    String ruta = leer.next();
    
    File fichero = new File(ruta);
    
    System.out.println("El tamaño del fichero es: " + fichero.length() + " bytes");
    
    System.out.println("El tamaño del fichero es: " + fichero.length()/2048 + " Megabytes");
    
    }
}