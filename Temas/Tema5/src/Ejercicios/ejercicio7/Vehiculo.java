package Ejercicios.ejercicio7;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarDetalles() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + anio + ")");
    }

    public void mover() {
        System.out.println("El vehículo se está desplazando genéricamente.");
    }
}