package Tema5.Examen.biblioteca.model;

import Tema5.Examen.biblioteca.util.ContadorItems;

public abstract class ItemBiblioteca {
    protected String id;
    protected String titulo;
    protected int anioPublicacion;

    public ItemBiblioteca(String id, String titulo, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        ContadorItems.totalItems++;
    }

    public abstract String obtenerDescripcion();

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo;
    }
}
