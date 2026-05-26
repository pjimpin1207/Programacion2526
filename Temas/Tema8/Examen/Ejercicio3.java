package Tema8.Examen;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
    public static void main(String[] args) {
        // crear Map
        Map<String, Integer> diccionario = new HashMap<>();

        // insertar palabras
        diccionario.put("Java", 12);
        diccionario.put("Programación", 8);
        diccionario.put("Código", 15);

        // diccionario inicial
        System.out.println("Diccionario inicial: " + diccionario);

        // insertar repetido con otro valor
        diccionario.put("Java", 20);

        System.out.println("Diccionario duplicando Java: " + diccionario);
        System.out.println("Frecuencia de Java: " + diccionario.get("Java"));
    }
}

// He elegido HashMap porque permite consultar la frecuencia de cualquier palabra
