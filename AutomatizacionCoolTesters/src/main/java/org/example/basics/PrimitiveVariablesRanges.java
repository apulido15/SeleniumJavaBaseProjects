package org.example.basics;

public class PrimitiveVariablesRanges {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("     Rangos:      ");
        System.out.println("===================");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("boolean: " + Boolean.TRUE + " a " + Boolean.FALSE);

        char min = Character.MIN_VALUE;
        char max = Character.MAX_VALUE;
        System.out.println("Valor mínimo de char: " + (int) min); // Imprime: 0
        System.out.println("Valor máximo de char: " + (int) max); // Imprime: 65535

        // También puedes ver los caracteres
        System.out.println("Carácter mínimo: '" + min + "'");
        System.out.println("Carácter máximo: '" + max + "'");
    }
}