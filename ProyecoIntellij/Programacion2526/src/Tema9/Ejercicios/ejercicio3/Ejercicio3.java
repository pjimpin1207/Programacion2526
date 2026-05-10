package Tema9.Ejercicios.ejercicio3;

import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        // Introducir caracteres indeterminados
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar");

        // bucle para leer hasta que el usuario pulse intro
        int leido;
        while ((leido = System.in.read()) != '\n' && leido != -1) {
        }

        // Hola Mundo pidiendo el nombre con el mismo sistema
        System.out.println("Introduzca su nombre:");

        // contenedor para guardar los caracteres del nombre
        String nombre = "";
        int caracter;

        // Leemos hasta que el usuario pulse Intro
        while ((caracter = System.in.read()) != '\n' && caracter != -1) {
            if (caracter != 13) {
                nombre += (char) caracter;
            }
        }

        System.out.println("Hola " + nombre + "!");
    }
}