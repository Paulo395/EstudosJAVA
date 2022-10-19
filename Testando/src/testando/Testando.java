/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testando;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class Testando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String[] s = new String[10];
        Scanner t = new Scanner(System.in);
        
        s[0] = "Paulo";
        s[1] = "Henrique";
        s[2] = "Oliveira";
        
        String a = t.next();
        
        for(int i=0;i<3;i++){
            if(a.equals(s[i])){
                System.out.println("Achou\nPocisão: " + i);
            }
        }
        */
        
        int v0 = 3;
        int v1 = v0++; //v0 4, v1 3
        int v2 = ++v1; // v1 5 v2 5
        
        v1 += v0; // v1 7
        v2 += --v1; // v2 11
        
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        
        int x,y;
        double z;
        
        x = 5;
        y = 2;
        z = x/y;
        
        /*
        Por as variaveis serem inteiras JAVA entende que o resultado é inteiro
        Mas z ainda tera uma casa deximal, que será 0
        */
        System.out.println(z);
        
        int total = 0;
        int[] c = new int[13];
        
        for (int i = 0; i < c.length; i++) {
            c[i] = i + i;
        }
        
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        
        System.out.println(total);
    }
    
}
