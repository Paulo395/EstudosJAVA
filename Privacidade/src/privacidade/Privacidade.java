/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package privacidade;

/**
 *
 * @author pauli
 */
public class Privacidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.tampar();
        c1.status();
        c1.carga = 90;
        /*
            Main tem acesso a atributos e metodos private pos o objeto foi 
            instanciado nessa classe.
        */
    }
    
}
