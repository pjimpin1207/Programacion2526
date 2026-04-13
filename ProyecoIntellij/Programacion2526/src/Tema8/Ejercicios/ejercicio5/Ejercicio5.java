package Tema8.Ejercicios.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
        // crear conjunto y añadir los 5 primeros numeros
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        //Imprimir l valor del conjunto
        System.out.println("Conjunto: " + numeros);

        // añadir un numero repetido
        numeros.add(3);
        System.out.println("Despues de volver a añadir el 3 " + numeros);

        // añadir un null
        numeros.add(null);
        System.out.println("Despues de añadir null " + numeros);

        Set<Integer> numerosPrimos = new HashSet<>();
        numerosPrimos.add(2);
        numerosPrimos.add(3);

        

    }
}
