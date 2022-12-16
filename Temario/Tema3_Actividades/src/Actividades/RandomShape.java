/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividades;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class RandomShape  {

    public static Rectangle2D randomRect(){
        int x = (int) (Math.random() * 800) + 1;
        int y = (int) (Math.random() * 800) + 1;
        int width = (int) (Math.random() * 800) + 1;
        int height = (int) (Math.random() * 800) + 1;


        return new Rectangle2D.Double(x, y, width, height);

    }

    public static Ellipse2D randomEllip(){
        int x = (int) (Math.random() * 800) + 1;
        int y = (int) (Math.random() * 800) + 1;
        int width = (int) (Math.random() * 800) + 1;
        int height = (int) (Math.random() * 800) + 1;


        return new Ellipse2D.Double(x, y, width, height);
    } 
}