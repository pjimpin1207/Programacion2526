package Tema8.Examen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ejercicio5 {
    public static void main(String[] args) {
        // crear la coleccion
        Collection<Integer> numeros = new ArrayList<>();

        // añadir numeros
        numeros.add(10);
        numeros.add(99);
        numeros.add(20);
        numeros.add(88);
        numeros.add(13);
        numeros.add(33);
        System.out.println("Primera lista:" + numeros);

        // umbral
        Integer umbral = 60;

        // iterator para recorrer la lista
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer actual = it.next();

            // comprobar si el numero de la posicion es menor
            if (actual < umbral) {
                // lo borra si es menor
                it.remove();
            }
        }

        // lista final despues de recorrer y eliminar los numeros menores de 50
        System.out.println("Lista final sin menores de 60" + umbral + "): " + numeros);
    }
}

// He usado iterator porque para borrar es el unico que permite modificar el tamaño de la coleccion mientras se recorre
