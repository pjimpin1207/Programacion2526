package Ejercicios.ejercicio2;

import java.util.ArrayList;

public class Main {
    public static  void main(String[] args) {
        ArrayList<AnimalBase> animales = new ArrayList<>();

        animales.add(new Perro("Perro1"));
        animales.add(new Gato("Gato1"));
        animales.add(new Vaca("Vaca1"));
        animales.add(new Pajaro("Pajaro1"));

        for (AnimalBase a : animales) {
            a.mostrarNombre();
            a.hacerSonido();
            a.comer();

            if (a instanceof Volador) {
                ((Volador) a).volar();
            }

        }
    }
}
