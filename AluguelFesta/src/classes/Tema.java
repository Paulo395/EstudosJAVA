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
public class Tema {
    private String nomeTema;
    private double valorAluguel;
    private String corToalha;
    
    private List <ItemTema> itens = new ArrayList<ItemTema>();
    
    public void cadastrarTema(String nomeTema, String corToalha){
        this.setNomeTema(nomeTema);
        this.setCorToalha(corToalha);
    }
    
    public void cadastrarItens(int id,String nomeItem,String descricao){
        itens.add(new ItemTema(id,nomeItem,descricao));
        this.setValorAluguel();
    }
    
    public String getNomeTema() {
        return nomeTema;
    }

    public void setNomeTema(String nomeTema) {
        this.nomeTema = nomeTema;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    private void setValorAluguel() {
        double valor = itens.size()*30;
        this.valorAluguel = valor;
    }

    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }
    
    public List<ItemTema> getItens() {
        return itens;
    }

    public void setItens(List<ItemTema> itens) {
        this.itens = itens;
    }
    
}
