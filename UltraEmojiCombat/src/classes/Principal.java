/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

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
        Lutador[] l = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy","França",
                (byte)31,1.75f,68.9f,11,2,1);
        
        l[1] = new Lutador("Putscript","Brasil",
                (byte)29,1.68f,57.8f,14,2,3);
        
        l[2] = new Lutador("Snapshadow","EUA",
                (byte)35,1.65f,80.9f,12,2,1);
        
        l[3] = new Lutador("Dead Code","Austrália",
                (byte)28,1.93f, 81.6f,13,0,2);
        
        l[4] = new Lutador("Ufocobol","Brasil",
                (byte)37,1.70f, 119.3f,5,4,3);
        
        l[5] = new Lutador("Nerdaart","EUA",
                (byte)30,1.81f, 105.7f,12,2,4);
        
        Lutar lu = new Lutar();
        
        l[0].status();
        l[1].status();
        lu.marcarLuta(l[0], l[1]);
        lu.lutar();
        l[0].status();
        l[1].status();
        
    }
    
}
