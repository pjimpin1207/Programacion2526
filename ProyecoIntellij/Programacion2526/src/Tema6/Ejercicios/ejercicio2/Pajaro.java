package Tema6.Ejercicios.ejercicio2;

public class Pajaro extends AnimalBase implements Volador{
    public Pajaro(String nombre) {
        super(nombre);
    }
    @Override
    public void comer() {
        System.out.println("El pajaro esta comiendo");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El pajaro hace pío pío");
    }

    @Override
    public void volar() {
        System.out.println("Pajaro volando");
    }
}