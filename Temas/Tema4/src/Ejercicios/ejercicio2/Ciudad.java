package Ejercicios.ejercicio2;

public class Ciudad {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", 21);
        persona1.nombre = "Pablo";
        persona1.edad = 21;

        Persona persona2 = new Persona("Luis", 22);
        persona2.nombre = "Luis";
        persona2.edad = 22;
        
        Persona persona3 = new Persona("Javier", 20);
        persona3.nombre = "Javier";
        persona3.edad = 20;

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println();

        System.out.println("Hola soy " + persona1.nombre + " y tengo " + persona1.edad + " años.");
        System.out.println("Hola soy " + persona2.nombre + " y tengo " + persona2.edad + " años.");
        System.out.println("Hola soy " + persona3.nombre + " y tengo " + persona3.edad + " años.");


    }
}