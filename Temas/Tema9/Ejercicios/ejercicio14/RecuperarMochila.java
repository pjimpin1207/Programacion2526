package Tema9.Ejercicios.ejercicio14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class RecuperarMochila {
    public static void main(String[] args) {
        try {
            // acceder al fichero
            FileInputStream fichero =  new FileInputStream(("mochila.bin"));
            // crear el flujo de lectura
            ObjectInputStream in = new ObjectInputStream(fichero);
            // leer el objeto
            List<Item> mochilaRecuperada = (List<Item>) in.readObject();

            // recorrer lista
            int valorTotal = 0;
            for (Item i : mochilaRecuperada) {
                valorTotal += i.getValor();
            }

            System.out.println(mochilaRecuperada);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}