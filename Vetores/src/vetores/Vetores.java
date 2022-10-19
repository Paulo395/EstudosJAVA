/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author pauli
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {9,6,1,5,2,7};
        
        int p = Arrays.binarySearch(n,7);
        System.out.println("O valor 7 está na posição " + p);
        
        //Metodo na Classe Arrays para organizar um vetor do menor para o maior
        Arrays.sort(n);
        
        //FOR EACH
        for(int valor: n){
            System.out.println(valor + " ");
        }
    }
    
}
