/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privacidade;

/**
 *
 * @author pauli
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; //O padrão em JAVA é False
    
    public void status(){
        System.out.println("Modelo: " + this.modelo + "\n"
                + "Uma caneta " + this.cor + "\n"//Não tendo nada retorna NULL
                + "Ponta: " + this.ponta + "\n"
                + "Carga: " + this.carga + "\n" //Não tendo nada retorna 0
                + "Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar.");
        }else{
            System.out.println("Estou rabisco");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
