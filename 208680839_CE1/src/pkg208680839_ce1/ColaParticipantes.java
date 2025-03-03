/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class ColaParticipantes extends Cola {
    //contructor de la clase base cola
    public ColaParticipantes() {
        super(); 
    }
    //la documentacion javadoc de estos metodos esta en cola
    public void encolar(String nombreCompleto, int edad, String posicion, int numeroCamiseta) {
        super.encolar(nombreCompleto, edad, posicion, numeroCamiseta);
    }

    public Nodo desencolar() {
        return super.desencolar();
    }

    public boolean estaVacia() {
        return super.estaVacia();
    }

    public int cuentaParticipantes() {
        return super.cuentaParticipantes();
    }
}
