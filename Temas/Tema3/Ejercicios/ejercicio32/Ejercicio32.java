package Ejercicios.ejercicio32;

import java.util.Scanner;

    public class Ejercicio32 {

        // Función maximo
        public static int maximo(int a, int b) {
            int maximo;

            if (a > b) {
                maximo = a;
            } else {
                maximo = b;
            }
            return maximo;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1.Pedir los dos números al usuario
            System.out.println("Introduce el primer número entero:");
            int num1 = sc.nextInt();

            System.out.println("Introduce el segundo número entero:");
            int num2 = sc.nextInt();

            // 2.Invocar la función maximo con los números introducidos como argumentos
            int resultado = maximo(num1, num2);

            // 3.Imprimir el valor devuelto por la función
            System.out.println("\nEl valor máximo de los dos números introducidos es: " + resultado);
        }
    }