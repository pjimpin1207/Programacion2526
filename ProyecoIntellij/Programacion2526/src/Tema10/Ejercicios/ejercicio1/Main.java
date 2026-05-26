package Tema10.Ejercicios.ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // crear instancia usando el constructor con parámetros
        Ejercicio1 concierto = new Ejercicio1("Puro Latino", LocalDate.of(2026, 7, 15), new BigDecimal("1250450.75"));

        // Mostramos los datos por consola
        System.out.println(concierto);
    }
}