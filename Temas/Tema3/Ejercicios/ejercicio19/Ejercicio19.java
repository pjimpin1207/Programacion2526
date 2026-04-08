package Ejercicios.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = sc.nextInt();

        int mayor, medio, menor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
            if (numero2 >= numero3) {
                medio = numero2;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero2;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
            if (numero1 >= numero3) {
                medio = numero1;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero1;
            }
        } else {
            mayor = numero3;
            if (numero1 >= numero2) {
                medio = numero1;
                menor = numero2;
            } else {
                medio = numero2;
                menor = numero1;
            }
        }

        System.out.println("Orden de mayor a menor: " + mayor + ", " + medio + ", " + menor);
    }
}
