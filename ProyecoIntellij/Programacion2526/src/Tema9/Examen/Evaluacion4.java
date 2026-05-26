package Tema9.Examen;

import java.io.File;
import java.io.RandomAccessFile;
public class Evaluacion4 {
    public static void main(String[] args) throws Exception {
        File directorio = new File("datos");
// 1. Comprueba si la ruta existe y es un directorio
        if (directorio.exists() && directorio.isDirectory()) {
// 2. Abre el archivo en modo lectura/escritura ("rw")
            RandomAccessFile raf = new RandomAccessFile("datos/config.dat", "rw");
// 3. Posiciona el puntero en el byte 0 (inicio del archivo)
            raf.seek(0);
// Escribe el byte desencadenante
            raf.write(255);
// Cierra el flujo
            raf.close();
        }
    }
}