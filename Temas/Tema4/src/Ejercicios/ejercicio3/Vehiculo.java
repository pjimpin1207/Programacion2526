package Ejercicios.ejercicio3;

public class Vehiculo {

    String marca;
    String modelo;
    int anio;
    TipoVehiculo tipo;

    public Vehiculo(String marca, String modelo, int anio, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehículo [marca=" + marca + ", modelo=" + modelo + ", año=" + anio + ", tipo=" + tipo + "]";
    }
}

