package Tema7.Ejercicios.ejercicio2;

import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error capturado en main: No se puede dividir por cero.");
        } catch (IOException e) {
            System.err.println("Error capturado en main: Ocurrió una excepción de entrada/salida.");
        } finally {
            System.out.println("Finalizando la ejecución del programa.");
        }
    }

    public static double dividir(int a, int b) throws IOException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return (double) a / b;
    }
}
