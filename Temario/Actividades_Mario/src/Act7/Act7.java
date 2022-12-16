/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act7;
import bpc.daw.objetos.*;
/**
 *
 * @author Salva Robles
 */

public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int capmax = 50;
        int capinicial = 15;
        
        DepositoAgua Dep = new DepositoAgua(capmax,capinicial);
        Dep.dibujar();
        
//operacion
        int porciento = (capinicial*capmax)/100; 
        System.out.println("La ocupacion del deposito es " + porciento + "%");
    }
}
