package Proyecto;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int annoPublicacion;
    private EstadoPrestamo estado;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int annoPublicacion, EstadoPrestamo estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annoPublicacion;
        this.estado = estado;
    }

    // Mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + annoPublicacion);
        System.out.println("Estado: " + estado);
    }

    // Indica si el libro es antiguo (+20 años)
    public boolean esAntiguo() {
        return (2024 - annoPublicacion) > 20;
    }

    // Cambiar estado del libro
    public void cambiarEstado(EstadoPrestamo nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getter paara las comprobaciones
    public EstadoPrestamo getEstado() {
        return estado;
    }
}
