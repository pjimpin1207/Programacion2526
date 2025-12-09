package Ejercicios.ejercicio31;

import java.util.Scanner;

public class Ejercicio31 {

    // función variosSaludos
    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hola");
        }
    }

    public static void main(String[] args) {

        // Invocar funcion con valor literal 3
        variosSaludos(3);

        // Invocar mediante variable que se introduzca por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que quieres que se repita:");
        int n = sc.nextInt();
        variosSaludos(n);

        // Invocar con el doble de numero
        System.out.println("El doble de veces que lo anterior");
        variosSaludos(n * 2);
    }
}