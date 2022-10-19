/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int x){
        num = x;
        int f = 1;
        String s = "";
        
        for (int i = x; i > 1; i--) {
            f += i;
            s += i + " x ";
        }
        
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
}
