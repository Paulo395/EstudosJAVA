/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contacorrente;

import java.util.Scanner;

/**
 *
 * @author pauli
 */
public class ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcao = "";
        Scanner t = new Scanner(System.in);
        Corrente c = new Corrente();
        Poupanca p = new Poupanca();
        
        while(true&&opcao!=null){
            System.out.println("\n\tBanco Nacional\n"
                    + "1 - Cadastrar\n"
                    + "2 - Consultar\n"
                    + "0 - Sair");
            
            opcao = t.next();
            
            switch(opcao){
                case "1":
                    System.out.print("\tCadastro\n"
                            + "Digite o seu nome: ");
                    String nome = t.next();
                    
                    System.out.print("Digite o seu CPF: ");
                    int cpf = t.nextInt();
                    
                    System.out.print("Digite o seu Ano de Nacimento: ");
                    int anoNacimento = t.nextInt();
                    
                    System.out.print("Quanto deseja depositar na conta? ");
                    float dinheiro = t.nextFloat();
                    
                    System.out.print("\nQue tipo de conta deseja criar?\n"
                            + "1 - Corrente\n"
                            + "2 - Poupança");
                    
                    opcao = t.next();
                    
                    if(opcao.equals("1")){
                        c.setNome(nome);
                        c.setCpf(cpf);
                        c.setAnoNacimento(anoNacimento);
                        c.setDinheiro(dinheiro);
                        c.getFrase();
                    } else {
                        p.setNome(nome);
                        p.setCpf(cpf);
                        p.setAnoNacimento(anoNacimento);
                        p.setDinheiro(dinheiro);
                        p.getFrase();
                    }
                    break;
                case "2":
                    System.out.println("\tConsulta\n"
                            + "Qual é o seu tipo de conta?\n"
                            + "1 - Corrente\n"
                            + "2 - Poupança");
                    
                    opcao = t.next();
                    
                    if(opcao.equals("1")){
                        System.out.println("O valor na Conta Corrente é "
                                + c.getDinheiro());
                    } else {
                        System.out.println("O valor na Conta Poupança é: "
                                + p.getDinheiro());
                    }
                    break;
                case "0":
                    System.out.println("\tAté a Proxima!");
                    opcao = null;
                    break;
                default:
                    System.out.println("\tComando Invalido!\n"
                            + "Tente Novamente");
            }
        }
    }
    
}
