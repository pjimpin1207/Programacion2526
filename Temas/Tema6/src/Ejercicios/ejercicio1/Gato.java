package Ejercicios.ejercicio1;

class Gato extends Animal implements Corredor {
    @Override
    public void hacerSonido() { System.out.println("El gato maúlla: ¡Miau!"); }
    @Override
    public void moverse() { System.out.println("El gato salta y se estira."); }
    @Override
    public void correr() { System.out.println("El gato corre ágilmente."); }
}
