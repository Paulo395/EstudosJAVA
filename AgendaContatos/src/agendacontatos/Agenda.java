/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontatos;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class Agenda {
    private Contato listaDeContato = new Contato();
    Scanner t = new Scanner(System.in);
    
    void armazenaPessoa(){
        System.out.print("Digite o seu nome: ");
        listaDeContato.nome = t.nextLine();
        
        System.out.print("Digite o seu número: ");
        listaDeContato.telefone = t.nextInt();
        
        System.out.print("Digite o seu e-mail: ");
        listaDeContato.email = t.next();
    }
    
    void removePessoa(String nome){
        if(nome.equals(listaDeContato.nome)){
            listaDeContato.nome = null;
            listaDeContato.telefone = 0;
            listaDeContato.email = null;
            
            System.out.println("Cadastro removido com sucesso.");
        }
    }
    //isEmpity
    int buscaPessoa(String n){
        if(n.equals(listaDeContato.nome)){
            return 1;
        } else {
            return 0;
        }
    }
    
    //Imprime todos os contatos cadastrados
    void imprimeAgenda(){
        System.out.println("\nO seu nome é:      " + listaDeContato.nome);
        System.out.println("O seu número é:    " + listaDeContato.telefone);
        System.out.println("O seu email é:     " + listaDeContato.email);
    }
    
    //Imprime uma listaDeContato especifica atraves do indice
    void imprimePessoa(int index){
        System.out.println("\nCodigo cadastro:   " + index);
        System.out.println("O seu nome é:   " + listaDeContato.nome);
        System.out.println("O seu número é: " + listaDeContato.telefone);
        System.out.println("O seu email é:  " + listaDeContato.email);
    }
}
