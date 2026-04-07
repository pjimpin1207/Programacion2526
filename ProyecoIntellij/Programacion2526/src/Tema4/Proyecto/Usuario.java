package Proyecto;

public class Usuario {

    private String dni;
    private String nombre;
    private int edad;

    // Constructor
    public Usuario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Mostrar datos del usuario
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
