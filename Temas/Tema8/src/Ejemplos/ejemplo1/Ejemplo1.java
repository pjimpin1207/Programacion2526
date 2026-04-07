package Ejemplos.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();

        lista.add(7);
        lista.add(2);
        lista.add(7);
        lista.add(5);

        System.out.println(lista);

        int[] array = new int[4];
        array[0] = 7;
        array[0] = 2;
        array[0] = 7;
        array[0] = 5;
        System.out.println(array);

    }
}
