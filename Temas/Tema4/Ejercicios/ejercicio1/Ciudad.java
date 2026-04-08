package Ejercicios.ejercicio1;

public class Ciudad {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", 21, 1.80f);
        persona1.nombre = "Pablo";
        persona1.edad = 21;

        Persona persona2 = new Persona("Francisco", 22, 1.60f);
        persona2.nombre = "Francisco";
        persona2.edad = 22;

        Persona persona3 = new Persona("Javier", 20, 1.90f);
        persona3.nombre = "Javier";
        persona3.edad = 20;

        Persona pepe = new Persona();
        Persona paco = new Persona();

        Persona ana = new Persona("Ana", 25, 1.65f);
        Persona luis = new Persona("Luis", 30, 1.80f);

        Persona juan = new Persona("Juan", "Pérez", 22, 1.75f);

        System.out.println(juan);

        System.out.println(pepe);
        System.out.println(paco);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println();

        System.out.println("Hola soy " + persona1.nombre + " y tengo " + persona1.edad + " años.");
        System.out.println("Hola soy " + persona2.nombre + " y tengo " + persona2.edad + " años.");
        System.out.println("Hola soy " + persona3.nombre + " y tengo " + persona3.edad + " años.");


    }
}