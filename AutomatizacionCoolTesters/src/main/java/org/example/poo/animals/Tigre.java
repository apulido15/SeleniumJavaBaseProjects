package org.example.poo.animals;

import org.example.poo.animals.base.Animal;
import org.example.poo.animals.base.Humano;
import org.example.poo.behaviour.Corredor;
import org.example.poo.behaviour.Nadador;

public class Tigre extends Animal implements Corredor, Nadador {

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El tigre ruge: ¡Grrr!");
    }

    @Override
    public void correr() {
        calentar(); // método default de Corredor
        System.out.println("El tigre corre con fuerza. Puede llegar hasta " + DISTANCIA_MAXIMA + " metros.");
    }

    @Override
    public void nadar() {
        System.out.println("El tigre también sabe nadar a " + VELOCIDAD_PROMEDIO + " m/s.");
    }
}

