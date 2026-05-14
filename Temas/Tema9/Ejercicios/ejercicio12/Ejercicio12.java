package Tema9.Ejercicios.ejercicio12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio12 {
    public static void main(String[] args) {
        File file = new File("datos.txt");

        try {
            // eliminar fichero si ya existe
            if (file.exists()) {
                file.delete();
            }

            // acceso aleatorio y introducir "defg"
            try (RandomAccessFile random = new RandomAccessFile(file, "rw")) {
                random.writeBytes("defg");
            }

            // imprimir lo actual
            System.out.print("Contenido inicial: ");
            imprimirFichero(file);

            // añadir "abc" al principio y "hij" al final
            try (RandomAccessFile random = new RandomAccessFile(file, "rw")) {
                // Añadir al principio
                random.seek(0); //
                random.writeBytes("abc");

                // Ir al final para añadir "hij"
                random.seek(random.length());
                random.writeBytes("hij");
            }

            System.out.print("Contenido tras añadir: ");
            imprimirFichero(file);

            // cambiar las vocales por "*"
            try (RandomAccessFile random = new RandomAccessFile(file, "rw")) {
                for (int i = 0; i < random.length(); i++) {
                    random.seek(i);
                    byte b = random.readByte();
                    char c = (char) b;

                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        random.seek(i); // volver a la posición para sobrescribir
                        random.writeBytes("*");
                    }
                }
            }

            System.out.print("Contenido final (sin vocales): ");
            imprimirFichero(file);

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }

    // metodo para leer y mostrar el fichero secuencialmente
    private static void imprimirFichero(File f) throws IOException {
        try (RandomAccessFile random = new RandomAccessFile(f, "r")) {
            random.seek(0);
            byte[] contenido = new byte[(int) random.length()];
            random.readFully(contenido);
            System.out.println(new String(contenido));
        }
    }
}