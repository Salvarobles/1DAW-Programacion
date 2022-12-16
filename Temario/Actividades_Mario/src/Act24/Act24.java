/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act24;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        try {
            System.out.println("Introduce la primera frase: ");
            String frase1 = leer.nextLine();
        
            System.out.println("Introduce la primera frase: ");
            String frase2 = leer.nextLine();    
            
            PrintWriter writer = new PrintWriter("c:/hola/hola.txt");
            writer.println(frase1);
            writer.println(frase2);
            writer.close();
        
        } catch(FileNotFoundException | SecurityException e) {
                System.out.println("No puedes escribir, no tienes privilegios");
                }
    }
}
