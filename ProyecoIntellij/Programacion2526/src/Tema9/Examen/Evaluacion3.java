package Tema9.Examen;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Evaluacion3 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("icono.png");
                FileOutputStream fos = new FileOutputStream("copia.png")
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData); // Escribe el byte en el destino
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
