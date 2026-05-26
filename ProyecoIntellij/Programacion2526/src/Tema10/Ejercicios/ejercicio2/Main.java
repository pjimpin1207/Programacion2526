package Tema10.Ejercicios.ejercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Instanciamos el evento listo para simular su persistencia
        Ejercicio2 festival = new Ejercicio2(1L, "Puro Latino", LocalDate.of(2026, 6, 28), new BigDecimal("3450000.00"), GeneroMusical.ROCK
        );

        // añadir artistas
        festival.addArtista(new Artista("Ghost", 8));
        festival.addArtista(new Artista("Slipknot", 9));

        System.out.println(festival);
    }
}