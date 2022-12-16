/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Salva Robles
 */
public class Act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double N = leer.nextInt();
        double s, a = 1.00000d;
        

        double operacionS =  1/2*(a + N/a);
         DecimalFormat df = new DecimalFormat("#.000000");
         System.out.println("El valor absoluto entre S y A: " + df.format(operacionS));        
        
         
        

    }
}
