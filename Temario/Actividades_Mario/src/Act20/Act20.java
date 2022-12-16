/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act20;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author Salva Robles
 */
public class Act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Introduzca una ruta: ");
    String ruta = leer.nextLine();
    
    File archivo =new File (ruta);

        if (archivo.isDirectory()){
            System.out.println("La ruta introducida corresponde a un directorio");
          }
         else if (archivo.isFile()){
             System.out.println("La ruta introducida es un archivo de tamaño " + archivo.length() + "byte");
             
             System.out.println("Desea borrarlo (si/no)?");
             String afirmacion = leer.nextLine();
             
               if (afirmacion.equals("si")){
                    
                    archivo.delete();
                    System.out.println("Programa finalizado");  
               }
                   
               else {
                   System.out.println("Borrado cancelado, se finaliza el programa");
               }
            }
    }
}
