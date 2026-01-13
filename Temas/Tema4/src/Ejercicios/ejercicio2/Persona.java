package Ejercicios.ejercicio2;

public class Persona {

    String nombre;
    int edad;
    float estatura;

    // Constructor sin parámetros
    public Persona() {
        nombre = "anónimo";
        edad = 18;
        estatura = 1.70f;
    }

    // Constructor que incluye solo el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        edad = 18;
        estatura = 1.70f;
    }

    // Constructor con todos los parámetros
    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    //Constructor con el apellido
    public Persona(String nombre, String apellido, int edad, float estatura) {
        this(nombre + " " + apellido, edad, estatura);
    }


    @Override
    public String toString() {
        return "Persona: Nombre = " + nombre + ", edad = " + edad + ", estatura = " + estatura + "]";
    }
}
