package Tema8.Ejercicios.ejercicio2;

import Tema8.Ejercicios.ejercicio1.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
            // Copia el código del ejercicio anterior en una nueva clase para reutilizar la lista que creaste.
            List listaEjercicio1 = new ArrayList();
            listaEjercicio1.add(new Persona("Ana", 25));
            listaEjercicio1.add(new Persona("David", 20));
            listaEjercicio1.add(new Persona("Juan", 34));

            System.out.println("Lista original: " + listaEjercicio1);

            // Copia las personas de la lista original a una nueva lista que sea una instancia de la clase LinkedList.
            List listaEjercicio2 = new LinkedList(listaEjercicio1);
            System.out.println("Nueva lista (LinkedList): " + listaEjercicio2);

            // En la nueva lista, intercambia las personas de las posiciones primera y última.
            Collections.swap(listaEjercicio2, 0, listaEjercicio2.size() - 1);
            System.out.println("Lista tras el intercambio: " + listaEjercicio2);
    }
}