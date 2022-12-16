/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act5;
import bpc.daw.mario.*;
/**
 *
 * @author Salva Robles
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Cañon Cañon1 = new Cañon (200,200);
        Cañon Cañon2 = new Cañon (800,200);

        
        Cañon1.disparar(200, 300);
        Cañon1.disparar(200, 700);
        
        Cañon2.disparar(100, 100);
        Cañon2.disparar(200, 100);
        Cañon2.disparar(200, 50);
        
        Cañon1.getTotalDisparosRealizados();
        Cañon2.getTotalDisparosRealizados();
        System.out.println("El primer cañon a disparado " + Cañon1.getTotalDisparosRealizados());
        System.out.println("El segundo cañon a disparado " + Cañon2.getTotalDisparosRealizados());
    }
}
