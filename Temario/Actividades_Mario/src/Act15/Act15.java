/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act15;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String Clave = "hola";
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Introduzca la contraseña");
        String Contraseña = leer.next();
        
        
        
        System.out.println("Las dos frases son iguales?" + Clave.equals(Contraseña));
            
    }
}
