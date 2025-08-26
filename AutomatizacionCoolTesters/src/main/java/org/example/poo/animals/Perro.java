package org.example.poo.animals;

import org.example.poo.animals.base.Animal;
import org.example.poo.behaviour.Corredor;

public class Perro extends Animal implements Corredor {
    private final String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }

    @Override
    public void correr() {
        System.out.printf("El perro %s corre felizmente.\n", raza);
    }
}