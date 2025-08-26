package org.example.poo.animals;

import org.example.poo.animals.base.Animal;
import org.example.poo.behaviour.Corredor;
import org.example.poo.behaviour.Volador;

public class Pajaro extends Animal implements Volador {
    private final String especie;
    public static int contadorPajaros = 0;

    public Pajaro(String nombre, int edad, String especie) {
        super(nombre, edad);
        this.especie = especie;
        contadorPajaros++;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta: Pío pío" + peso);
    }

    @Override
    public void volar() {
        despegar(); // método default
        System.out.println("El pájaro vuela hasta " + ALTURA_MAXIMA + " metros de altura.");
    }

    public void mostrarEspecie() {
        System.out.printf("Es de especie %s\n", especie);
        hacerDigestion();
    }

    private void hacerDigestion() {
        System.out.println("estoy haciendo digestion");
    }
}
