/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontatos;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class AgendaContatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda[] a = new Agenda[10];
        Scanner t = new Scanner(System.in);
        String n,opcao="";
        int r;
        byte c = 0;
        
        while(true&&opcao!=null){
            System.out.println("\n\tBem vindo a agenda\n\nDigite uma opção:\n"
                    + "1 - Cadastrar Contato\n"
                    + "2 - Exclui Contato\n"
                    + "3 - Buscar Contato\n"
                    + "4 - Imprimir Agenda\n"
                    + "5 - Imprimir Contato\n"
                    + "0 - Sair");
            
            opcao = t.next();
            
            switch(opcao){
                case "0": 
                    System.out.println("Obrigado por utilizar a agenda");
                    opcao = null;
                    break;
                case "1": 
                    a[c] = new Agenda();
                    a[c].armazenaPessoa();
                    c++;
                    break;
                case "2": 
                    System.out.println("Infome o nome que consta no cadastro: ");
                    n = t.next();
                    
                    for(int i = 0; i < c; i++){
                        a[i].removePessoa(n);
                    }
                    
                    break;
                case "3":                 
                    System.out.print("Infome o nome que consta no cadastro: ");
                    n = t.next();
                    
                    for(int i = 0; i < c; i++){
                        r = a[i].buscaPessoa(n);
                        
                        if(r==1){
                            System.out.println("O codigo de " + n + " é " + i);
                            break;
                        }else{
                            System.out.println("Usuario não encontrado em " + i);
                        }
                    }
                    break;
                case "4": 
                    for(int i = 0; i < c; i++){
                        a[i].imprimeAgenda();
                    }
                    break;
                case "5": 
                    System.out.println("Informe o codigo do cadastro:");
                    r = t.nextInt();
                    a[r].imprimePessoa(r);
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    
            }
        }
    }
    
}
