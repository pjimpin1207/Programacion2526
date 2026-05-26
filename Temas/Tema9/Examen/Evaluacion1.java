package Tema9.Examen;

import java.util.Scanner;
public class Evaluacion1 {
    public static void main(String[] args) {
// 1. Crea el objeto Scanner asociado a la entrada estándar
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
// 2. Lee el número entero introducido por el usuario
        int edad = teclado.nextInt();
// 3. Muestra por pantalla el resultado añadiendo un salto de línea al final
        System.out.println("El año que viene tendrás: " + (edad + 1));
        teclado.close();
    }
}