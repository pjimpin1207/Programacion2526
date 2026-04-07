package Tema6.Ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Animal[] misAnimales = { new Perro(), new Gato(), new Pajaro(), new Pez() };

        for (Animal a : misAnimales) {
            a.mostrarInfo();
            a.hacerSonido();
            a.moverse();

            // Comprobamos interfaces usando instanceof (UD 5)
            if (a instanceof Corredor) { ((Corredor) a).correr(); }
            if (a instanceof Volador) { ((Volador) a).volar(); }
            if (a instanceof Nadador) { ((Nadador) a).nadar(); }

            System.out.println("--------------------");
        }
    }
}
