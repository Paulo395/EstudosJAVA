/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criandoclasses;

/**
 *
 * @author pauli
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada; //O padrão em JAVA é False
    
    void status(){
        System.out.println("Modelo: " + this.modelo + "\n"
                + "Uma caneta " + this.cor + "\n"//Não tendo nada retorna NULL
                + "Ponta: " + this.ponta + "\n"
                + "Carga: " + this.carga + "\n" //Não tendo nada retorna 0
                + "Está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar.");
        }else{
            System.out.println("Estou rabisco");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
