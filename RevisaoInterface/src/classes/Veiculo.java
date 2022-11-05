/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public abstract class Veiculo implements IVeiculo{
    private int velocidade;
    private String placa;
    private String chassi;
    private int ano;
    
    public static double calcularValorVenda(){
        return 0;
    }
    
    @Override
    public void ligar(){
        System.out.println("Ligando....");
    }
    
    @Override
    public void desligar(){
        System.out.println("Desligando....");
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
}
