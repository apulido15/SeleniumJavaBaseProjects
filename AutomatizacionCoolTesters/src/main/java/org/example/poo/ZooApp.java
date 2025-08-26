package org.example.poo;

import org.example.poo.animals.*;
import org.example.poo.animals.base.Animal;
import org.example.poo.behaviour.Corredor;
import org.example.poo.behaviour.Nadador;
import org.example.poo.behaviour.Volador;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Max", 5, "Labrador"));
        animales.add(new Pajaro("Piolín", 2, "Canario"));
        animales.add(new Pez("Nemo", 1, "salada"));
        animales.add(new Tigre("Sher Khan", 7));

        for (Animal animal : animales) {
            animal.info();
            animal.hacerSonido();

            if (animal instanceof Volador volador) {
                volador.despegar();
                volador.volar();
            }
            if (animal instanceof Pajaro volador) {
                volador.despegar();
                volador.volar();
                volador.mostrarEspecie();
            }
            if (animal instanceof Nadador nadador) {
                nadador.nadar();
            }
            if (animal instanceof Corredor corredor) {
                corredor.correr();
            }

            System.out.println("----");
        }

        // Uso de método estático
        System.out.println("Información general sobre nado:");
        Nadador.mostrarTiposDeNado();

        System.out.println("Total de pájaros registrados: " + Pajaro.contadorPajaros);
    }
}
