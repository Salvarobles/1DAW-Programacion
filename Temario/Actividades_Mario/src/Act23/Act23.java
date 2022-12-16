/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act23;
import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Act23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        TarjetaCredito Tarjeta = new TarjetaCredito (1000, 2222);
        Scanner leer = new Scanner (System.in);
        
        try {
            System.out.println("Introduce la contraseña para ver tu saldo: ");
            int Contraseña = leer.nextInt();
        
            System.out.println("Tu saldo es:" + Tarjeta.getSaldo(Contraseña));
        

            System.out.println("Cunato dinero quiere ingresar?");
            int ingresar = leer.nextInt();        
        
            Tarjeta.ingresarDinero(ingresar);
            System.out.println("Tu saldo es:" + Tarjeta.getSaldo(Contraseña));
        
            System.out.println("Cuanto dinero quiere sacar?");
            int sacar = leer.nextInt();        
        
            boolean dinero = Tarjeta.sacarDinero(sacar, Contraseña);
            //condicion ? si es true : si es false;
                String resultadoOperacion = dinero ? "existosa" : "Erronea";
                System.out.println("Operacion " + resultadoOperacion);
        
                System.out.println("Tu saldo es:" + Tarjeta.getSaldo(Contraseña));            
            
            
        }catch(java.lang.Exception e) {
                System.out.println("Contraseña incorrecta");
                }   
    }
}
