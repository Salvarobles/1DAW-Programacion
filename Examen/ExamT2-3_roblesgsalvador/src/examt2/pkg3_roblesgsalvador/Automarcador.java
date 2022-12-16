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
public class Automarcador {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        MarcadorBaloncesto Marcador = new MarcadorBaloncesto("Local" , "Visitante");
        
        String espacio = "\n";
        
        boolean terminar = false;
        
        char equipo1 = 'L';
        char equipo2 = 'V';
        
        int numero = 0;
        
        Scanner leer = new Scanner (System.in);

        
         do {

            System.out.println("Indica de estas opciones cual desea hacer:");
                   System.out.println("- Equipo que anotara (Equipo Local--> 8|Equipo visitante-->9).");
                   System.out.println("‘Pulsa el 2’: Ver marcador actual.");
                   System.out.println("‘Pulsa el 3’: Finalizar el partido y mostrar el marcador actual.");
                   
                   try{
                    numero = leer.nextInt();   
                   } catch (InputMismatchException edu){
                            System.out.println("Debes de utilizar numeros" + edu.getMessage());
                    }
                    

                    
                    switch (numero){
                            
                            //Marcar el equipo 1
                            case 8: 
                                System.out.println("Maque la puntacion numero enteros (1,2,3): ");
                                try{
                                    int puntos = leer.nextInt();
                                    Marcador.anotarCanasta(equipo1, puntos);
                                    
                                    if (puntos <=3){
                                        break;        
                                    }else {
                                        System.out.println("Has superador el limite de puntos. Porfavor que sea del 1, 2, o 3");
                                    }
                                } catch (InputMismatchException edu){
                                    System.out.println("Debes de utilizar numeros" + edu.getMessage());
                                }
                               
                                

                                

                            //Retirar dinero 2 
                            case 9:
                                System.out.println("Maque la puntacion numero enteros (1,2,3): ");
                                try{
                                    int puntos2 = leer.nextInt();
                                    Marcador.anotarCanasta(equipo2, puntos2);
                                    
                                    if (puntos2 <=3){
                                        break;        
                                    }else {
                                        System.out.println("Has superador el limite de puntos. Porfavor que sea del 1, 2, o 3");
                                    }
                                } catch (InputMismatchException edu){
                                    System.out.println("Debes de utilizar numeros" + edu.getMessage());
                                }
                                
                            //Obtener datos actuales
                            case 2:
                                System.out.println(Marcador.getNombreLocal() +  espacio +
                                Marcador.getPuntosLocal() + espacio +
                                Marcador.getNombreVisitante() +  espacio + 
                                Marcador.getPuntosVisitante() ); 
                                
                                System.out.println("Va ganando: " + Marcador.getNombreEquipoGanador());
                                break;
                            
                            case 3:
                                System.out.println("Fin del partido, marcador final." + Marcador.getNombreLocal() +  espacio +
                                Marcador.getPuntosLocal() + espacio +
                                Marcador.getNombreVisitante() +  espacio + 
                                Marcador.getPuntosVisitante() );
                                terminar = true;
                                break;

                                

                            default:
                                System.out.println("Opcion invalida, seleccione una opcion del 1 al 3"); 
                                break;
                    }            
          
        //if (numerolibro<= Lista.length){
                

        }while (!terminar);{
        System.out.println("Gracias por usar este Programa. Hecho por Salva Robles");
        }
    }
}
