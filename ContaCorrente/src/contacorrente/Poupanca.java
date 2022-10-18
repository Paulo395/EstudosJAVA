/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacorrente;

/**
 *
 * @author pauli
 */
public class Poupanca extends Conta{
    private String frase = "Essa conta é do tipo Poupança!\n";

    public void getFrase(){
        System.out.println(this.frase);
    }
}
