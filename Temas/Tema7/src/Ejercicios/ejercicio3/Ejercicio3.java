package Tema7.Ejercicios.ejercicio3;

public class Ejercicio3 {
    private String nombre;
    private int edad;

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa: " + edad);
        }
        this.edad = edad;
    }
}