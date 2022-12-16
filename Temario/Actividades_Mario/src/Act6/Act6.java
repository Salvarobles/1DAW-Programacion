/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act6;
import bpc.daw.mario.*;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int x = leer.nextInt();
        int y =leer.nextInt();
        //1500 800
        if (x>=1500 && y>=800) {
            Mario Mario = new Mario (x, y);
        } 
        else {
            System.out.println("El programa no se puede ejecutar, fuera de alcance");
        }
         }
}
