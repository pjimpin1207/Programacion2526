package EjerciciosRefuerzo.ejercicio1;

class CuentaBancaria {
    private String titular;
    private double saldo;
    private static int totalCuentas = 0;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

        // Incrementar el contador que se comparte
        totalCuentas++;
    }

    // Metodos
    void mostrarDatos() {
        System.out.println("Cuenta de: " + this.titular + " | Saldo: " + this.saldo + " €");
    }

    void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    // Metodo estatico
    static int getTotalCuentas() {
        return totalCuentas;
    }
}