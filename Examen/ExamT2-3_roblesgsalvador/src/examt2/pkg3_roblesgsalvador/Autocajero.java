/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package examt2.pkg3_roblesgsalvador;
import bpc.daw.objetos.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Salva Robles
 */
public class Autocajero {

    /**
     * @param args the command line arguments
     */
    //Hecho por SRG
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        TarjetaCredito Tarjeta = new TarjetaCredito ( 100,  91222);

        
        
        boolean terminar = false;
        boolean acierto = false;
        
        int contraseña = 0;
        int intentos = 3;
        int numero = 91222;
        
            Scanner leer = new Scanner (System.in);

            System.out.println("Introduce la contraseña para ver tu saldo: ");
            
            try {
            contraseña = leer.nextInt();
             } catch (InputMismatchException edu){
                            System.out.println("Debes de utilizar numeros" );

                        } catch (Exception e){
                            System.out.println("Contraseña incorrecta");
                        
                        }
            for (int i=2; i<=intentos; i++) {
                
                try {
                 
                    if (contraseña == numero) {  
                        System.out.println("¡Has acertado!");
                        acierto = true;
                        break; }
                    
                    if (i <=2) { 
                            System.out.print("Otro intento: "); 
                            contraseña = leer.nextInt(); }
                            else if (i >= 3) {
                            System.out.print("Oh ... ULTIMO intento: ");
                            contraseña = leer.nextInt(); }

                        } catch (InputMismatchException edu){
                            System.out.println("Debes de utilizar numeros" );

                        } catch (Exception e){
                            System.out.println("Contraseña incorrecta");
                        
                        }
            }
            
            
            System.out.println("Contraseña correcta y tu saldo es:" + Tarjeta.getSaldo(contraseña));
        
         while ((acierto)||(!terminar)) {

            System.out.println("Indica de estas opciones cual desea hacer:");
                   System.out.println("‘1’: Ingresar dinero que se indique por consola.");
                   System.out.println("‘2’: Retirar dinero que se indique a continuación");
                   System.out.println("‘3’: obtener el saldo actual de la tarjeta.");
                   System.out.println("‘4’: terminar el programa solo al pulsar dicha opción");
            

                   numero = leer.nextInt();
                    
                    switch (numero){

                            //Ingresar dinero
                            case 1: 
                                    System.out.println("Cuanto dinero quiere ingresar?");
                                    int ingresar = leer.nextInt();        

                                    Tarjeta.ingresarDinero(ingresar);
                                    System.out.println("Tu saldo es:" + Tarjeta.getSaldo(contraseña));
                                break;

                            //Retirar dinero  
                            case 2:
                               System.out.println("Cuanto dinero quiere sacar?");
                                int sacar = leer.nextInt(); 
                                
                                boolean dinero = Tarjeta.sacarDinero(sacar, contraseña);
                                //condicion ? si es true : si es false;
                                String resultadoOperacion = dinero ? "existosa" : "Erronea";
                                System.out.println("Operacion " + resultadoOperacion);
                                System.out.println("Tu saldo es:" + Tarjeta.getSaldo(contraseña));  
                                
                                break;

                            //Obtener el saldo actual
                            case 3:
                                System.out.println("Tu saldo es:" + Tarjeta.getSaldo(contraseña));
                                break;

                            //Muestra el autor que queremos
                            case 4:
                                terminar = true;
                                acierto = false;
                                break;

                            default:
                                System.out.println("Opcion invalida, seleccione una opcion del 1 al 4"); 
                                break;
                    }            
          
        //if (numerolibro<= Lista.length){
                

        }
        System.out.println("Gracias por usar este Programa. Hecho por Salva Robles");   
    }
}

