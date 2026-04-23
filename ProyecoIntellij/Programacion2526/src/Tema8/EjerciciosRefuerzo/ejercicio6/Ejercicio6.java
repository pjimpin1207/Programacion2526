package Tema8.EjerciciosRefuerzo.ejercicio6;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ejercicio6 {
    public static void main(String[] args) {
        // crear lista con varios nombres
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Ana");
        nombres.add("Alberto");
        nombres.add("Luis");
        nombres.add("Marta");

        // recorrer con iterator
        System.out.println("recorrer con iterator");
        Iterator<String> itSimple = nombres.iterator();
        while (itSimple.hasNext()) {
            System.out.println("Nombre: " + itSimple.next());
        }

        // recorrer hacia adelante y atras
        System.out.println("\nRecorrer hacia adelante y atrás");
        ListIterator<String> itLista = nombres.listIterator();

        System.out.print("Hacia adelante: ");
        while (itLista.hasNext()) {
            System.out.print(itLista.next() + " ");
        }

        System.out.print("\nHacia atrás: ");
        while (itLista.hasPrevious()) {
            System.out.print(itLista.previous() + " ");
        }

        // modificar lista
        System.out.println("\n\nModificando la lista");
        itLista = nombres.listIterator();

        while (itLista.hasNext()) {
            String nombre = itLista.next();
            if (nombre.length() < 5) {
                itLista.remove();
            } else {
                itLista.set(nombre); // modificar el nombre
            }
        }

        // lista final
        System.out.println("Lista final: " + nombres);
    }
}