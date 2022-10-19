/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemetodos;

/**
 *
 * @author pauli
 */
public class Operacoes {
    
    public static String contador(int x,int y){
        String s = "";
        
        for (int i = x; i <= y; i++) {
            s += i + " ";
        }
        return s;
    }
}
