/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criandoclasses;

/**
 *
 * @author pauli
 */
public class CriandoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando um objeto
        Caneta c1 = new Caneta();
        
        //Atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f; //FLOAT em JAVA tem f ao final
        
        //c1.status();
        //c1.destampar();
        c1.tampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        //c2.status();
        c2.rabiscar();
        
    }
    
}
