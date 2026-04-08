package Ejercicios.ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();
        // bucle para controla las filas
        for (int i = n; i >= 1; i--) {

            // Bucle para imprimr i asteriscos en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
