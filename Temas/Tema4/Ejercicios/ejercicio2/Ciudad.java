package Ejercicios.ejercicio2;

public class Ciudad {

    public static void main(String[] args) {

        Persona pepe = new Persona();
        Persona paco = new Persona("Paco");

        Persona ana = new Persona("Ana", 22, 1.65f, Sexo.MUJER);
        Persona juan = new Persona("Juan", "Pérez", 30, 1.80f, Sexo.HOMBRE);

        System.out.println(pepe);
        System.out.println(paco);
        System.out.println(ana);
        System.out.println(juan);
    }
}
