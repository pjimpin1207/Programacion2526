package Ejercicios.ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numeroIntroducido = sc.nextInt();

        for (int i = 0; i < numeroIntroducido; i++) {
            System.out.println("Eco...");
        }
    }
}

