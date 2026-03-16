package Ejercicios.ejercicio13;

import java.util.Random;

public class Utilidades {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return Double.NaN;
    }

    public static final String obtenerAlumnoAlAzar(String[] alumnos) {
        Random rand = new Random();
        int indice = rand.nextInt(alumnos.length);
        return alumnos[indice];
    }

    public static final int calcularPuntuacionJuego(int puntos) {
        return puntos * 1000 + 50;
    }
}