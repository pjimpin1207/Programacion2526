package Alquilervehiculos;

class Vehiculo {
    String matricula;
    String marca;
    Integer anioFrabricacion;
    Float precioDia;
    TipoVehiculo tipo;


    // Constructores
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, Integer anioFrabricacion, Float precioDia, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioFrabricacion = anioFrabricacion;
        this.precioDia = precioDia;
        this.tipo = tipo;
    }


    // Metodos

    void mostrarDatos(String matricula, String marca, Integer anioFabricacion, Float precioDia, TipoVehiculo tipo) {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Anio Frabricacion: " + anioFabricacion);
        System.out.println("Precio Dia: " + precioDia);
        System.out.println("Tipo: " + tipo);

    }


    boolean esAntiguo() {
        int anioActual = 2026;
        return (anioActual - this.anioFabricacion) > 10;
    }
}
