package Tema8.Ejercicios.ejercicio14;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // crear los maps
        Map<String, Integer> aleatorio = new HashMap<>();
        Map<String, Integer> insercion = new LinkedHashMap<>();
        Map<String, Integer> alfabetico = new TreeMap<>();

        // crear los datos
        String[] nombres = {"Andres", "Juan", "Ana", "Mario"};
        int[] notas = {85, 92, 78, 88};

        for (int i = 0; i < nombres.length; i++) {
            aleatorio.put(nombres[i], notas[i]);
            insercion.put(nombres[i], notas[i]);
            alfabetico.put(nombres[i], notas[i]);
        }

        // mostrarlos
        mostrarMapa(aleatorio, "HASHMAP");
        mostrarMapa(insercion, "LINKEDHASHMAP");
        mostrarMapa(alfabetico, "TREEMAP");
    }

    // Método genérico para recorrer Map con un Iterator
    public static void mostrarMapa(Map<String, Integer> mapa, String tipo) {
        System.out.println("\n" + tipo);

        // Obtener el iterador
        Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entrada = it.next();
            System.out.println("Participante: " + entrada.getKey() + " | Puntos: " + entrada.getValue());
        }
    }
}

/*

 1. ¿Qué ha pasado en el HashMap? ¿Los nombres aparecen en el orden en que los escribiste?
 No aparecen en el orden de escritura. Los nombres salen en un orden aleatorio porque HashMap organiza los elementos según el hashCode de la clave para ser más eficiente.

 2. ¿Qué ha pasado en el LinkedHashMap? ¿Se ha respetado el orden de llegada?
 Sí, en el LinkedHashMap los nombres aparecen exactamente en el mismo orden en que fueron insertados

 3. ¿Qué ha pasado en el TreeMap? ¿Cómo están ordenados los nombres (las llaves)?
 En el TreeMap los nombres aparecen ordenados alfabéticamente porque esta estructura ordena automáticamente las claves siguiendo su orden natural.

 4. Caso práctico: Si tuvieras que hacer una agenda telefónica, ¿cuál elegirías?
 Elegiría el TreeMap porque es la mejor opcion para una agenda ya que permite que los contactos estén siempre ordenados por nombre de la A a la Z

 */