package Tema9.Ejercicios.ejercicio2;

import java.io.FileWriter;

/* Codigo mal:

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribimos algo
        escritor.write("¿Donde está mi texto?");

        System.out.println("He escrito en el archivo... ¿o no?");

        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos

        // No hemos puesto ni flush() ni close()
    }
}

¿Se ha escrito algo en prueba.txt? ¿por qué?
No porque el programa esta en espera, los datos no se envían directamente al disco físico con cada write(), sino que se quedan "guardados" en la memoria temporal
del flujo.

 */

// ¿Cómo lo arreglarias? Hazlo y compruebalo.
import java.io.FileWriter;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribir
        escritor.write("¿Donde está mi texto?");

        // cerrar el flujo
        escritor.close();

        // El programa espera, pero el archivo ya tiene los datos
        Thread.sleep(10000);
    }
}