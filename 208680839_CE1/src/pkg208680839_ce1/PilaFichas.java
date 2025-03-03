/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class PilaFichas extends PilaDinamica {
    //call del constructor de la clase base
    public PilaFichas() {
        super(); 
    }
    
    /**
     * pone en pila un participante en la pila de fichas
     * 
     * @param participante es el nodo que representa el participante a apilar
     */
    public void push(Nodo participante) {
        super.push(participante);
    }
    /**
     * quita de la pila un participante de la pila de fichas
     * 
     * @return el nodo que representa al participante desapilado y si esta vacia devuelve null 
     */
    public Nodo pop() {
        return super.pop();
    }
    /**
     * revisa o comprueba si la pila esta vacia
     * 
     * @return true si la pila esta vacia y false si no lo esta
     */
    public boolean estaVacia() {
        return super.estaVacia();
    }
    /**
     * cuenta la cantidad de fichas en la pila
     * 
     * @return el numero total de fichas en la pila
     */
    public int cuentaFichas() {
        return super.cuentaFichas();
    }
}
