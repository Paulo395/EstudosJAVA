/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaodo;
import java.util.Scanner;
/**
 *
 * @author pauli
 */
public class RepeticaoDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 0;
        String resp;
        Scanner t = new Scanner(System.in);
        /*
        do{
            System.out.println("Olá, Mundo " + (i+1));
            i++;
        } while(i<5);
        */
        do{
            System.out.print("Digite um número: ");
            s += t.nextInt();
            System.out.println("Deseja continuar? (S/N)");
            resp = t.next();
        } while(resp.equals("s"));
        System.out.println(s);
    }
    
}
