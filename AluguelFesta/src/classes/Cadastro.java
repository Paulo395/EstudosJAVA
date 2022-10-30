/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author pauli
 */
public class Cadastro {
    private Cliente c;
    private Aluguel a;
    private Tema t;

    public Cadastro(Cliente c, Aluguel a, Tema t) {
        this.c = c;
        this.a = a;
        this.t = t;
    }
    
    public void status(){
        System.out.println("##### CADASTRO #####\n"
                + "Cliente: " + c.getNome() + "\n"
                + "Festa: " + a.enderecos.get(0).getCidade() + "\n"
                + "Data do evento: " + a.getDataFesta() + "\n"
                + "Tema: " + t.getNomeTema() + " com toalha " + t.getCorToalha() + "\n"
                + "item: " + t.getItens().get(0).getNomeItem() + "\n"
                + "Valor: " + (a.getValorCobrado()+t.getValorAluguel()) + "\n");
    }
}
