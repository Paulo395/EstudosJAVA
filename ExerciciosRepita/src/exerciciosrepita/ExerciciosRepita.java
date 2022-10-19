/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrepita;

import javax.swing.JOptionPane;

/**
 *
 * @author pauli
 */
public class ExerciciosRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resp;
        int n = 0;
        do{
            n += Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe um número"));
            resp = JOptionPane.showInputDialog(null,
                    "Você quer continuar? (S/N)");
            
        } while(resp.equals("s"));
        JOptionPane.showMessageDialog(null, "<html>O resultado é "
                + "<br>----------<hr>" + n );
    }
    
}
