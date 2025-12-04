package Ejercicios.ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            // meses con 31 dias
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 días.");
                break;
            // meses con 30 dias
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 días.");
                break;
            // febrero
            case 2:
                System.out.println("Este mes tiene 28 días (29 si es año bisiesto).");
                break;
            default:
                System.out.println("Mes no válido.");
        }
    }
}
