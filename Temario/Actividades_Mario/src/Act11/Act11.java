/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act11;
import bpc.daw.objetos.*; 
/**
 *
 * @author Salva Robles
 */
public class Act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Caja caja = new Caja("Hola");
        caja.abrirCaja();
        caja.getMensaje();
        System.out.println(caja.getMensaje());
       
        String c = caja.getMensaje();
        
        Caja caja2 = new Caja("adios");
        caja2.abrirCaja();
        caja2.getMensaje();        
        System.out.println(caja2.getMensaje());
        
        String c2 = caja.getMensaje();
        
        
        
        System.out.println(caja2.getMensaje());
        
    }
}
