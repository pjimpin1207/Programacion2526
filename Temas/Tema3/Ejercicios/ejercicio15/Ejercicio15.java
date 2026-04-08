package Ejercicios.ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal");
        float numero = sc.nextFloat();

        int redondear = Math.round(numero);
        System.out.println("El numero que has introducido redondeado es: " + redondear);
    }
}
