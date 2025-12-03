package Ejercicios.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (numero >= a && numero <= b) {
            System.out.println("El número está dentro del rango.");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        System.out.println("Número introducido: " + numero);
    }
}
