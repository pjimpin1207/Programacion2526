package Ejercicios.ejercicio7;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Coche, Puertas: " + numPuertas);
    }

    @Override
    public void mover() {
        System.out.println("El coche conduce por la carretera.");
    }
}