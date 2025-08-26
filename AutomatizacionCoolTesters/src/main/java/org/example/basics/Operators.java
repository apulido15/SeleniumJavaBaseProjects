package org.example.basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // 1. Aritméticos
        System.out.println("Aritméticos:");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        // 2. Asignación
        System.out.println("\nAsignación:");
        int x = 5;
        x += 2; // x = x + 2
        System.out.println("x += 2 -> " + x); // 7
        x *= 3;
        System.out.println("x *= 3 -> " + x); // 21

        // 3. Relacionales
        System.out.println("\nRelacionales:");
        System.out.println("a == b -> " + (a == b)); // false
        System.out.println("a != b -> " + (a != b)); // true
        System.out.println("a > b -> " + (a > b));   // true
        System.out.println("a <= b -> " + (a <= b)); // false
        System.out.println("a >= b -> " + (a >= b)); // false

        // 4. Lógicos
        System.out.println("\nLógicos:");
        boolean c = true, d = false;
        System.out.println("c && d -> " + (c && d)); // false
        System.out.println("c || d -> " + (c || d)); // true
        System.out.println("!c -> " + (!c));         // false

        // 5. Unarios
        System.out.println("\nUnarios:");
        int y = 5;
        System.out.println("y = " + y);
        System.out.println("++y = " + (++y)); // 6 (pre-incremento)
        System.out.println("y-- = " + (y--)); // 6 (post-decremento, luego queda 5)
        System.out.println("y final = " + y); // 5

        // 6. Ternario
        System.out.println("\nTernario:");
        int edad = 18;
        String resultado = (edad >= 18) ? "Adulto" : "Menor";
        System.out.println("¿Mayor de edad? -> " + resultado); // Adulto

        // 7. Bit a bit
        System.out.println("\nBit a bit:");
        int p = 5;   // 0101
        int q = 3;   // 0011
        System.out.println("p & q -> " + (p & q));  // 0001 = 1
        System.out.println("p | q -> " + (p | q));  // 0111 = 7
        System.out.println("p ^ q -> " + (p ^ q));  // 0110 = 6
        System.out.println("~p -> " + (~p));        // -6 (complemento a uno)
        System.out.println("p << 1 -> " + (p << 1)); // 1010 = 10
        System.out.println("p >> 1 -> " + (p >> 1)); // 0010 = 2
        System.out.println("p >>> 1 -> " + (p >>> 1)); // 2 (desplazamiento lógico)
    }
}

