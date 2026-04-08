package Ejercicios.ejercicio7;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
        System.out.println("Se ha ejecutado el constructor vacío de Persona");
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Ejecutando constructor con parámetros de Persona");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy una Persona y me llamo " + nombre);
    }
}