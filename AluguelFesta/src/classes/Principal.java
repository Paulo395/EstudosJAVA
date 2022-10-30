/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import java.util.Calendar;

/**
 *
 * @author pauli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c = Calendar.getInstance();
        
        Aluguel al = new Aluguel();
        Cliente cl = new Cliente();
        Tema te = new Tema();
        
        cl.cadastrarCliente("Paulo","12345678");
        al.cadastrarAluguel("03/05/2023",17,
                23,c.get(Calendar.DAY_OF_MONTH));
        al.cadastrarEndereco("Condominio","307",
                "Séde Esperança","20423487","DF",
                "Brasilia","Planaltina");
        te.cadastrarTema("Hallowen","Roxa");
        te.cadastrarItens(0,"Abobora",
                "Item de pláscio para o hallowen");
        
        Cadastro ca = new Cadastro(cl,al,te);
        ca.status();
        
    }
    
}
