/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act16;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Introduzca la primera frase:");
        String Frase1 = leer.nextLine();
        
        System.out.println("Introduzca la segunda frase:");
        String Frase2 = leer.nextLine();
        
        System.out.println("Contiene alguna palabra?" + Frase1.contains(Frase2));
    }
}
