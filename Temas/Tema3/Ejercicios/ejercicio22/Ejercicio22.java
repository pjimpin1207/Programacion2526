package Ejercicios.ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número y 0 cuando quieras terminar): ");
        int numero = sc.nextInt();

        while (numero != 0) {

            //Es par
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            //Es positivo
            if (numero > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            // Cuadrado del número
            int cuadrado = numero * numero;
            System.out.println("El cuadrado es: " + cuadrado);

            System.out.print("\nIntroduce un número y 0 cuando quieras terminar");
            numero = sc.nextInt();
        }
        System.out.println("Programa terminado.");
    }
}
