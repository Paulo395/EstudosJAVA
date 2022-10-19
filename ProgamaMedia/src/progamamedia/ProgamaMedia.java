/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progamamedia;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class ProgamaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner é uma classe
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2;
        System.out.println("Sua média é: " + m);
        
        if(m>9){
            System.out.println("Parabens pequeno gafanhoto!");
        }
        
    }
    
}
