package Ejercicios.ejercicio7;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" -> Tipo: Moto, ¿Tiene Sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta avanza rápidamente entre el tráfico.");
    }
}