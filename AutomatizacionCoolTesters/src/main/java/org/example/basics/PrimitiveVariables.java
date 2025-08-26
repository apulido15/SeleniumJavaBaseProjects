package org.example.basics;

public class PrimitiveVariables {
    public static void main(String[] args) {

        // 1. byte: entero pequeño
        byte edad = 25;
        System.out.println("Edad (byte): " + edad);

        // 2. short: entero más grande que byte
        short anio = 2025;
        System.out.println("Año (short): " + anio);

        // 3. int: entero estándar
        int poblacion = 500000;
        System.out.println("Población (int): " + poblacion);

        // 4. long: entero largo con sufijo 'L'
        long distanciaAlSol = 149_600_000_000L; // en metros
        System.out.println("Distancia al Sol (long): " + distanciaAlSol + " metros");

        // 5. float: número decimal con sufijo 'f'
        float temperatura = 36.6f;
        System.out.println("Temperatura (float): " + temperatura + " °C");

        // 6. double: número decimal más preciso
        double pi = 3.141592653589793;
        System.out.println("Valor de PI (double): " + pi);

        // 7. char: carácter unicode
        char letra = 'J';
        char simbolo = '\u2764'; // Unicode del corazón ❤
        char hola = 87; // ASCII para letra W (en mayúscula)
        char siguiente = (char) (letra + 1); // 'B'
        System.out.println("Letra (char): " + letra);
        System.out.println("Símbolo (char): " + simbolo);
        System.out.println("Letra (char): " + hola);
        System.out.println("Letra Siguiente (char): " + siguiente);

        // 8. boolean: verdadero o falso
        boolean esMayorDeEdad = edad >= 85;
        System.out.println("¿Es mayor de edad? (boolean): " + esMayorDeEdad);
    }
}