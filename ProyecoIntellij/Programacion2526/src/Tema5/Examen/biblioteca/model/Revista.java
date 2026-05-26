package Tema5.Examen.biblioteca.model;

public class Revista extends ItemBiblioteca {
    public int numero;
    public String periodicidad;

    public Revista(String id, String titulo, int anio, int numero, String periodicidad) {
        super(id, titulo, anio);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    @Override
    public String obtenerDescripcion() {
        return "revista numero " + numero;
    }
}
