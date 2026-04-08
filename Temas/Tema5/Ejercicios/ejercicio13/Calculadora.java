package Ejercicios.ejercicio13;

import java.util.Scanner;

public class Calculadora {

    public static void menu() {
        System.out.println("\nCALCULADORA");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double num1 = 0, num2 = 0;

        do {
            menu();
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + Utilidades.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + Utilidades.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + Utilidades.multiplicar(num1, num2));
                    break;
                case 4:
                    double resultadoDividir = Utilidades.dividir(num1, num2);
                    if (Double.isNaN(resultadoDividir)) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + resultadoDividir);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);

    }
}