package Ejercicios.ejercicio24;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        int edadMaxima = Integer.MIN_VALUE;
        int edadMinima = Integer.MAX_VALUE;

        System.out.print("Introduce las edades (utiliza -1 para terminar): ");
        edad = sc.nextInt();

        while (edad != -1) {

            // Actualizar máxima
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }

            // Actualizar mínima
            if (edad < edadMinima) {
                edadMinima = edad;
            }

            // Volver a pedir edad
            System.out.print("Introduce una edad (-1 para terminar): ");
            edad = sc.nextInt();
        }

        System.out.println("\nEdad máxima: " + edadMaxima);
        System.out.println("Edad mínima: " + edadMinima);
    }
}
