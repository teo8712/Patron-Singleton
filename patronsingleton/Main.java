/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import modelo.Singleton;

/**
 *
 * @author estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        
        s1.setNumero1(40);
        s1.setNumero2(20);
        
        System.out.println("En el objeto uno la suma fue: "+s1.suma());
        
        s2.setNumero1(5);
        s2.setNumero2(6);
        
        System.out.println("En el objeto dos la suma fue: "+s2.suma()+"\n");
        
        System.out.println("Imprimiendo los dos objetos a la vez:\n"+s1.suma()+"\n"+s2.suma());
    }
    
}
