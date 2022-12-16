/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act25;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File ("c:/hola/hola.txt");
        Scanner leer = new Scanner (doc);
    
    
    System.out.println(leer.nextLine());
    
    }
}
