/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosbeans;

/**
 *
 * @author pauli
 */
public class Dado {
    private double dado;
    
    void lancaDado(){
        dado = (Math.random()*7);
        imprimeDado();
    }
    
    void imprimeDado(){
        System.out.println(dado);
    }
    
    /*
    Codigo gerado na compilação
    String nome(String paulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */
}
