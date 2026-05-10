package Tema9.Ejercicios.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntar nombre
        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();

        // Preguntar  los años
        System.out.println("¿Cuántos años crees que vivirás?");
        int añosExpectativa = sc.nextInt();

        // Respuesta del adivino
        int añosMuerte = añosExpectativa + 10;
        System.out.println("Hola " + nombre + ", los astros dicen que morirás a los "
                + añosMuerte + " por culpa de un café frío.");

        sc.close();
    }
}