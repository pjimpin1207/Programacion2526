package Tema10.Ejercicios.ejercicio2;

public class Artista {
    private String nombreArtistico;
    private int numeroIntegrantes;

    // Constructor vacío requerido
    public Artista() {
    }

    public Artista(String nombreArtistico, int numeroIntegrantes) {
        this.nombreArtistico = nombreArtistico;
        this.numeroIntegrantes = numeroIntegrantes;
    }

    // Getters y Setters
    public String getNombreArtistico() {
        return nombreArtistico;
    }
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }
    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    @Override
    public String toString() {
        return nombreArtistico + " (" + numeroIntegrantes + " miembros)";
    }
}