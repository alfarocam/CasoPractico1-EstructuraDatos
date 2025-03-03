/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class Nodo {
    //atributos
    private String nombreCompleto; 
    private int edad;               
    private String posicion;        
    private int numeroCamiseta;     
    private Nodo siguiente; //Referencia al siguiente nodo en la pila
    //constructor
    public Nodo(String nombreCompleto, int edad, String posicion, int numeroCamiseta) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.siguiente = null;
    }
    //get
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getEdad() {
        return edad;
    }
    public String getPosicion() {
        return posicion;
    }
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    //set
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
