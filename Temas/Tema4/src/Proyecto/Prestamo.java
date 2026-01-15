package Proyecto;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private int diasPrestamo;

    // Constructor
    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;

        // Cambiar el estado del libro
        libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }

    // Mostrar detalles del préstamo
    public void mostrarDetalle() {
        System.out.println("DETALLE DEL PRÉSTAMO");
        libro.mostrarInformacion();
        System.out.println("Usuario:");
        usuario.mostrarDatos();
        System.out.println("Días de préstamo: " + diasPrestamo);
    }

    // Marcar el préstamo como retrasado
    public void marcarRetraso() {
        libro.cambiarEstado(EstadoPrestamo.RETRASADO);
    }
}
