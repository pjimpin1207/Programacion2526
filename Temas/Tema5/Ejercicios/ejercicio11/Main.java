package Ejercicios.ejercicio11;

public class Main {
    public static void main(String[] args) {
        // Creamos tres objetos Libro. Dos de ellos tendrán el mismo ISBN para probar el equals()
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "111-222-333", 1605);
        Libro libro2 = new Libro("1984", "George Orwell", "999-888-777", 1949);
        Libro libro3 = new Libro("El Quijote (Edición Especial)", "Miguel de Cervantes", "111-222-333", 2015);

        // Imprime cada libro (esto usa automáticamente el método toString)
        System.out.println("Lista de Libros");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println();

        // Compara libros usando equals()
        System.out.println("--- Comparaciones ---");

        // Compara dos libros con el MISMO ISBN
        System.out.println("¿Libro 1 y Libro 3 son iguales? (Mismo ISBN): " + libro1.equals(libro3));

        // Compara dos libros con DISTINTO ISBN
        System.out.println("¿Libro 1 y Libro 2 son iguales? (Distinto ISBN): " + libro1.equals(libro2));
    }
}