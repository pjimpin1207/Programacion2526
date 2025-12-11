package Ejercicios.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El número mayor es: " + mayor);
    }
}
