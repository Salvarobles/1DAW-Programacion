/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act10;
import bpc.daw.objetos.*;
/**
 *
 * @author Salva Robles
 */
public class Act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
            Caja caja = new Caja("Hola");
            caja.abrirCaja();
            caja.getMensaje();
            System.out.println(caja.getMensaje());
     

        boolean cambiarMensaje = caja.cambiarMensaje("adios");
            caja.abrirCaja();
            caja.getMensaje();
            System.out.println(caja.getMensaje());            
    }
}
