/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg208680839_ce1;

/**
 *
 * @author CamilaAlfaro
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Caso Practico Evaluado #1 - Camila Alfaro Rivera");
        //instancias
        ColaParticipantes cola = new ColaParticipantes();
        PilaFichas pilaSub7 = new PilaFichas();
        PilaFichas pilaSub9 = new PilaFichas();
        PilaFichas pilaSub11 = new PilaFichas();

        //participantes
        cola.encolar("Mario Chaves", 7, "Portero", 33);
        cola.encolar("Samuel Rodriguez", 9, "Delantero", 10);
        cola.encolar("Juan Castro", 11, "Defensa", 4);
        cola.encolar("Luis Perez", 6, "Defensa", 7);
        cola.encolar("Matias Contreras", 10, "Delantero", 15);
        cola.encolar("Isabella Dominguez", 8, "Portera", 9);
        cola.encolar("Tomas Ramirez", 8, "Defensa", 5);
        cola.encolar("Rosa Munoz", 7, "Delantera", 12);
        cola.encolar("Pablo Porras", 7, "Delantero", 18);

        //contar participantes
        System.out.println("Se han registrado " + cola.cuentaParticipantes() + " participantes al torneo ");

        //clasificacion de participantes
        while (!cola.estaVacia()) {
            Nodo participante = cola.desencolar();
            if (participante.getEdad() <= 7) {
                pilaSub7.push(participante);
            } else if (participante.getEdad() <= 9) {
                pilaSub9.push(participante);
            } else {
                pilaSub11.push(participante);
            }
        }

        //cantidad de fichas por categoria
        //years porque no sabía qué ponerle 
        System.out.println("En la pila de **Ninos de 7 years o menos** hay " + pilaSub7.cuentaFichas() + " fichas de inscripcicion");
        System.out.println("En la pila de **Ninos de 8 y 9 years cumplidos** hay " + pilaSub9.cuentaFichas() + " fichas de inscripcion");
        System.out.println("En la pila de **Ninos de 10 y 11 years** hay " + pilaSub11.cuentaFichas() + " fichas de inscripcion");
    }

}
