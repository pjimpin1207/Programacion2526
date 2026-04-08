package Ejercicios.ejercicio7;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}