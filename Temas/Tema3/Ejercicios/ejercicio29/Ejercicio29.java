package Ejercicios.ejercicio29;

public class Ejercicio29 {
    public static void main(String[] args) {

        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = tabla * i;
                System.out.println(tabla + " x " + i + " = " + resultado);
            }
            System.out.println();
        }
    }
}
