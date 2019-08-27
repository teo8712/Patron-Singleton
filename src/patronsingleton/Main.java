package patronsingleton;

import modelo.Singleton;

public class Main {

    public static void main(String[] args) {        
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        
        // Objeto s1
        s1.setNumero1(40);
        s1.setNumero2(20);
        
        System.out.println("En el objeto uno la suma fue: "+s1.suma());
        
        // Objeto s2
        s2.setNumero1(5);
        s2.setNumero2(6);
        
        System.out.println("En el objeto dos la suma fue: "+s2.suma()+"\n");
        
        // Ambos objetos
        System.out.println("Imprimiendo los dos objetos a la vez:\n"+s1.suma()+"\n"+s2.suma());
    }
}
