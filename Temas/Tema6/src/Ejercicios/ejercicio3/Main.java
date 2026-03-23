package Ejercicios.ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // crear array
        ArrayList<Vehicle> numerovehiculos = new ArrayList<>();

        // crear vehiculos
        numerovehiculos.add(new Car("1111-AAA", "Seat", 2023, FuelType.DIESEL, 5));
        numerovehiculos.add(new Motorcycle("2222-BBB", "Honda", 2024, FuelType.GASOLINE, true));
        numerovehiculos.add(new Car("3333-CCC", "Toyota", 2025, FuelType.DIESEL, 5));
        numerovehiculos.add(new Car("444-DDD)", "Nissan", 2023, FuelType.HYBRID, 5));

        // recorrer el array
        System.out.println("lista de vehiculos");
        for (Vehicle v : numerovehiculos) {
            System.out.println(v.getVehicleInfo());
        }

        //get total vehiculos
        int total = Vehicle.getTotalVehicles();
        System.out.println("Total de vehiculos: " + total);
    }
}