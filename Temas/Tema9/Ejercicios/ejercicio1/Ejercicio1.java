package Tema9.Ejercicios.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 4 caracteres");

        String entradaCaracteres = sc.next();

        char c1 = entradaCaracteres.charAt(0);
        char c2 = entradaCaracteres.charAt(1);
        char c3 = entradaCaracteres.charAt(2);
        char c4 = entradaCaracteres.charAt(3);

        // imprimir con write
        System.out.write(c1);
        System.out.flush();


        // imprimir el segundo con print sin saltar de linea
        System.out.print(c2);

        // imprimir el tercero con println
        System.out.println(c3);

        // imprimir el cuarto con printf
        System.out.printf("%c", c4);
    }
}