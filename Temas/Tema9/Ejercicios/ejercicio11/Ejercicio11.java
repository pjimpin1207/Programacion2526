package Tema9.Ejercicios.ejercicio11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombreFichero = "record.txt";
        Scanner sc = new Scanner(System.in);

        try {
            // archivo inicial
            archivoInicial(nombreFichero);

            // acceso directo para cambiar el nivel a 005
            try (RandomAccessFile random = new RandomAccessFile(nombreFichero, "rw")) {
                random.seek(6);
                random.writeBytes("005");
                System.out.println("Nivel actualizado a 005");
            }

            // actualizacion por usuario
            System.out.println("¿Qué nivel quieres ponerte?");
            String nuevoNivel = sc.next();

            try (RandomAccessFile random = new RandomAccessFile(nombreFichero, "rw")) {
                //saltar Nivel:
                random.seek(6);
                random.writeBytes(nuevoNivel);
            }

            System.out.println("Archivo 'record.txt' actualizado");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // creear archivo inicial
    private static void archivoInicial(String ruta) throws IOException {
        File archivo = new File(ruta);
        java.io.FileWriter fw = new java.io.FileWriter(archivo);
        fw.write("Nivel:001");
        fw.close();
        System.out.println("Archivo inicial creado con Nivel:001");
    }
}