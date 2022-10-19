/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progamaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class ProgamaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cria o objeto t
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu ano de nacimento: ");
        int nasc = t.nextInt();
        
        //Adquire o ano pelo sistema
        Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
        
        int idade = ano - nasc;
        
        if(idade>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
