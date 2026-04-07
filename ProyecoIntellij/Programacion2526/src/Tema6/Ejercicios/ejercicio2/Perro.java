package Tema6.Ejercicios.ejercicio2;

public class Perro extends AnimalBase implements Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau");
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo");
    }
}
