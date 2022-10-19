/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetormes;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class VetorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] m = {"Jan","Fev","Marc","Abr","Mai","Jun","Jul","Ago","Set",
                        "Out","Nov","Dec"};
        int[] n = {1,2,3,4,5,6,7,8,9,10,11,12};
        Scanner t = new Scanner(System.in);
        
        System.out.print("Escreva o nome do mês: ");
        String res = t.next();
        
        for(int i=0;i<m.length;i++){
            if(res.equals(m[i])){
                System.out.println(res + " é o " + n[i] + " mês do ano!" );
                break;
            }
        }
    }
    
}
