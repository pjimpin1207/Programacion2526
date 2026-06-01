package Tema10.Ejercicios.ejercicio2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoMusical implements Serializable {
    private static final long serialVersionUID = 1L;

    // Clave primaria necesaria para persistir en BD
    private Long id;

    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;

    // Campo restringido mediante el uso de la enumeración
    private GeneroMusical genero;

    // lista clase Artista
    private List<Artista> artistasConfirmados = new ArrayList<>();

    // constructor vacio
    public EventoMusical() {
    }

    // Constructor
    public EventoMusical(Long id, String nombre, LocalDate fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }
    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }
    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistasConfirmados() {
        return artistasConfirmados;
    }
    public void setArtistasConfirmados(List<Artista> artistasConfirmados) {
        this.artistasConfirmados = artistasConfirmados;
    }

    // Método para añadir artistas de forma cómoda
    public void addArtista(Artista artista) {
        this.artistasConfirmados.add(artista);
    }

    @Override
    public String toString() {
        return "EventoMusical [ID=" + id + ", Nombre=" + nombre + ", Género=" + genero +
                ", Fecha=" + fecha + ", Recaudación=" + recaudacion + "€\n Artistas=" + artistasConfirmados + "]";
    }
}