/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauli
 */
public class Aluguel{
    private String dataFesta;
    private int horaInicio;
    private int horaTermino;
    private int dataCadastro;
    private double valorCobrado;
    
    List<Endereco> enderecos = new ArrayList<Endereco>();
    
    //SÓ DA PRA TER ACESSO AOS METODOS DE LUGARES DENTRO DE METODOS

    public void cadastrarAluguel(String dataFesta, int horaInicio, 
            int horaTermino, int dataCadastro) {
        this.setDataFesta(dataFesta);
        this.setHoraInicio(horaInicio);
        this.setHoraTermino(horaTermino);
        this.setDataCadastro(dataCadastro);
        this.setValorCobrado();
    }
            
    public void cadastrarEndereco(String logradouro, String numero, 
            String complemento,String cep, String uf, String cidade,
            String bairro){
        enderecos.add(new Endereco(logradouro,numero,complemento,cep,uf,
                cidade,bairro));
    }

    public String getDataFesta() {
        return dataFesta;
    }

    public void setDataFesta(String dataFesta) {
        this.dataFesta = dataFesta;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }

    public int getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(int dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public double getValorCobrado() {
        return valorCobrado;
    }

    private void setValorCobrado() {
        int valor = 500;
        if (this.getDataCadastro() <5) {
            valor -= 100;
        } else if(this.getDataCadastro() < 10){
            valor -= 60;
        } else if(this.getDataCadastro() < 20){
            valor -= 20;
        }
        this.valorCobrado = valor;
    }
    
}