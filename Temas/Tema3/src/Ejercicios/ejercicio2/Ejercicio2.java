package Ejercicios.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        int edadSiguiente = edad + 1;
        System.out.println("El año que viene vas a tener: " + edadSiguiente + " años");
        sc.close();
    }
}
