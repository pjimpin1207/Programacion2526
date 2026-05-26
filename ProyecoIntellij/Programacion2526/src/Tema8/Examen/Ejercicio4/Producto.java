package Tema8.Examen.Ejercicio4;

// Comparable para definir el orden por defecto
public class Producto implements Comparable<Producto> {
    private int id;
    private double precio;

    public Producto(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.id, otro.id);
    }

    // Getters para el comparator externo
    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: ID=" + id + ", Precio=" + precio + "€";
    }
}