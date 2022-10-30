/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String uf;
    private String cidade;
    private String bairro;

    public Endereco(String logradouro, String numero, String complemento, 
            String cep, String uf, String cidade, String bairro) {
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setUf(uf);
        this.setCidade(cidade);
        this.setBairro(bairro);
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}