package Tema8.Ejercicios.Ejercicio1;

public class Persona {
    // Atributos privados (Encapsulación)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // --- MÉTODOS GETTER Y SETTER ---

    // Permite obtener el nombre desde fuera de la clase
    public String getNombre() {
        return nombre;
    }

    // Permite modificar el nombre desde fuera de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Permite obtener la edad
    public int getEdad() {
        return edad;
    }

    // Permite modificar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString para que al imprimir la lista se vean los datos y no la referencia [cite: 280]
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}