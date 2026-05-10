package Tema9.Ejercicios.ejercicio5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crea el objeto Scanner asociado a la entrada estándar
        Scanner sc = new Scanner(System.in);

        // Pedir nombre completo
        System.out.println("Escribe tu nombre completo:");
        // uso  nextLine() para capturar toda la frase hasta pulsar enter
        String nombre = sc.nextLine();

        // Pedir edad con control de errores
        int edad = 0;
        boolean edadValida = false;

        while (!edadValida) {
            try {
                System.out.println("Escribe tu edad (debe ser un número entero):");
                // nextInt() lee el siguiente token como un número entero
                edad = sc.nextInt();
                edadValida = true;
            } catch (InputMismatchException e) {
                // Si el usuario mete letras en vez de números, se captura el error
                System.out.println("Error: La edad debe ser un número entero válido.");
                sc.next();
            }
        }

        //Salida final
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");
        sc.close();
    }
}