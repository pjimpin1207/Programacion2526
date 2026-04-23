package Tema8.Ejercicios.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio12 {
    public static void main(String[] args) {
        // inicializar la lista con 10 números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

        System.out.println("Lista inicial: " + numeros);

        // crear el listIterator
        ListIterator<Integer> it = numeros.listIterator();

        // recorrer haacia delante.
        System.out.println("\nRecorriendo hacia adelante");
        while (it.hasNext()) {
            int indice = it.nextIndex();
            Integer valor = it.next();

            System.out.println("indice " + indice + ": " + valor);

            // Si es mayor que 50 se multiplica por dos
            if (valor > 50) {
                it.set(valor * 2); // actualizar el valor de la lista
            }
        }
        System.out.println("Lista después multiplicar > 50 por 2: " + numeros);

        // recorrer hacia atrás
        System.out.println("\nRecorriendo hacia atrás");
        while (it.hasPrevious()) {
            int indice = it.previousIndex();
            Integer valor = it.previous();

            System.out.println("indice " + indice + ": " + valor);

            // al que sea menor de 30 se le añade 25
            if (valor < 30) {
                it.add(25); // añadir el 25 en la posición actual
                it.previous();
            }
        }
        System.out.println("Lista final: " + numeros);
    }
}