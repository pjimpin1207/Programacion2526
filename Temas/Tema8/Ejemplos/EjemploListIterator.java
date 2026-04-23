package Tema8.Ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main() {
        List<String> l = new ArrayList<>();
        l.add("Hola");
        l.add("Hola1");
        l.add("Hola2");
        l.add("Hola3");
        // recorrer hacia adelante para que el ietrador se quede al final
        ListIterator<String> lit = l.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        // recorrer hacia atras
        if (lit.hasNext()) {
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
