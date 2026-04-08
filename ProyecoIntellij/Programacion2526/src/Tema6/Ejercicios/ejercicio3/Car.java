package Tema6.Ejercicios.ejercicio3;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String lp, String b, int y, FuelType ft, int doors) {
        super(lp, b, y, ft);
        this.numberOfDoors = doors;
    }

    @Override
    public double calculateSpeed() {
        return 120.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "2024-12-01";
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}