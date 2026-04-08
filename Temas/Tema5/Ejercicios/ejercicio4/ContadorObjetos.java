package Ejercicios.ejercicio4;

 class ContadorObjetos {
    // Atributo estático
    private static int totalObjetos = 0;

    // Constructor
    public ContadorObjetos() {
        totalObjetos++;
    }

    // Metodo estatico
    static void mostrarTotalObjetos() {
        System.out.println("Número total de objetos creados hasta el momento: " + totalObjetos);
    }
}