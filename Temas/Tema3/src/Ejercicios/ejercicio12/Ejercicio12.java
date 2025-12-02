package Ejercicios.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        int absoluto = Math.abs(num);

        System.out.println("Valor absoluto (Math.abs): " + absoluto);
    }
}
