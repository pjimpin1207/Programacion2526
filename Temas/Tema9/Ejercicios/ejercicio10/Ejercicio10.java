package Tema9.Ejercicios.ejercicio10;

import java.io.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        File archivo = new File("ejercicio10.txt");

        // verificar que existe y la validez
        if (archivo.exists() && archivo.isFile()) {
            System.out.println("Archivo encontrado: " + archivo.getName());
            System.out.println("Tamaño inicial: " + archivo.length() + " bytes");

            // añadir contenido
            // FileWriter con el parámetro append en true para no sobreescribir
            try (FileWriter escritor = new FileWriter(archivo, true)) {
                escritor.write("\nEsta línea usando acceso secuencial");
                System.out.println("Contenido añadido correctamente");
            } catch (IOException e) {
                System.err.println("Error al escribir: " + e.getMessage());
            }

            // acceso secuencial de escritura
            System.out.println("\nContenido actual del fichero");
            try (FileReader lector = new FileReader(archivo)) {
                int caracter;
                // El método read() devuelve -1 cuando llega al final del flujo
                while ((caracter = lector.read()) != -1) {
                    System.out.print((char) caracter);
                }
                System.out.println("\n\nLectura finalizada. Tamaño actual: " + archivo.length() + " bytes");
            } catch (IOException e) {
                System.err.println("Error al leer: " + e.getMessage());
            }

        } else {
            System.out.println("El archivo 'ejercicio10.txt' no existe");
        }
    }
}