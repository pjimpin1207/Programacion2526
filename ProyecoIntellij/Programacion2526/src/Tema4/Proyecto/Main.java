package Proyecto;

public class Main {

    public static void main(String[] args) {

        // Crear los libros
        Libro libro1 = new Libro("111", "El Quijote", "Cervantes", 1605, EstadoPrestamo.DISPONIBLE);

        // Crear usuarios
        Usuario usuario1 = new Usuario("12345678A", "Angustias", 58);

        // Mostrar información inicial
        System.out.println("ESTADO INICIAL");
        libro1.mostrarInformacion();
        System.out.println();

        // Realizar un préstamo
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, 15);

        // Comprobar referencia
        System.out.println("\nDESPUÉS DEL PRÉSTAMO");
        libro1.mostrarInformacion();

        // Mostrar los detalle del préstamo
        System.out.println();
        prestamo1.mostrarDetalle();

        // Marcar retrasos
        prestamo1.marcarRetraso();

        // Estado despues de marcar el retraso
        System.out.println("\nDESPUES DE MARCAR RETRASO");
        libro1.mostrarInformacion();
    }
}
