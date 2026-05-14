package Tema9.Ejercicios.ejercicio14;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private Double peso;
    private int valor;

    // Constructor
    public Item(String nombre, double peso, int valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método toString para visualizar los datos fácilmente al recuperarlos
    @Override
    public String toString() {
        return "Item [Nombre: " + nombre + ", Peso: " + peso + "kg, Valor: " + valor + " monedas]";
    }
}
