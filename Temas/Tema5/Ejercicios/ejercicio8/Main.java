package Ejercicios.ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear array de empleado
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Añadir usuarios
        listaEmpleados.add(new EmpleadoFijo("Ana García", 2000.0));
        listaEmpleados.add(new EmpleadoPorHoras("Luis Pérez", 40, 15.5));
        listaEmpleados.add(new EmpleadoComision("Sofia Martinez", 50000.0, 0.05));

        System.out.println("Listado de nominas inicial");
        imprimirNominas(listaEmpleados);

        System.out.println("\nAplicando la subida salarial del 10%");
        // Aplicar la subida
        for (Empleado e : listaEmpleados) {
            e.aumentarSalario(10);
        }
        imprimirNominas(listaEmpleados);
    }

    // Metodo para recorrer y mostrar
    public static void imprimirNominas(ArrayList<Empleado> empleados) {
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }
    }
}