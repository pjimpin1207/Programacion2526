package Ejercicios.ejercicio3;

public class Concesionario {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2020, TipoVehiculo.TURISMO);
        Vehiculo v2 = new Vehiculo("Yamaha", "MT-07", 2022, TipoVehiculo.MOTOCICLETA);
        Vehiculo v3 = new Vehiculo("Volvo", "FH", 2019, TipoVehiculo.CAMION);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}

