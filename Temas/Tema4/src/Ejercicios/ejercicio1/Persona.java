package Ejercicios.ejercicio1;

public class Persona {
    String nombre;
    int edad;
    double estatura;

    public void saludar(){
        System.out.println("Hola");
    }

    public void cumplirAnnos(){
        edad++;
    }

    public void crecer(double incremento){
        incremento = 0.50;
        estatura+=incremento;
    }
}