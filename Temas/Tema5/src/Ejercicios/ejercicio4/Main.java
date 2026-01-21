package Ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // Mostrar  total inicial
        ContadorObjetos.mostrarTotalObjetos();

        // Crear objetos
        ContadorObjetos obj1 = new ContadorObjetos();
        ContadorObjetos obj2 = new ContadorObjetos();
        ContadorObjetos obj3 = new ContadorObjetos();

        // Utilizar el metodo estático
        ContadorObjetos.mostrarTotalObjetos();
    }
}