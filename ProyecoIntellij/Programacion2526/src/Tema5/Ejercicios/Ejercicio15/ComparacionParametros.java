package Tema5.Ejercicios.Ejercicio15;

public class ComparacionParametros {
    public static void main(String[] args) {



    }
    public  static void modificarPrimitivo(int numero){
        numero = numero * 2;
        System.out.println("Dentro del metodo, numero = " + numero);
    }

    public static void modificarObjeto(StringBuilder texto) {
        texto.append(" modificado");
        System.out.println("Dentro del metodo, texto = " + texto);
    }
}
