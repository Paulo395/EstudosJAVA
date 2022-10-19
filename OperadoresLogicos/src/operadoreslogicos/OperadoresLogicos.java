/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author pauli
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        // E
        r = (x<7&&y<z)?true:false;
        System.out.println(r);
        
        //OU
        r = (x<7||y<z)?true:false;
        System.out.println(r);
        
        //XOU^
        r = (x<y^y==z)?true:false;
        System.out.println(r);
        
    }
    
}
