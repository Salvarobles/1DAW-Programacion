/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);
        Random aleatorio = new Random();
        int f = 0;
        
        do {
            
                       f = lista.get(aleatorio.nextInt(lista.size()));
                       System.out.println(f);

        
        } while ();
        
    }
}
