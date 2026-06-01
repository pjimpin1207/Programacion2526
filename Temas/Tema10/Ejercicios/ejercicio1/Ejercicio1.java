package Tema10.Ejercicios.ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ejercicio1 {
    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;

    // POJO
    public Ejercicio1() {
    }

    // Constructor con parámetros
    public Ejercicio1(String nombre, LocalDate fecha, BigDecimal recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "EventoMusical [Nombre: " + nombre + ", Fecha: " + fecha + ", Recaudación: " + recaudacion + "€]";
    }
}