/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class PilaDinamica {

    private Nodo cima; //ultimo nodo apilado

    public PilaDinamica() {
        this.cima = null; // Inicialmente la pila está vacía
    }
    // la documentacion javadoc de estos metodos esta en pilafichas
    public void push(Nodo participante) {
        participante.setSiguiente(cima);
        cima = participante;
    }

    public Nodo pop() {
        if (cima == null) {
            return null;
        }
        Nodo aux = cima;
        cima = cima.getSiguiente();
        return aux;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public int cuentaFichas() {
        int count = 0;
        Nodo actual = cima;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }
}
