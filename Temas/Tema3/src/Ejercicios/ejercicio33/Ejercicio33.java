package Ejercicios.ejercicio33;

public class Ejercicio33 {

    // Función maximo
    public static int maximo(int a, int b) {
        int maximo;

        if (a > b) {
            maximo = a;
        } else {
            maximo = b;
        }
        return maximo;
    }

    // 2. Función maximo sobrecargada
    public static int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int num3 = 10;

        // Invocar la función sobrecargada
        int resultado = maximo(num1, num2);
        System.out.println(resultado);
        // Invocar la función sobrecargada
        int resultadoSobrecarga = maximo(num1, num2, num3);
        System.out.println(resultadoSobrecarga);

        // Imprimir el valor devuelto por la función
        System.out.println("\nEl valor máximo de los tres números introducidos es: " + resultado);

    }
}