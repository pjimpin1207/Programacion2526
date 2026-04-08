package Ejercicios.ejercicio2;

import Humano.Sexo;

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    private float estatura;
    private Sexo sexo;

    // Constructor sin parámetros
    public Persona() {
        this.nombre = "anónimo";
        this.edad = 18;
        this.estatura = 1.70f;
        this.sexo = Sexo.HOMBRE;
    }

    // Constructor con nombre
    public Persona(String nombre) {
        setNombre(nombre);
        this.edad = 18;
        this.estatura = 1.70f;
        this.sexo = Sexo.MUJER;
    }

    // Constructor con todos los parámetros (sin sexo)
    public Persona(String nombre, int edad, float estatura) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
        this.sexo = Sexo.HOMBRE;
    }

    // Constructor con apellido
    public Persona(String nombre, String apellido, int edad, float estatura) {
        this(nombre + " " + apellido, edad, estatura);
    }

    // Constructor con sexo
    public Persona(String nombre, int edad, float estatura, Sexo sexo) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
        setSexo(sexo);
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    // SETTERS (con validaciones)
    public void setNombre(String nombre) {
        // Verificamos que no sea nulo y que tenga al menos un caracter
        if (nombre != null && nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public void setEstatura(float estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        }
    }

    public void setSexo(Sexo sexo) {
        if (sexo != null) {
            this.sexo = sexo;
        }
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", sexo=" + sexo + "]";
    }
}