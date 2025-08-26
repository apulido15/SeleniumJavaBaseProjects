package org.example.poo.behaviour;

public interface Nadador {
    double VELOCIDAD_PROMEDIO = 2.5; // m/s

    void nadar();

    static void mostrarTiposDeNado() {
        System.out.println("Tipos: Anguiliforme, Carangiforme, Ostraciforme, Aletas y Extremidades.");
    }
}