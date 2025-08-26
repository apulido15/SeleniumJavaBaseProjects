package org.example.basics;

public class Strings {
    public static void main(String[] args) {

        //1. Declaración de Strings
        String saludo = "Hola";
        String nombre = "Mundo";

        System.out.println("Palabra 1: " + saludo);
        System.out.println("Palabra 2: " + nombre);

        //2. Concatenación
        String mensaje = saludo + " " + nombre + "!";
        System.out.println("Mensaje concatenado: " + mensaje);

        //3. Usando concat()
        String otroMensaje = saludo.concat(" ").concat(nombre).concat("!");
        System.out.println("Mensaje con concat(): " + otroMensaje);

        //4. Comparación de Strings
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println("\nComparación con == : " + (a == b)); // true (apuntan al mismo objeto en el pool)
        System.out.println("Comparación con == : " + (a == c)); // false (objetos distintos)
        System.out.println("Comparación con equals(): " + a.equals(c)); // true (contenido igual)

        //5. Métodos útiles
        String frase = " Java Es genial  #$%$ %& 65 65+";

        System.out.println("\nLongitud: " + frase.length());
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());
        System.out.println("¿Empieza con 'Java'? " + frase.trim().startsWith("Java"));
        System.out.println("Frase sin espacios: '" + frase.trim() + "'");
        System.out.println("Reemplazar 'genial' por 'poderoso': " + frase.replace("genial", "poderoso"));

        //6. Subcadenas
        String sub = frase.substring(2, 6); // desde índice 2 al 5
        System.out.println("Subcadena (2 a 5): '" + sub + "'");

        //7. Dividir un String y Array de Strings
        String nombres = "Ana,Luis,Carlos";
        String[] lista = nombres.split(",");

        System.out.println("\nNombres unidos: " + nombres);
        System.out.println("\nNombres individuales:");
        for (String n : lista) {
            System.out.println("- " + n);
        }

        //8. Convertir a char[]
        char[] letras = frase.toCharArray();
        System.out.println("\nLetras de '" + saludo + "':");
        for (char letra : letras) {
            System.out.println(letra);
        }
    }
}
