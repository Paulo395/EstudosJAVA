/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private byte idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, byte idade, 
            float altura, float peso, int vitorias,
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    
    public void apresentar(){
        System.out.println("Chegando ao octógono o lutador " +
                this.getNome() + "!\n");
    }
    
    public void status(){
        System.out.println("----STATUS----\n"
                + "Nome: " + this.getNome() + "\n"
                + "Nacinalidade: " + this.getNacionalidade() + "\n"
                + "Idade: " + this.getIdade() + "\n"
                + "Altura: " + this.getAltura() + "\n"
                + "Peso: " + this.getPeso() + "\n"
                + "Categoria: " + this.getCategoria() + "\n"
                + "Virórias: " + this.getVitorias() + "\n"
                + "Derrotas: " + this.getDerrotas() + "\n"
                + "Empates: " + this.getEmpates() + "\n");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        System.out.println("O lutador " + this.getNome() + 
                " ganhou a disputa!!\n"
                + "Totalizando " + this.getVitorias() + " vitorias!\n");
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        System.out.println("O lutador " + this.getNome() + 
                " perdeu a luta!!\n"
                + "Totalizando " + this.getDerrotas() + " derrotas!\n");
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        System.out.println("O lutador " + this.getNome() + 
                " empatou a luta!!\n"
                + "Totalizando " + this.getEmpates() + " empates!\n");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<52.2) {
            this.categoria = "Inválido";
        } else if(this.getPeso()<=70.3){
            this.categoria = "Leve";
        } else if(this.getPeso()<=83.9){
            this.categoria = "Médio";
        } else if(this.getPeso()<=120.9){
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
