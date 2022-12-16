/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Act8;
import bpc.daw.objetos.*;
/**
 *
 * @author Salva Robles
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        DepositoAgua Dep = new DepositoAgua(20,15);
        Dep.dibujar();
        DepositoAgua Dep2 = new DepositoAgua(20,5);
        Dep2.dibujar();
        //Retiramos 5 litros al primero deposito
        Dep.retirarLitro(); Dep.retirarLitro(); Dep.retirarLitro(); Dep.retirarLitro(); Dep.retirarLitro(); 
        //Llenamos los 5 litros del segundo deposito
        Dep2.añadirLitro(); Dep2.añadirLitro(); Dep2.añadirLitro(); Dep2.añadirLitro(); Dep2.añadirLitro(); 
        
        Dep.dibujar();
        Dep2.dibujar();
    }
}
