package org.example.poo.animals.base;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    public int peso;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void info() {

        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    private void calcular() {
        System.out.println("Hola");
    }
}