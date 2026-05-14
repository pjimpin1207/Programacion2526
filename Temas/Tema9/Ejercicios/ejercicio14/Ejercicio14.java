package Tema9.Ejercicios.ejercicio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {
    public static void main(String[] args) {


        // crear mochila
        List<Item> mochila = new ArrayList<>();
        mochila.add(new Item("Manzanas", 2.3, 50));
        mochila.add(new Item("Pizza", 3.5, 25));
        mochila.add(new Item("Patatas", 7.5, 7));
        mochila.add(new Item("Macarrones", 1.2, 3));
        mochila.add(new Item("Queso", 0.4, 10));

        try {
            // crear fichero
            FileOutputStream fichero = new FileOutputStream("mochila.bin");
            ObjectOutputStream out = new ObjectOutputStream(fichero);
            out.writeObject(mochila);
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
