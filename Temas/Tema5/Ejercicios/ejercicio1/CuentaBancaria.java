package Ejercicios.ejercicio1;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter del titular
    public String getTitular() {
        return titular;
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Ingresar dinero solo si es positivo
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Retirar dinero si hay saldo suficiente
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
}
