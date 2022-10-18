/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaaula05;

/**
 *
 * @author pauli
 */
public class ContaAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.abrirConta("CC");
        c1.setDono("Paulo");
        c1.depositar(300);
        c1.EstadoAtual();
        
        Conta c2 = new Conta();
        c2.abrirConta("CP");
        c2.setDono("Henrique");
        c2.depositar(500);
        c2.sacar(100);
        c2.EstadoAtual();
        /*
        Scanner t = new Scanner(System.in);
        String opcao = "";
        float valor;
        
        
        while(opcao!=null){
            System.out.println("\n\tBanco\n"
                    + "1 - Criar Conta\n"
                    + "2 - Fechar Conta\n"
                    + "3 - Depositar\n"
                    + "4 - Sacar\n"
                    + "5 - Pagar Mensal\n"
                    + "6 - Estado\n"
                    + "0 - Sair");
            
            opcao = t.next();
            
            switch(opcao){
                case "1": //Falta o tipo
                    System.out.print("Digite o número da conta: ");
                    c.setNumConta(t.nextInt());
                    
                    System.out.print("Digite o tipo de conta (CC/CP):");
                    c.setTipo(t.next());
                    
                    System.out.print("Digite o nome do titular: ");
                    c.setDono(t.next());
                    
                    System.out.print("Digite o seu saldo: ");
                    c.setSaldo(t.nextFloat());
                    
                    c.setStatus(true);
                    break;
                case "2":
                    c.fecharConta();
                    break;
                case "3":
                    System.out.print("Digite o valor que deseja depositar: ");
                    valor = t.nextFloat();
                    
                    c.depositar(valor);
                    break;
                case "4":
                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = t.nextFloat();
                    
                    c.sacar(valor);
                    break;
                case "5":
                    c.pagarMensal();
                    break;
                case "6":
                    c.EstadoAtual();
                    break;
                case "0":
                    System.out.println("Até a proxima!");
                    opcao = null;
                    break;
                default:
                    System.out.println("Comando inválido, tente novamente!");
            }
        }*/
    }
    
}
