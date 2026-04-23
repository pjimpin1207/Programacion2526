package Tema8.Ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //crear la lista
        List<String> listaNombres = new ArrayList<>();


        //añadir a la lista los nombres
        listaNombres.add("Fran");
        listaNombres.add("Ana");
        listaNombres.add("Luis");
        listaNombres.add("Marta");
        listaNombres.add("Pepe");

        // mostrar
        System.out.println("Nombres en la lista actual:");
        for (String nombre : listaNombres) {
            System.out.println("- " + nombre);
        }

        // añadir otro nombre
        System.out.print("\nIntroduce un nuevo nombre: ");
        String nuevoNombre = sc.nextLine();
        listaNombres.add(nuevoNombre);
        System.out.println(nuevoNombre + " se ha añadido correctamente.");

        // // eliminar un nombre en concreto
        System.out.print("\n¿Qué nombre quieres borrar?: ");
        String borrarNombre = sc.nextLine();

        // remove devuelve true si lo encuentra y lo borra
        if (listaNombres.remove(borrarNombre)) {
            System.out.println("he borrado a " + borrarNombre);
        } else {
            // Si no estaba en la lista, muestra un aviso
            System.out.println("Error: El nombre " + borrarNombre + " no está en la lista.");
        }

        // mostrar total
        System.out.println("\nAhora mismo hay un total de " + listaNombres.size() + " nombres.");

    }
}