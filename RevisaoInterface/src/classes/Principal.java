/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v = new Motocicleta();
        Veiculo v2 = new Automovel();
        
        v.setPlaca("Cebolinha");
        System.out.println("Placa: " + v.getPlaca());
    }
    
}
