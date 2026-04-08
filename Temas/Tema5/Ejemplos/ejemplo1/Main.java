package Ejemplos.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Persona pablo = new Persona();
        Persona pablo2 =new Persona();
        System.out.println(pablo == pablo2);
        System.out.println(pablo.equals(pablo2));
    }
}
