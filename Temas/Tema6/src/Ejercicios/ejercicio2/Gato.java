package Ejercicios.ejercicio2;

public class Gato  extends AnimalBase implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau");
    }

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println("El gato esta comiendo");
    }


}
