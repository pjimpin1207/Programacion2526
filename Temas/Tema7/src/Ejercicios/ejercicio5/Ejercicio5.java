package Ejercicios.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            agregarNumeros();
        } catch (NumeroRepetido e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FIN");
        }
        System.out.println("FIIIIN");
    }

    private static void agregarNumeros() throws IllegalArgumentException {
        int[] lista = new int[5];
        lista[0] = 0;
        lista[1] = 12;
        lista[2] = 20;
        lista[3] = 13;
        lista[4] = 40;

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (estaEnLista(lista, numero)) {
            throw new NumeroRepetido("Este numero ya esta en la lista ");
        }

        for (int e : lista) {
            System.out.println(e);
        }
    }

    private static boolean estaEnLista(int[] lista, int numero) {
        for (int e : lista) {
            if (e == numero) {
                return true;
            }
        }
        return false;
    }
}