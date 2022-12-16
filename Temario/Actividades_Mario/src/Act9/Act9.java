/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act9;
import bpc.daw.objetos.*;
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
        Caja caja = new Caja("Bienvenidos al instituto");
        
        caja.abrirCaja();
        
        if (caja.estaAbierta()){
            
            System.out.println(caja.getMensaje());
        }
        else {
            caja.abrirCaja();
            System.out.println("La caja esta cerrada");
            System.out.println("La caja se va abrir: " + caja.getMensaje());
        }
    }
}
