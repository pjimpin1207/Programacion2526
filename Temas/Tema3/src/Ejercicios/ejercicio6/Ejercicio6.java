package Ejercicios.ejercicio6;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double PI = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("Longitud = " + longitud);
        System.out.println("Área = " + area);

    }
}
