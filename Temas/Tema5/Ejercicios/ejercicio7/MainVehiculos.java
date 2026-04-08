package Ejercicios.ejercicio7;

public class MainVehiculos {
    public static void main(String[] args) {
        // Crear objetos
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, 5);
        Motocicleta miMoto = new Motocicleta("Harley-Davidson", "Street 750", 2020, false);
        Camion miCamion = new Camion("Volvo", "FH16", 2023, 20.5);

        System.out.println("Detalles vehiculo");

        // Llamar a mostrarDetalles
        miCoche.mostrarDetalles();
        miMoto.mostrarDetalles();
        miCamion.mostrarDetalles();

        System.out.println("\nComprobando el movimiento");

        // Llamar a mover
        miCoche.mover();
        miMoto.mover();
        miCamion.mover();
    }
}