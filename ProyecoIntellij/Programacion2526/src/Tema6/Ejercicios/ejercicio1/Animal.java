package Tema6.Ejercicios.ejercicio1;

abstract class Animal {
    public abstract void hacerSonido();
    public abstract void moverse();

    public void mostrarInfo() {
        System.out.println("Este es un animal de la clase: " + this.getClass().getSimpleName());
    }
}