/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacorrente;

/**
 *
 * @author pauli
 */
public class Conta {
    protected String nome;
    protected int cpf;
    protected int AnoNacimento;
    protected float dinheiro;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAnoNacimento() {
        return AnoNacimento;
    }

    public void setAnoNacimento(int AnoNacimento) {
        this.AnoNacimento = AnoNacimento;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
}
