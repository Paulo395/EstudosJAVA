/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progamapernas;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class ProgamaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite quantas pernas tem: ");
        int pernas = t.nextInt();
        
        String frase;
        
        switch (pernas){
            case 1:
                frase = "Saci";
                break;
            case 2:
                frase = "Bípede";
                break;
            case 4:
                frase = "Quadrúpede";
                break;
            case 6: // Verificar no video
                frase = "Aranha";
                break;
            default:
                frase = "ET";
        }
        System.out.println(frase);
    }
    
}
