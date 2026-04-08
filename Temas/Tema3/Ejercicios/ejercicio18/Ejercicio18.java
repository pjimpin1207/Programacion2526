package Ejercicios.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numero = sc.nextDouble();

        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println("Es un número casi-cero.");
        } else {
            System.out.println("No es un número casi-cero.");
        }
    }
}
