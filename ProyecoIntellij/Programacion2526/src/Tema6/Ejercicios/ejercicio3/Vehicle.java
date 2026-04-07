package Tema6.Ejercicios.ejercicio3;

public abstract class Vehicle implements Maintenance {
    private String licensePlate;
    private String brand;
    private int year;
    private FuelType fuelType;
    private static int vehicleCount = 0;

    public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++;
    }

    // metodo abstracto
    public abstract double calculateSpeed();

    public String getVehicleInfo() {
        return brand + " (" + licensePlate + ")";
    }
    // metodo para obtener el total
    public static int getTotalVehicles() {
        return vehicleCount;
    }



    // getters y setters
    public String getLicensePlate() {
        return licensePlate;
    }
    public String getBrand() {
        return brand;
    }

    // sobreescribir
    @Override
    public String nextMaintenanceDate() {
        return String.valueOf(year);
    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + ", Plate: " + licensePlate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else {
            if (this.licensePlate.equals(((Vehicle) obj).licensePlate))
                return true;
            else
                return false;

        }


    }
}