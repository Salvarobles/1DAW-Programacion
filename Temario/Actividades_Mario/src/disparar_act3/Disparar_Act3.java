/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package disparar_act3;
import bpc.daw.mario.*;
/**
 *
 * @author Salva Robles
 */
public class Disparar_Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Empezamos con el posicionamiento de los Objetos
    Mario M = new Mario (200, 400);
    Cañon C = new Cañon (750, 400);
    Luigi L = new Luigi (1300, 400);
        
    M.correrHacia(400, 400);
    L.correrHacia(1000, 400);
    
    C.disparar(500, 400);
    C.disparar(1000, 400);
    
    System.out.println("Luigi ha muerto. Game Over");
    
    
    }
}
