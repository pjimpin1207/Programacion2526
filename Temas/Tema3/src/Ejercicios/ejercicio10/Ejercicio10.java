package Ejercicios.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        System.out.print("Ventas de manzanas en el primer semestre (kg): ");
        double manzanas1 = sc.nextDouble();

        System.out.print("Ventas de manzanas en el segundo semestre en kg: ");
        double manzanas2 = sc.nextDouble();

        System.out.print("Ventas de peras en el primer semestre en kg: ");
        double peras1 = sc.nextDouble();

        System.out.print("Ventas de peras en el segundo semestre en kg: ");
        double peras2 = sc.nextDouble();

        double totalManzanas = (manzanas1 + manzanas2) * PRECIO_MANZANA;
        double totalPeras = (peras1 + peras2) * PRECIO_PERA;

        double beneficioTotal = totalManzanas + totalPeras;

        System.out.println("Beneficio total anual: " + beneficioTotal + " €");
    }
}
