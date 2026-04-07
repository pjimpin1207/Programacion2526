package Tema6.Ejercicios.ejercicio2;

public class Vaca extends AnimalBase implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace muuu");
    }

    public Vaca(String nombre) {
        super(nombre);
    }
    @Override
    public void comer() {
        System.out.println("La vaca esta comiendo");
    }
}
