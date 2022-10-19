/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiovoto;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class DesafioVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite seu ano de nacimento: ");
        Scanner t = new Scanner(System.in);
        int idade = t.nextInt();
        
        //Pegando idade atual
        Calendar c = Calendar.getInstance();
        idade = c.get(Calendar.YEAR) - idade;
        
        System.out.println("A sua idade é " + idade);
        
        if((idade>=16&&idade<18) || idade>70){
            System.out.println("Seu voto é opcional");
        }else if(idade>=18){
            System.out.println("Seu voto é obrigatorio");
        }else{
            System.out.println("Você não pode votar");
        }
    }
    
}
