package org.example.poo.behaviour;

public interface Corredor {
    int DISTANCIA_MAXIMA = 10000; // metros

    void correr();

    default void calentar() {
        System.out.println("Estirando músculos antes de correr...");
    }
}