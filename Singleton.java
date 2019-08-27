/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiantes
 */
public class Singleton {
    
    private static Singleton instancia;
    private double numero1; 
    private double numero2; 
    private double suma; 
    
    private Singleton(){}
    
    public static void CrearInstancia(){
        if(instancia==null){
            instancia= new Singleton();
        }
    }
    
    public static Singleton getInstancia(){
        if(instancia==null)
            CrearInstancia();
        return instancia;
    }
    
    public double suma(){
        return (numero1+numero2);
    }

    //Getters and setters
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
    
    
    
}
