package Ejercicios.ejercicio6;

import java.util.Scanner;

public class Ejercicio6Math {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud = " + longitud);
        System.out.println("Área = " + area);
    }
}

