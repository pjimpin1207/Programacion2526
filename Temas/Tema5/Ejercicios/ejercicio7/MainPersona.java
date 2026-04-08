package Ejercicios.ejercicio7;

public class MainPersona {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA ALUMNO ---");
        // Crear alumno con constructor por defecto
        Alumno a1 = new Alumno();

        // Dar nombre y edad directamente
        a1.nombre = "Pepe";
        a1.edad = 20;

        // Método heredado
        a1.presentarse();


        System.out.println("\nPrueba de constructor y de super");
        Alumno a2 = new Alumno("Maria", 22, "DAW");
        a2.estudiar();
        a2.presentarse();

        System.out.println("\nPrueba de empleado");
        Empleado e1 = new Empleado("Luis", 45, 2500.50);
        e1.mostrarDatos();
    }
}