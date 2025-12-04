package Ejercicios.ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        // Aseguramos a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int numero;

        // Bucle para que el número esté dentro del rango
        do {
            System.out.print("Introduce un número entero: ");
            numero = sc.nextInt();

            if (numero < a || numero > b) {
                System.out.println("Fuera de rango.Intentalo de nuevo.");
            }

        } while (numero < a || numero > b);

        // Cuando sale del bucle, el número está dentro del rango
        System.out.println("¡Correcto! El número está dentro del rango.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Número introducido: " + numero);
    }
}
