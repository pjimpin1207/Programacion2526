package Tema8.Ejercicios.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        for (String notaTexto : notasEntrada) {
            Double notaDouble = Double.valueOf(notaTexto);
            notas.add(notaDouble);
        }
        System.out.println("Lista de notas cargada: " + notas);

        double suma = 0;
        for (Double n : notas) {
            suma += n;
        }
        double media = suma / notas.size();
        System.out.println("La nota media es: " + media);

        List<Double> aprobados = new ArrayList<>();
        for (Double n : notas) {
            if (n >= 5.0) {
                aprobados.add(n);
            }
        }

        System.out.println("Lista de aprobados (>= 5.0): " + aprobados);

        System.out.println("Total de aprobados: " + aprobados.size());
    }
}