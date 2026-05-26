package Tema10.Ejercicios.ejercicio3;

import Tema10.Ejercicios.ejercicio2.GeneroMusical;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Inicializamos una variable para simular el contador de la base de datos de 10 en 10
        long contadorId = 0;

        // crear el primer evento (ID = 10)
        contadorId += 10;
        Ejercicio3 evento1 = new Ejercicio3(contadorId, "Puro Latino", LocalDate.of(2026, 5, 1), new BigDecimal("1500000.00"), GeneroMusical.LATINO, 99
        );

        // crear el segundo evento (ID = 20)
        contadorId += 10;
        Ejercicio3 evento2 = new Ejercicio3(contadorId, "Monegros Desert Festival", LocalDate.of(2026, 7, 20), new BigDecimal("2200000.00"), GeneroMusical.TECHNO, 42
        );

        // mostrar el resultado por pantalla
        System.out.println(evento1);
        System.out.println(evento2);
    }
}