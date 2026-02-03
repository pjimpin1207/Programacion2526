package Ejercicios.ejercicio7;

public class Alumno extends Persona {
    private String ciclo;

    // Constructor por defecto
    public Alumno() {
        super();
    }

    // Constructor completo usando super()
    public Alumno(String nombre, int edad, String ciclo) {
        super(nombre, edad); // Reutilizamos el constructor de Persona
        this.ciclo = ciclo;
    }

    public void estudiar() {
        System.out.println(this.nombre + " está estudiando el ciclo de " + this.ciclo);
    }

    // Sobrescritura del método presentarse
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Y además soy un Alumno del ciclo: " + ciclo);
    }
}