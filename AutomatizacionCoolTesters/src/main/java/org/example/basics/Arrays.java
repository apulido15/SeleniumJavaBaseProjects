package org.example.basics;

public class Arrays {

    public static void main(String[] args) {

        // 🔹 1. Array de enteros (unidimensional)
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Primer número: " + numeros[0]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        // 🔄 Recorrer array con for
        System.out.println("\nRecorrido con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // 🔄 Recorrido con for-each
        System.out.println("\nRecorrido con for-each:");
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        // 🔹 3. Array bidimensional (matriz)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nElemento en fila 1, columna 2: " + matriz[0][1]);

        // 🔄 Recorrido de matriz
        System.out.println("\nRecorrido de matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // Salto de línea por fila
        }
    }
}

