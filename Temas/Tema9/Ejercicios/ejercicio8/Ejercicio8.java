package Tema9.Ejercicios.ejercicio8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("nota.txt"))) {
            if (br.markSupported()) {
                br.mark(100); // Marcamos el inicio
                System.out.println("Primera línea: " + br.readLine());
                br.reset(); // Volvemos al inicio para leerla de nuevo
                System.out.println("Repetimos línea: " + br.readLine());
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}
