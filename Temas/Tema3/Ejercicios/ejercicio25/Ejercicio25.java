package Ejercicios.ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aciertos = 0;
        int respuesta;
        int numero1, numero2, solucionCorrecta;

        do {
            numero1 = (int)(Math.random() * 100) + 1;
            numero2 = (int)(Math.random() * 100) + 1;

            solucionCorrecta = numero1 + numero2;

            System.out.print("¿Cuánto es " + numero1 + " + " + numero2 + "? ");
            respuesta = sc.nextInt();

            if (respuesta == solucionCorrecta) {
                aciertos++;
                System.out.println("¡Correcto!\n");
            } else {
                System.out.println("\nIncorrecto. La solución era: " + solucionCorrecta);
            }

        } while (respuesta == solucionCorrecta);

        System.out.println("Operaciones correctas realizadas: " + aciertos);
    }
}
