package Tema9.Ejercicios.ejercicio17;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {

        return nombre;
    }
    public String getDireccion() {

        return direccion;
    }
    public String getTelefono() {

        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', direccion='" + direccion + "', telefono='" + telefono + "'}";
    }
}