package Ejercicios.ejercicio33;

public class Ejercicio33_Ampliacion {

    // 1. Función base (maximo de dos números) - Ejercicio 32
    public static int maximo(int a, int b) {
        int maximo;

        if (a > b) {
            maximo = a;
        } else {
            maximo = b;
        }
        return maximo;
    }

    // Función maximo sobrecargada
    public static int maximo(int a, int b, int c) {
        int maximo_a_y_b = maximo(a, b);
        return maximo(maximo_a_y_b, c);
    }

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 12;
        int num3 = 78;

        // Invocar la función sobrecargada
        int resultado = maximo(num1, num2, num3);

        // Imprimir el valor devuelto por la función
        System.out.println("\nEl valor máximo de los tres números introducidos (" + num1 + ", " + num2 + ", " + num3 + ") es: " + resultado);

    }
}