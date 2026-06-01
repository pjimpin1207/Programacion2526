package Tema10.Ejercicios.ejercicio3;

import Tema10.Ejercicios.ejercicio2.Artista;
import Tema10.Ejercicios.ejercicio2.GeneroMusical;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoMusical {

    // Clave primaria que se incrementa de 10 en 10
    @Id
    @GeneratedValue(generator = "Secuencia10en10", strategy =  GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Secuencia10en10", allocationSize = 10)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;
    private GeneroMusical genero;
    private List<Artista> artistasConfirmados = new ArrayList<>();

    // Variable de control para la lógica interna del programa.
    private transient int control;

    // POJO
    public EventoMusical() {
    }

    // Constructor
    public EventoMusical(Long id, String nombre, LocalDate fecha, BigDecimal recaudacion, GeneroMusical genero, int control) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
        this.control = control;
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

    public int getControl() {
        return control;
    }
    public void setControl(int control) {
        this.control = control;
    }

    public void addArtista(Artista artista) {
        this.artistasConfirmados.add(artista);
    }

    @Override
    public String toString() {
        return "EventoMusical [ID (Incrementos de 10)=" + id + ", Nombre=" + nombre + ", Género=" + genero +
                ", Fecha=" + fecha + ", Recaudación=" + recaudacion + "€ | (Variable interna 'control'=" + control + ")]";
    }
}