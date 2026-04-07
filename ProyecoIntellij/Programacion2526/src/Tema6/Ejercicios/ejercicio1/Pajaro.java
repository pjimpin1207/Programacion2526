package Tema6.Ejercicios.ejercicio1;

class Pajaro extends Animal implements Volador {
    @Override
    public void hacerSonido() { System.out.println("El pájaro pía: ¡Pío!"); }
    @Override
    public void moverse() { System.out.println("El pájaro vuela de rama en rama."); }
    @Override
    public void volar() { System.out.println("El pájaro extiende sus alas y vuela."); }
}
