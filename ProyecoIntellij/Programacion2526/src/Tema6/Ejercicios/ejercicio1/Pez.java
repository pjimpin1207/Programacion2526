package Tema6.Ejercicios.ejercicio1;

class Pez extends Animal implements Nadador {
    @Override
    public void hacerSonido() { System.out.println("El pez hace burbujas: Glub."); }
    @Override
    public void moverse() { System.out.println("El pez nada por el agua."); }
    @Override
    public void nadar() { System.out.println("El pez está nadando."); }
}
