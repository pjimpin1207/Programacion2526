package Tema8.Examen;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> codigos = Arrays.asList(1024, 2048, 1024, 3050, 2048, 4096, 1024);
        System.out.println("Entrada: " + codigos);

        // obtener los códigos únicos
        Set<Integer> codigosUnicos = obetenerCodigosUnicos(codigos);
        System.out.println("Final: " + codigosUnicos);
    }

    public static Set<Integer> obetenerCodigosUnicos(Collection<Integer> codigos) {
        return new HashSet<>(codigos);
    }
}

// HashSet porque no importa el orden de inserción y es capaz de leer rapidamente
