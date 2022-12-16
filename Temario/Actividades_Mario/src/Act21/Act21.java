/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act21;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author Salva Robles
 */
public class Act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
            System.out.println("Introduzca una ruta: ");
            String ruta = leer.nextLine();
            
            File documento = new File (ruta);
            
            File[] files = documento.listFiles();
            
                if (documento.isDirectory()){

                    System.out.println("Tiene: " + files.length + "archivos");
                }
                else {
                    System.out.println("Error, no es un directorio." );
                }
    }
}
