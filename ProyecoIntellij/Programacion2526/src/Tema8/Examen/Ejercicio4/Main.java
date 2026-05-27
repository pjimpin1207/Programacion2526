/*package Tema8.Examen.Ejercicio4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();

        // añadr productos a la lista
        lista.add(new Producto(1, 10.50));
        lista.add(new Producto(2, 100.25));
        lista.add(new Producto(3, 5.10));

        System.out.println("Primera lista" + lista);

        // Ordenar usando el Comparator externo por id de Producto
        Collections.sort(lista);
        System.out.println("Orden por id:" + lista);

        // Orden con el comparador externo por precio
        Collections.sort(lista, new CompararPorPrecio());
        System.out.println("Orden por precio: " + lista);
    }
}*/