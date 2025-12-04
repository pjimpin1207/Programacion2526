package Ejercicios.ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        int factorial = 1;

        for (int i= numero;  i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de "+ numero + " es: " + factorial);
    }
}
