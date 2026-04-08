package Ejercicios.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasHechas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();

        boolean puedeSalir = (!llueve && tareasHechas) || irBiblioteca;
        System.out.println("¿Puedes salir a la calle? " + puedeSalir);
    }
}
