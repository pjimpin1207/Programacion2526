package Tema6.Ejercicios.ejercicio3;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String lp, String b, int y, FuelType ft, boolean sidecar) {
        super(lp, b, y, ft);
        this.hasSidecar = sidecar;
    }

    @Override
    public double calculateSpeed() {
        return 90.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "2024-10-15";
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Sidecar: " + hasSidecar;
    }
}
