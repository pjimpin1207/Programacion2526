package Ejercicios.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try {
            int dividiendo = 5;
            int divisor= 0;
            System.out.println("Resultado: " + dividiendo/divisor);
        } catch (ArithmeticException ex) {
            System.out.println("Imposible dividir por 0");
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }
}

// 3. Mostrar la traza del error
// ex.printStackTrace();

//4. Pedir datos al usuario, ¿dónde se cerraría el flujo?
// Si se usa el scanner para pedir los datos, el flujo deberia cerrarse en el finally

// 5. ¿Qué pasa si el usuario introduce letras?
// Como solo tiene una exepcion para la división el programa se pararia y mostraria un error.

// 6. ¿Prevenirla o gestionarla?
// Deberia prevenirla con un if (divisor != 0)