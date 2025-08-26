package org.example.basics;

public class ControlStructures {
    public static void main(String[] args) {

        // 1. ESTRUCTURA IF-ELSE
        int numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // 2. SWITCH
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        // 3. WHILE
        int contador = -5;
        while (contador < 3) {
            System.out.println("While contador: " + contador);
            contador++;
        }

        // 4. DO-WHILE
        int x = 5;
        do {
            System.out.println("Do-While x: " + x);
            x++;
        } while (x < 3);

        // 5. FOR
        for (int i = 0; i < 3; i++) {
            System.out.println("For i: " + i);
        }

        // 6. FOR-EACH
        String[] frutas = {"Manzana", "Banano", "Pera"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // 7. BREAK y CONTINUE
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // Sale del ciclo
            }
            if (i == 2 || i == 4 || i == 6) {
                continue; // Salta la iteración 2
            }

            System.out.println("Ciclo con break/continue: " + i);
        }
    }
}

