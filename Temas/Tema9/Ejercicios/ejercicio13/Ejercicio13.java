package Tema9.Ejercicios.ejercicio13;

import java.io.*;

public class Ejercicio13 {
    public static void main(String[] args) throws FileNotFoundException {
        // crear persona
        Persona famoso = new Persona("Ronaldo");

        // serializar
        try {
            // crear fichero
            FileOutputStream fichero = new FileOutputStream("persona.dat");
            ObjectOutputStream out = new ObjectOutputStream(fichero);
            out.writeObject(famoso);
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserializar
        try {
            // acceder al fichero
            FileInputStream fichero =  new FileInputStream(("persona.dat"));
            // crear el flujo de lectura
            ObjectInputStream in = new ObjectInputStream(fichero);
            // leer el objeto
            Persona personaDeserializada = (Persona) in.readObject();
            // cerrar flujo
            in.close();
            // resultado
            System.out.println("Nombre: " + personaDeserializada.getNombre());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
