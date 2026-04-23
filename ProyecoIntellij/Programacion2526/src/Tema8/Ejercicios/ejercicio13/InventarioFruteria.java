package Tema8.Ejercicios.ejercicio13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InventarioFruteria {
    public static void main(String[] args) {
        // crear mapa
        Map<String , Integer> inventario = new HashMap<>();

        // añadir datos al inventario
        inventario.put("Manzanas",50);
        inventario.put("Plátanos", 20);
        inventario.put("Naranjas", 35);
        inventario.put("Peras", 12);

        // consulta
        System.out.println("Cantidad de naranjas: " + inventario.get("Naranjas"));

        //actualizacion
        inventario.put("Manzanas",100);
        System.out.println("Cantidad de manzanas actualizadas: " + inventario.get("Manzanas"));

        // verificacion
        if (inventario.containsKey("Mangos")) {
            System.out.println("Hay mangos en el inventario");
        }else {
            System.out.println("No se han encontrado mangos");
        }

        // recorrido final
        for (String fruta : inventario.keySet()) {
            System.out.println("Fruta: " + fruta);
        }

        // com iterador
        Iterator<String> itFrutas = inventario.keySet().iterator();
        while (itFrutas.hasNext()) {
            String fruta = itFrutas.next();
            Integer cantidad = inventario.get(fruta);
            System.out.println(fruta + ": " + cantidad);
        }
    }
}

/* Preguntas
 1. Después de actualizar el número de "Manzanas", ¿aparecen dos entradas diferentes o se ha sobrescrito la anterior? ¿Por qué crees que ocurre esto?
 Se ha sobrescrito la anterior porque en un HashMap y las claves son únicas. Al usar .put con la clave "Manzanas", busca si ya existe, como ya estaba, simplemente cambia el valor viejo (50) por el

 2. ¿Qué pasaría si intentas usar un número entero (int) como clave en lugar de un String?
 Funcionaría siempre que usemos el tipo envoltorio Integer porque las colecciones no aceptan tipos primitivos como el int

 3. ¿Por qué es más eficiente usar un Map que un ArrayList para este caso específico?
Por la velocidad de la búsqueda, en un ArrayList si hay miles de productos, el programa tiene que mirar uno por uno hasta que lo encuentra, en cambio el Map va directo a la posición de la clave
 */
