package EjerciciosRefuerzo.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear tres objetos
        CuentaBancaria c1 = new CuentaBancaria("Ana Gómez", 1000.50);
        CuentaBancaria c2 = new CuentaBancaria("Pedro Ruiz", 500.00);
        CuentaBancaria c3 = new CuentaBancaria("Laura Díaz", 2500.75);

        // Mostrar datos de cada cuenta
        System.out.println("\nDatos de las cuentas");
        c1.mostrarDatos();
        c2.mostrarDatos();
        c3.mostrarDatos();

        // Mostrar  total con el método estático
        System.out.println("Total de cuentas creadas mediante el metodo estatico: " + CuentaBancaria.getTotalCuentas());

        // Comprobar si el contador es compartido
        System.out.println("\nComprobar variable compartida");
        CuentaBancaria c4 = new CuentaBancaria("VCompartida", 100);


    }
}

