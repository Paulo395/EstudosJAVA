/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Calendar;

/**
 *
 * @author pauli
 */
public class Pessoa {
    private String nome;
    private byte idade;
    private String sexo;
    private byte diaAniver;
    
    Calendar c = Calendar.getInstance();

    public Pessoa(String nome, byte idade, String sexo, byte diaAniver) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setDiaAniver(diaAniver);
    }
    
    public void fazerAniver(){
        if (this.getDiaAniver()==c.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("Hoje é seu anivêrsario, parabêns!");
            this.setIdade((byte) (this.getDiaAniver() + 1));
        } else {
            System.out.println("Hoje não é o seu aniversario!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getDiaAniver() {
        return diaAniver;
    }

    public void setDiaAniver(byte diaAniver) {
        this.diaAniver = diaAniver;
    }
    
}
