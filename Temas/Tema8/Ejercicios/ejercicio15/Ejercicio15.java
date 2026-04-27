package Tema8.Ejercicios.ejercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {
        // crear lista con 6 puntuaciones desordenadas
        List<Integer> puntuaciones = new ArrayList<>();
        puntuaciones.add(450);
        puntuaciones.add(1200);
        puntuaciones.add(300);
        puntuaciones.add(800);
        puntuaciones.add(1500);
        puntuaciones.add(100);

        System.out.println("Lista inicial: " + puntuaciones);

        //Ordenar de menor a mayor
        Collections.sort(puntuaciones);
        System.out.println("Lista ordenada de menor a mayor: " + puntuaciones);

        // buscar la puntuación más alta y la más baja
        int max = Collections.max(puntuaciones);
        int min = Collections.min(puntuaciones);

        System.out.println("Puntuación más alta: " + max);
        System.out.println("Puntuación más baja: " + min);

        // Desordenar la lista
        Collections.shuffle(puntuaciones);
        System.out.println("Lista tras el sorteo: " + puntuaciones);
    }
}