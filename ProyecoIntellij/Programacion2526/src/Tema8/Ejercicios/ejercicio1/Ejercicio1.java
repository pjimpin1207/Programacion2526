package Tema8.Ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear una lista sin ninguna referencia (nula)
        List lista = null;
        System.out.println("Lista sin ninguna referencia: " + lista);

        //Asignarle una nueva lista vacía que sea una instancia de la clase ArrayList
        lista = new ArrayList<>();
        System.out.println("Lista vacia con instancia de la clase ArrayList" +lista);

        // Añadir 3 personas (tipo Persona) en la lista
        lista.add(new Persona("Ana", 25));
        lista.add(new Persona("David", 20));
        lista.add(new Persona("Juan", 34));

        // Obtener la última persona de la lista e imprimirla por consola
        System.out.println("Última persona de la lista: " + lista.getLast());

        //Modfica el nombre de la primera persona de la lista
        ((Persona)lista.getFirst()).setNombre("Manuel");
        System.out.println("Lista después de modificar el nombre de la primera persona: " + lista);

        //Elimina de la lista la persona que ocupa la posición central
        lista.remove(lista.remove(1));
        System.out.println("Lista después de eliminar la persona central: " + lista);

        //Recorre la lista con un for clásico (usándo índice) imprimiendo el nombre de cada persona
        for (int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        //Crea una nueva persona, añádela a la lista y pregunta si la lista contiene a esa persona recien creada para confirmarlo
        Persona nuevaPersona = new Persona("Carlos", 50);
        lista.add(nuevaPersona);
        System.out.println("¿La lista contiene a la nueva persona? " + lista.contains(nuevaPersona));

        //Vacía la lista y pregunta si está vacía para confirmarlo
        lista.clear();
        System.out.println("¿La lista está vacía? " + lista.isEmpty());
    }


}