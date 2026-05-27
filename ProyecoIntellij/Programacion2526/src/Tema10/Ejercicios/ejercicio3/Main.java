package Tema10.Ejercicios.ejercicio3;

import Tema10.Ejercicios.ejercicio2.Artista;
import Tema10.Ejercicios.ejercicio2.GeneroMusical;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULACIÓN DE CREACIÓN DE EVENTOS (CON ANOTACIONES JPA) ===\n");

        // crear primer evento
        EventoMusical festival1 = new EventoMusical(10L, "Resurrection Fest", LocalDate.of(2026, 6, 26), new BigDecimal("2450000.50"), GeneroMusical.LATINO, 1);

        // Añadimos artistas
        festival1.addArtista(new Artista("Anuel", 1));
        festival1.addArtista(new Artista("Myke Towers", 1));


        // crear segundo evento
        EventoMusical festival2 = new EventoMusical(20L, "CocaCola Music Festival", LocalDate.of(2026, 7, 18), new BigDecimal("1890000.00"), GeneroMusical.POP, 2);

        festival2.addArtista(new Artista("Aitana", 1));

        // mostrar resultado
        System.out.println(festival1);
        System.out.println("Lista de artistas: " + festival1.getArtistasConfirmados());
        System.out.println();

        System.out.println(festival2);
        System.out.println("Lista de artistas: " + festival2.getArtistasConfirmados());
    }
}