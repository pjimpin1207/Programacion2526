package Tema10.Ejemplos.ejemplo1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Marcamos la clase como una entidad persistente para ObjectDB
@Entity
public class Coche implements Serializable {
    private static final long serialVersionUID = 1L;

    // Definimos la clave primaria con estrategia de autoincremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String color;

    // Requisito POJO: Constructor sin parámetros indispensable para JPA
    public Coche() {
        super();
    }

    // Constructor parametrizado para facilitar la creación de instancias
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Métodos Getter y Setter siguiendo las convenciones de código de Java
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Coche [ID=" + id + ", Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + "]";
    }
}