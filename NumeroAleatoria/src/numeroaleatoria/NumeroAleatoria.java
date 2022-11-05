/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatoria;

import java.util.Random;

/**
 *
 * @author pauli
 */
public class NumeroAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double num = Math.random()*3;
        Random a = new Random();
        int num = a.nextInt(3);
        System.out.println(num);
    }
    
}
