package Tema8.Examen;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> pacientes = new ArrayList<>();
        pacientes.add("Juan");
        pacientes.add("Maria");
        pacientes.add("Pedro");

        System.out.println("Paciente en primera posición: " + obtenerPaciente(1, pacientes));
    }

    public static String obtenerPaciente(int n, List<String> pacientes) {
        return pacientes.get(n);
    }
}

//He elegido ArrayList porque permite acceso aleatorio que es mejor para obtener un elemento por su indice de forma instantanea