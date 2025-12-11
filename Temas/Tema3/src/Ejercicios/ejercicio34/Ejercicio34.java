package Ejercicios.ejercicio34;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int etiqueta = 0;// Identificador del árbol
        int altura;// Altura introducida
        int alturaMaxima = Integer.MIN_VALUE;
        int etiquetaMaxima = -1;// Guarda la etiqueta del árbol más alto

        System.out.print("Introduce la altura del árbol 0 (en cm, -1 para terminar): ");
        altura = sc.nextInt();

        while (altura != -1) {

            // Comprobar si es el árbol más alto hasta ahora
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                etiquetaMaxima = etiqueta;
            }

            etiqueta++;  // Pasar al siguiente árbol

            System.out.print("Introduce la altura del árbol " + etiqueta + " (en cm, -1 para terminar): ");
            altura = sc.nextInt();
        }

        // Resultado final
        if (etiquetaMaxima == -1) {
            System.out.println("No se introdujeron alturas válidas.");
        } else {
            System.out.println("\nEl árbol más alto es el árbol con etiqueta " + etiquetaMaxima +
                    " y una altura de " + alturaMaxima + " cm.");
        }
    }
}
