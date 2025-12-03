package Ejercicios.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer trimestre");
        double notaPrimerTrimestre = sc.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre");
        double notaSegundoTrimestre = sc.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre");
        double notaTercerTrimestre = sc.nextDouble();

        double calcularMediaDecimales = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
        System.out.println("La media del curso es: " + calcularMediaDecimales);

        int calcularMediaEnteros = (int) calcularMediaDecimales;
        System.out.println("La media del curso sin decimales es: " + calcularMediaEnteros);
    }
}
