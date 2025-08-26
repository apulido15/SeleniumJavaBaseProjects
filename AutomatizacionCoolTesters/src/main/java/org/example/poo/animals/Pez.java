package org.example.poo.animals;

import org.example.poo.animals.base.Animal;
import org.example.poo.behaviour.Nadador;

public class Pez extends Animal implements Nadador{
    private final String tipoAgua;

    public Pez(String nombre, int edad, String tipoAgua) {
        super(nombre, edad);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez hace burbujas...");
    }

    @Override
    public void nadar() {
        System.out.printf("El pez nada en el agua %1$s a una velocidad de %2$f m/s\n", tipoAgua, VELOCIDAD_PROMEDIO);
    }
}
