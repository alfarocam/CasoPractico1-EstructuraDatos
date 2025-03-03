/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class Cola {

    private Nodo frente; //primer elemento de la cola
    private Nodo ultimo; //ultimo elemento de la cola

    public Cola() {
        frente = null;
        ultimo = null;
    }
    /**
     * pone en cola un nuevo participante 
     * 
     * @param nombreCompleto es el nombre completo del participante
     * @param edad es la edad del participante
     * @param posicion posicion en la que juega el participante
     * @param numeroCamiseta numero de camisa con el que jeuga el participante
     */
    public void encolar(String nombreCompleto, int edad, String posicion, int numeroCamiseta) {
        Nodo nuevo = new Nodo(nombreCompleto, edad, posicion, numeroCamiseta);
        if (ultimo != null) {
            ultimo.setSiguiente(nuevo);
        } else {
            frente = nuevo;
        }
        ultimo = nuevo;
    }
    /**
     * quita de la cola o "desencola" un participante 
     * 
     * @return el nodo que representa al participante desencolado o si la cola esta vacia devuelve null 
     */
    public Nodo desencolar() {
        if (frente == null) {
            return null;
        }
        Nodo aux = frente;
        frente = frente.getSiguiente();
        if (frente == null) {
            ultimo = null;
        }
        return aux;
    }
    /**
     * revisa o comprueba si la cola esta vacia
     * 
     * @return true si la cola esta vacia y false en caso de que no lo este
     */
    public boolean estaVacia() {
        return frente == null;
    }
    /**
     * cuenta la cantidad de participantes en la cola
     * 
     * @return el numero total de participantes en la cola
     */
    public int cuentaParticipantes() {
        int count = 0;
        Nodo actual = frente;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }
}

