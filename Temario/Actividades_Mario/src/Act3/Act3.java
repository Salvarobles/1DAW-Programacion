/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act3;
import bpc.daw.mario.*;
/**
 *
 * @author Salva Robles
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Posiciones
        Mario M = new Mario (750,400);
        Luigi L = new Luigi (800,400);
        Seta S = new Seta (800,300);        
        Planta P = new Planta (700,400);
        Planta P1 = new Planta (650,400);
        Planta P2 = new Planta (600,400); 
        Cañon C = new Cañon (200,300);
        
        //Acciones
        S.andarHacia(1, 1);
        M.saltar();
        C.disparar(800, 400);
        P.comer(true);
        P1.comer(true);
        P2.comer(true);
        
        
    }
}
