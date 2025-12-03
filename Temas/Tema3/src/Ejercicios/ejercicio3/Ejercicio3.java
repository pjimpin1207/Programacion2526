package Ejercicios.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año actual:");
        int annoActual = sc.nextInt();
        System.out.println("Introduce tu año de nacimiento:");
        int annoNacimiento = sc.nextInt();

        int edadActual = annoActual - annoNacimiento;
        int resultado = edadActual;

        System.out.println("Tienes: " +resultado);

    }
}
