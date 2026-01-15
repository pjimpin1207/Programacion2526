package Ejercicios.ejercicio2;

public class Persona {

    String nombre;
    int edad;
    float estatura;
    Sexo sexo;

    // Constructor sin parámetros
    public Persona() {
        nombre = "anónimo";
        edad = 18;
        estatura = 1.70f;
        sexo = Sexo.HOMBRE;
    }

    // Constructor que incluye solo el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        edad = 18;
        estatura = 1.70f;
        sexo = Sexo.MUJER;
    }

    // Constructor con todos los parámetros (SIN sexo)
    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        sexo = Sexo.HOMBRE;
    }

    // Constructor con apellido
    public Persona(String nombre, String apellido, int edad, float estatura) {
        this(nombre + " " + apellido, edad, estatura);
    }

    // NUEVO CONSTRUCTOR CON SEXO
    public Persona(String nombre, int edad, float estatura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
    }

    // NUEVO constructor nombre + apellido + sexo
    public Persona(String nombre, String apellido, int edad, float estatura, Sexo sexo) {
        this(nombre + " " + apellido, edad, estatura, sexo);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", sexo=" + sexo + "]";
    }
}
