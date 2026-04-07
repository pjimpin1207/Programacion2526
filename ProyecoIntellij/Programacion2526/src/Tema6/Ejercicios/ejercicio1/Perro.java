package Tema6.Ejercicios.ejercicio1;

class Perro extends Animal implements Corredor {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }
    @Override
    public void moverse() {
        System.out.println("El perro se mueve por el suelo.");
    }
    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}
