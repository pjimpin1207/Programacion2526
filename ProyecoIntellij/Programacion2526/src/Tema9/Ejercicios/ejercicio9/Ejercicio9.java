package Tema9.Ejercicios.ejercicio9;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        // definir el objeto File apuntando a 'notas.txt'
        File archivo = new File("notas.txt");
        // verificar si existe
        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
        } else {
            // si no existe se crea solo
            System.out.println("El archivo no existe. Se va a crear");
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado");
                    System.out.println("Nombre: " + archivo.getName());
                    System.out.println("Ruta: " + archivo.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            // excepciones de E/S
            catch (IOException e) {
                System.err.println("Ocurrió un error de E/S al manejar el archivo: " + e.getMessage());
            }
        }
    }
}