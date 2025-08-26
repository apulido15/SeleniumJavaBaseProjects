package org.example.poo.behaviour;

public interface Volador {
    int ALTURA_MAXIMA = 1000; // metros, constante

    void volar(); // método abstracto

    default void despegar() {
        System.out.println("Preparando despegue... ¡Volando alto!");
    }
}