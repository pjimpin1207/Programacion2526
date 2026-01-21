package Alquilervehiculos;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("8564-CDB", "Nissan", 2020, 45.0f, TipoVehiculo.COCHE);
        Vehiculo vehiculo2 = new Vehiculo("8921-FGT", "yamaha", 2010, 25.5f, TipoVehiculo.MOTO);
        Vehiculo vehiculo3 = new Vehiculo("0257-FET", "Mercedes", 2015, 60.0f, TipoVehiculo.FURGONETA);

        Vehiculo vehiculo4 = new Vehiculo();
        vehiculo4.matricula = "8654-TJD";
        vehiculo4.marca = "Audio";
        vehiculo4.anioFabricacion = 2025;
        vehiculo4.precioDia = 200.0f;
        vehiculo4.tipo = TipoVehiculo.COCHE;

        System.out.println("Lista de vehiculos");
        v1.mostrarDatos();
        v2.mostrarDatos();
        v3.mostrarDatos();
        v4.mostrarDatos();

    }
}