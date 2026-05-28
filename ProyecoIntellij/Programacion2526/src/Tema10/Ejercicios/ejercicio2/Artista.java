package Tema10.Ejercicios.ejercicio2;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Artista implements Serializable {
    private static  final long serialVersionUID = 1L;

    private String nombreArtistico;
    private int numeroIntegrantes;

    // Constructor vacío requerido
    public Artista() {
        super();
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