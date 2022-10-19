/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojop;

import javax.swing.JOptionPane;

/**
 *
 * @author pauli
 */
public class DesafioJOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp=0;
        int soma=0;
        int quantidade = 0;
        int par = 0;
        int impar = 0;
        int maisDeCem = 0;
        int media = 0;
        
        do{
            resp = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um número: "));
            soma += resp;
            quantidade++;
            
            if(resp % 2 == 0){
                par++;
            } else {
                impar++;
            }
            
            if(resp>100) maisDeCem++;
            
            media = soma/quantidade;
        } while(resp!=0);
        JOptionPane.showMessageDialog(null,""
                + "Tota de valores: " + quantidade + "\n"
                + "A soma dos valores é: " + soma + "\n"
                + "Total de pares é: " + par + "\n"
                + "Total de impares é: " + impar + "\n"
                + "Acima de 100: " + maisDeCem + "\n"
                + "Média dos valores: " + media);
    }
    
}
