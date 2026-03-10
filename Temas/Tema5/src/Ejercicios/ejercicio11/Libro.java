package Ejercicios.ejercicio11;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año de publicación: " + anioPublicacion;
    }

    // Sobrescribir el método equals() para comparar por ISBN
    @Override
    public boolean equals(Object obj) {
        // Comprobar si es exactamente el mismo objeto en memoria
        if (this == obj) {
            return true;
        }
        // Comprobar si el objeto pasado es nulo o si no es de la clase Libro
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Hacer el casting a Libro y comparar los ISBN
        Libro libro = (Libro) obj;
        return Objects.equals(this.isbn, libro.isbn);
    }
}