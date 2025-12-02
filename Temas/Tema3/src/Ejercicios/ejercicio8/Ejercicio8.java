package Ejercicios.ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Ejemplo 1
        boolean Ejemplo1 = 3 <= 5 && 2 == 2;
        System.out.println("3 <= 5 && 2 == 2 = " + Ejemplo1);

        // Ejemplo 2
        boolean Ejemplo2 = 3 <= 5 && 2 > 10;
        System.out.println("3 <= 5 && 2 > 10 = " + Ejemplo2);

        // Ejemplo 3
        boolean Ejemplo3 = 1 != 2 || 5 < 3;
        System.out.println("1 != 2 || 5 < 3 = " + Ejemplo3);

        // Ejemplo 4
        boolean Ejemplo4 = !(1 < 2);
        System.out.println("!(1 < 2) = " + Ejemplo4);

        // Evaluación perezosa
        boolean Ejemplo5 = true || (5 < 3);
        System.out.println("true || (5 < 3) = " + Ejemplo5);

        boolean Ejemplo6 = false && (5 < 3);
        System.out.println("false && (5 < 3) = " + Ejemplo6);
    }
}
