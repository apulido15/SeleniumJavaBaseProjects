package org.example.basics;

public class MethodsAndDeclarations {

    static final int base = 5;
    static int operador = 6;
    static int factor;

    public static void main(String[] args) {

        System.out.println("El operador " + operador + " multiplicado 5 veces: " + (operador * base));

        // SENTENCIA RETURN
        int resultado = cuadrado(4); // Llama a un método con return
        System.out.println("El cuadrado de 4 es: " + resultado);
    }

    // Método auxiliar con return
    public static int cuadrado(int numero) {
        return numero * numero;
    }
}
