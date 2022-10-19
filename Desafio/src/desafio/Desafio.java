/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author pauli
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date horas = new Date();
        Locale local = Locale.getDefault();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        
        System.out.println("As horas são: " + horas);
        System.out.println("O idioma do sistema é: " + local);
        System.out.println("A resolução do dispositivo é: " + d.width + "x" 
                + d.height);
    }
    
}
