/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;

import java.util.Scanner;

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
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Cuantas piezas se pueden cazar hoy?");
        int piezas = leer.nextInt();
        
        int[] lista = new int[piezas];
        
        System.out.println("--Empezamos la caza");
        
        int numero = 0;

        
        
        for (int total = 0; total<=piezas; ){
            
            System.out.println("Introduzca el numero de piezas cazadas:");
            numero = leer.nextInt();
            numero += lista[total];
            System.out.println("Usted lleva cazadas " + numero);
        
        }int total = 0;
            while (total==piezas);
        
        System.out.println("El numero maximo de piezaas ha sido excedido"
                + "Pulse una tecla para ");
    }
}
