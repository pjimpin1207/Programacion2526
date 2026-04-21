package Tema8.Ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        // El método containsAll() mira si todos los elementos de "numerosPrimos" están en "numeros"
        boolean esSubconjunto = numeros.containsAll(numerosPrimos);
        System.out.println("¿Es {2,3} un subconjunto?: " + esSubconjunto);

        //Lista final con los valores del conjunto
        numeros.remove(null);
        final List<Integer> listaFinal = new ArrayList<>(numeros);
        listaFinal.add(100);
        System.out.println("Lista final (con modificador final): " + listaFinal);
    }
}


        /*
           - ¿Es la lista inmutable? no el objeto sigue siendo mutable
           - ¿Podemos añadir/borrar? si porque final solo impide reasignar la variable
        */